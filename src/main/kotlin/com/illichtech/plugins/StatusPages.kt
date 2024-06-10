package com.illichtech.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*


fun Application.configureStatusPage(){
    install(StatusPages){
        status(HttpStatusCode.NotFound) { call, status ->
            call.respondText(text = "404: Page Not Found", status = status)
        }
        status(HttpStatusCode.InternalServerError) { call, status ->
            call.respondText(text = "On Server happened error. Double check server", status = status)
        }
    }
}