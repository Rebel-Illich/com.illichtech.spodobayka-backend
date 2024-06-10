package com.illichtech.models

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: Int,
    val name: String,
    val image: String,
    val about: String,
    val rating: Double,
    val priceBefore: String,
    val priceCurrent: String,
    val specialOffer: String
)
