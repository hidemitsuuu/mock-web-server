package com.example.helper

import com.example.models.ResponseBody
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import kotlinx.coroutines.*

suspend fun ApplicationCall.response(status: HttpStatusCode) {
    val uri = request.uri
    val method = request.httpMethod
    val message = "Request succeeded."

    application.environment.log.info("Api called.\n\turi    = {}\n\tmethod = {}", uri, method.value)
    delay(timeMillis = 500)

    response.status(status)
    respond(ResponseBody.of(uri = uri, statusCode = status, method = method, message = message))
}
