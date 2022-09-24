package com.example.routes.sample

import com.example.helper.response
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Route.successRoute() {
    route("/success/ok") {
        val statusCode = HttpStatusCode.OK
        HttpMethod
        get {
            call.response(status = statusCode)
        }
        post {
            call.response(status = statusCode)
        }
        put {
            call.response(status = statusCode)
        }
        patch {
            call.response(status = statusCode)
        }
        delete {
            call.response(status = statusCode)
        }
        head {
            call.response(status = statusCode)
        }
        options {
            call.response(status = statusCode)
        }
    }
}
