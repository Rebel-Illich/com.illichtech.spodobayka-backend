package com.illichtech.plugins

import com.illichtech.di.koinModule

import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin
import org.koin.logger.slf4jLogger


fun Application.configurationKoin() {
    install(Koin) {
        slf4jLogger()
        modules(koinModule)
    }
}
