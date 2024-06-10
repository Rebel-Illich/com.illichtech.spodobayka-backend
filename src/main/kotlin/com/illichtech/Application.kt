package com.illichtech

import com.illichtech.plugins.*
import io.ktor.server.application.*



fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}


fun Application.module() {
    configurationKoin()
    configureRouting()
    configureHTTP()
    configureMonitoring()
    configureSockets()
    configureSerialization()
    configureDatabases()
    configureSecurity()
    configureDefaultHeader()
    configureStatusPage()
}
