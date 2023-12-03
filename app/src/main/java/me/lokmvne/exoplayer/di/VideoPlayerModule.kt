package me.lokmvne.exoplayer.di

import android.annotation.SuppressLint
import android.app.Application
import androidx.media3.common.util.Clock
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.DefaultRenderersFactory
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import me.lokmvne.exoplayer.utils.MetaDataReader
import me.lokmvne.exoplayer.utils.MetaDataReaderImpl

@UnstableApi
@Module
@InstallIn(ViewModelComponent::class)
object VideoPlayerModule {
    @SuppressLint("VisibleForTests")
    @Provides
    @ViewModelScoped
    fun provideVideoPlayer(app: Application): ExoPlayer {
        val trackSelector = DefaultTrackSelector(app).apply {
            setParameters(buildUponParameters().setMaxVideoSizeSd())
        }
        return ExoPlayer.Builder(app)
            .setClock(Clock.DEFAULT)
            .setMediaSourceFactory(DefaultMediaSourceFactory(app))
            .setRenderersFactory(DefaultRenderersFactory(app))
            .setTrackSelector(trackSelector)
            .build()
    }

    @Provides
    @ViewModelScoped
    fun provideMetaDataReader(app: Application): MetaDataReader {
        return MetaDataReaderImpl(app)
    }
}