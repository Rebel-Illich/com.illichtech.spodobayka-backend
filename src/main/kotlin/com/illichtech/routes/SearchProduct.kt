package com.illichtech.routes

import com.illichtech.repository.ProductRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchProduct() {

    val productRepository: ProductRepository by inject()

    get("/spodobayka/products/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = productRepository.searchProducts(name)
        call.respond(
            status = HttpStatusCode.OK,
            message = apiResponse
        )
    }
}