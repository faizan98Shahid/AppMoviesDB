package com.example.appmoviesdb.entities.response

import com.google.gson.annotations.SerializedName

open class BaseResponse
{
    @SerializedName("status_code") var statusCode:Int = 0
    @SerializedName("status_message")var statusMessage:String = ""
    @SerializedName("success")var success:Boolean = false
}