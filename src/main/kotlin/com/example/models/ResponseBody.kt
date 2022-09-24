package com.example.models

import io.ktor.http.*
import kotlinx.serialization.Serializable

@Serializable
data class ResponseBody(
    val uri: String,
    val statusCode: Int,
    val method: String,
    val message: String
    ) {
    companion object {
        fun of(uri: String, statusCode: HttpStatusCode, method: HttpMethod, message: String): ResponseBody {
            return ResponseBody(uri = uri, statusCode = statusCode.value, method = method.value, message = message)
        }
    }
}
