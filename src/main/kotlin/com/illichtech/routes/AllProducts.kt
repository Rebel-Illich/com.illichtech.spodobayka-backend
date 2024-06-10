package com.illichtech.routes

import com.illichtech.models.ApiResponse
import com.illichtech.repository.ProductRepository
import com.illichtech.repository.ProductRepositoryImpl
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException


fun Route.getAllProducts(){

    val productRepository: ProductRepository by inject()

    get("/spodobayka/products"){
        try{
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val limit = call.request.queryParameters["limit"]?.toInt() ?: 1

            val apiResponse = productRepository.getAllProducts(page = page, limit = limit)

            call.respond(
                status = HttpStatusCode.OK,
                message = apiResponse)

        } catch(e: NumberFormatException){
            call.respond(
                status = HttpStatusCode.BadRequest,
                message = ApiResponse(success = false, message = "Only Numbers Allowed")
            )
        }  catch(e: IllegalArgumentException){
            call.respond(
                status = HttpStatusCode.NotFound,
                message = ApiResponse(success = false, message = "Products not found")
            )
        }
    }
}