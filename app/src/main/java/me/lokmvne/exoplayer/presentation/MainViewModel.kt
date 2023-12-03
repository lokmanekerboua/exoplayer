package me.lokmvne.exoplayer.presentation

import android.net.Uri
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.media3.common.MediaItem
import androidx.media3.common.util.UnstableApi
import androidx.media3.datasource.DataSource
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.hls.HlsMediaSource
import androidx.media3.exoplayer.source.MediaSource
import androidx.media3.exoplayer.source.ProgressiveMediaSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import me.lokmvne.exoplayer.Channel
import me.lokmvne.exoplayer.data.model.CategoriesList
import me.lokmvne.exoplayer.data.model.ChannelsList
import me.lokmvne.exoplayer.repository.Repository
import me.lokmvne.exoplayer.utils.MetaDataReader
import me.lokmvne.exoplayer.utils.Resource
import javax.inject.Inject

@UnstableApi
@HiltViewModel
class MainViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    val player: ExoPlayer,
    private val metaDataReader: MetaDataReader,
    private val repository: Repository
) : ViewModel() {

    private val _categories = MutableStateFlow<Resource<CategoriesList>?>(null)
    val categories: StateFlow<Resource<CategoriesList>?> = _categories
    val isRefreshing = MutableStateFlow(false)

    fun getCategories() {
        viewModelScope.launch {
            isRefreshing.value = true
            val response = repository.getCategories()
            isRefreshing.value = false
            _categories.value = response
        }
    }

    private val _channels = MutableStateFlow<Resource<ChannelsList>?>(null)
    val channels: StateFlow<Resource<ChannelsList>?> = _channels

    fun getChannels(categoryId: String) {
        viewModelScope.launch {
            isRefreshing.value = true
            val response = repository.getChannels(categoryId)
            isRefreshing.value = false
            _channels.value = response
        }
    }


    //---------------------------exoPlayer---------------------------
    private val videoUris = savedStateHandle.getStateFlow("videoUris", emptyList<Uri>())

    val videoItems = videoUris.map { uris ->
        uris.map { uri ->
            Channel(
                contentUri = uri,
                mediaItem = MediaItem.fromUri(uri),
                logo = "https://res.cloudinary.com/dmujoqmoq/image/upload/v1695481963/samples/channelslogo/pngwing.com_w3l1jo.png",
                name = metaDataReader.getMetaDataFromUri(uri)?.fileName ?: "no Name"
            )
        }
    }.stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun addVideoUri(uri: Uri) {
        savedStateHandle["videoUris"] = videoUris.value + uri
        player.addMediaItem(MediaItem.fromUri(uri))
    }

    init {
        player.prepare()
        player.playWhenReady = true
        getCategories()
    }

    fun playVideo(uri: Uri) {
        val dataSourceFactory: DataSource.Factory = DefaultHttpDataSource.Factory()
        val hlsMediaSource =
            HlsMediaSource.Factory(dataSourceFactory).createMediaSource(MediaItem.fromUri(uri))

        player.setMediaSource(hlsMediaSource)
        player.prepare()
        player.play()
    }

    fun playStreemVideo(uri: Uri) {
        val dataSourceFactory: DataSource.Factory = DefaultHttpDataSource.Factory()

        val mediaSource: MediaSource =
            ProgressiveMediaSource.Factory(dataSourceFactory)
                .createMediaSource(MediaItem.fromUri(uri))

        val mediaItem = MediaItem.Builder()
            .setUri(uri)
            .setMimeType("video/MP2T")
            .build()

        player.setMediaItem(mediaItem)
        player.prepare()
        player.play()
    }

    override fun onCleared() {
        super.onCleared()
        player.release()
    }
}