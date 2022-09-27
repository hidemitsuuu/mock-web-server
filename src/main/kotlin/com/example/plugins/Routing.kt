package com.example.plugins

import com.example.routes.clientErrorRoute
import com.example.routes.successRoute
import io.ktor.server.routing.*
import io.ktor.server.application.*
import io.ktor.server.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        successRoute()
        clientErrorRoute()
    }
}
