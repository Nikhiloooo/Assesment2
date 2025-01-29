package com.example.test2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NewsRepository {
    suspend fun getNewsInfo(): List<NewsModel> {
        val api = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(NewsApi::class.java)

        return api.getNewsInfo(Constants.API_KEY).toNewsModel()
    }
}

fun NewsEntity.toNewsModel(): List<NewsModel> {
    val requireDetails = mutableListOf<NewsModel>()

    this.data.map{ it->
        requireDetails.add(NewsModel(it.title,it.description,it.source))
    }
  return requireDetails
}