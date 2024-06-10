package com.illichtech.repository

import com.illichtech.models.ApiResponse
import com.illichtech.models.Product

interface ProductRepository{

    val goods: List<Product>

    suspend fun getAllProducts(page: Int = 1, limit: Int): ApiResponse
    suspend fun searchProducts(name: String?): ApiResponse

}