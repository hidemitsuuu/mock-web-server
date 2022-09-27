package com.example.routes

import com.example.helper.allMethods
import io.ktor.http.*
import io.ktor.server.routing.*

fun Route.clientErrorRoute() {
    route("/client-error/bad-request") {
        allMethods(HttpStatusCode.BadRequest)
    }
    route("/client-error/unauthorized") {
        allMethods(HttpStatusCode.Unauthorized)
    }
    route("/client-error/forbidden") {
        allMethods(HttpStatusCode.Forbidden)
    }
    route("/client-error/not-found") {
        allMethods(HttpStatusCode.NotFound)
    }
    route("/client-error/method-not-allowed") {
        allMethods(HttpStatusCode.MethodNotAllowed)
    }
    route("/client-error/request-timeout") {
        allMethods(HttpStatusCode.RequestTimeout)
    }
    route("/client-error/precondition-failed") {
        allMethods(HttpStatusCode.PreconditionFailed)
    }
}
