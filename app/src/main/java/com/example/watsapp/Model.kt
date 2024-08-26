package com.example.watsapp

import java.io.Serializable

data class Model(
    val text: String,
    val isSentByUser: Boolean
):Serializable