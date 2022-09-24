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
    fun getTest() = testApplication {
        client.get(baseUri + subUri).apply {
            assertEquals(testStatus, status)
            assertEquals(testBody(HttpMethod.Get), bodyAsText())
        }
    }

    @Test
    fun postTest() = testApplication {
        client.post(baseUri + subUri).apply {
            assertEquals(testStatus, status)
            assertEquals(testBody(HttpMethod.Post), bodyAsText())
        }
    }

    @Test
    fun putTest() = testApplication {
        client.put(baseUri + subUri).apply {
            assertEquals(testStatus, status)
            assertEquals(testBody(HttpMethod.Put), bodyAsText())
        }
    }

    @Test
    fun patchTest() = testApplication {
        client.patch(baseUri + subUri).apply {
            assertEquals(testStatus, status)
            assertEquals(testBody(HttpMethod.Patch), bodyAsText())
        }
    }

    @Test
    fun deleteTest() = testApplication {
        client.delete(baseUri + subUri).apply {
            assertEquals(testStatus, status)
            assertEquals(testBody(HttpMethod.Delete), bodyAsText())
        }
    }

    @Test
    fun headTest() = testApplication {
        client.head(baseUri + subUri).apply {
            assertEquals(testStatus, status)
            assertEquals(testBody(HttpMethod.Head), bodyAsText())
        }
    }

    @Test
    fun optionsTest() = testApplication {
        client.options(baseUri + subUri).apply {
            assertEquals(testStatus, status)
            assertEquals(testBody(HttpMethod.Options), bodyAsText())
        }
    }

    private fun testBody(method: HttpMethod): String {
        return "{\"uri\":\"${baseUri + subUri}\",\"statusCode\":${testStatus.value},\"method\":\"${method.value}\",\"message\":\"Request succeeded.\"}"
    }

}
