package com.example.helper

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Route.allMethods(status: HttpStatusCode) {
    get {
        call.response(status = status)
    }
    post {
        call.response(status = status)
    }
    put {
        call.response(status = status)
    }
    patch {
        call.response(status = status)
    }
    delete {
        call.response(status = status)
    }
    head {
        call.response(status = status)
    }
    options {
        call.response(status = status)
    }
}