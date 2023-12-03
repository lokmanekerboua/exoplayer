package me.lokmvne.exoplayer.data

import me.lokmvne.exoplayer.data.model.CategoriesList
import me.lokmvne.exoplayer.data.model.ChannelsList
import me.lokmvne.exoplayer.utils.Constatnts.Companion.CATEGORIES_BASE_URL
import me.lokmvne.exoplayer.utils.Constatnts.Companion.CHANNELS_BASE_URL
import retrofit2.http.GET
import retrofit2.http.Path

interface TVApi {

    @GET("${CATEGORIES_BASE_URL}getcategories")
    suspend fun getCategory(): CategoriesList

    @GET("${CHANNELS_BASE_URL}getCategorychannels/{id}")
    suspend fun getCategoryChannels(
        @Path("id") category: String
    ): ChannelsList
}