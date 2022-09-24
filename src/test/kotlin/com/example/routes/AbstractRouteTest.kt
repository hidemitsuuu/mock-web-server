package com.example.routes

import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

abstract class AbstractRouteTest(
    private val baseUri: String,
    private val testStatus: HttpStatusCode,
    private val subUri: String
) {

    @Test
    fun test() = testApplication {
        client.get(baseUri + subUri).apply {
            assertEquals(testStatus, status)
            assertEquals(testBody(testStatus), bodyAsText())
        }
    }

    private fun testBody(status: HttpStatusCode): String {
        return "{\"uri\":\"${baseUri + subUri}\",\"statusCode\":${testStatus.value},\"method\":\"GET\",\"message\":\"Request succeeded.\"}"
    }

}
