package com.illichtech.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*



fun Route.root(){
    get("/"){
        call.respond{
            HttpStatusCode.OK
            "Welcome to Spodobayka market"
        }
    }
}