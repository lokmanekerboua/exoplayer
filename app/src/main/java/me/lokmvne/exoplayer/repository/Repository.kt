package me.lokmvne.exoplayer.repository

import me.lokmvne.exoplayer.data.TVApi
import me.lokmvne.exoplayer.data.model.CategoriesList
import me.lokmvne.exoplayer.data.model.ChannelsList
import me.lokmvne.exoplayer.utils.Resource
import javax.inject.Inject

class Repository @Inject constructor(
    private val TVApi: TVApi
) {
    suspend fun getCategories(): Resource<CategoriesList> {
        return try {
            val response = TVApi.getCategory()
            Resource.Success(response)
        } catch (e: Exception) {
            Resource.Error(e.message.toString())
        }
    }

    suspend fun getChannels(category: String): Resource<ChannelsList> {
        return try {
            val response = TVApi.getCategoryChannels(category)
            Resource.Success(response)
        } catch (e: Exception) {
            Resource.Error(e.message.toString())
        }
    }
}