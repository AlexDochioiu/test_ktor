package com.example

import com.example.plugins.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.main() {
//    install(DefaultHeaders)
//    install(CallLogging)
    configureHTTP()
    configureRouting()
//    embeddedServer(Netty, port = 8089, host = "0.0.0.0") {
//        configureHTTP()
//        configureRouting()
//    }.start(wait = true)
}
