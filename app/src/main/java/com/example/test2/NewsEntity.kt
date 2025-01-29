package com.example.test2

import android.content.Intent
import com.google.gson.annotations.SerializedName

data class NewsEntity(
    @SerializedName("data") val data: List<Data>
){

    data class Data(
        @SerializedName("title") val title: String,
        @SerializedName("description") val description: String,
        @SerializedName("source") val source: String

    )
}
