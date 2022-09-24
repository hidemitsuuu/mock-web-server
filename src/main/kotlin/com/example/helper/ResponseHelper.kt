package com.example.helper

import com.example.models.ResponseBody
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*

suspend fun ApplicationCall.response(status: HttpStatusCode) {
    val uri = request.uri
    val method = request.httpMethod
    val message = "Request succeeded."

    response.status(status)
    respond(ResponseBody.of(uri = uri, statusCode = status, method = method, message = message))
}
