package com.example.weatherapp.models

data class Sys(
    val message:Double,
    val country:String,
    val sunrise:Long,
    val sunset:Long,
    val type:Int
):java.io.Serializable