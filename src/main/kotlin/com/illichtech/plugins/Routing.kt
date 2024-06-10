package com.illichtech.plugins

import com.illichtech.routes.getAllProducts
import com.illichtech.routes.root
import com.illichtech.routes.searchProduct
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()
        getAllProducts()
        searchProduct()
    }
}
