package com.example.routes

import com.example.helper.allMethods
import io.ktor.http.*
import io.ktor.server.routing.*

fun Route.successRoute() {
    route("/success/ok") {
        allMethods(HttpStatusCode.OK)
    }
    route("/success/created") {
        allMethods(HttpStatusCode.Created)
    }
    route("/success/accepted") {
        allMethods(HttpStatusCode.Accepted)
    }
    route("/success/no-content") {
        allMethods(HttpStatusCode.NoContent)
    }
}
