package com.ykcoding.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Computer(
    val name: String,
    val description: String,
    val imageUrl: String
)
