package com.example.routes

import io.ktor.http.*

abstract class ClientErrorRouteTest(
    testStatus: HttpStatusCode,
    subUri: String,
): AbstractRouteTest(
    baseUri = "/client-error",
    testStatus = testStatus,
    subUri = subUri
)

class ClientErrorBadRequestRouteTest: ClientErrorRouteTest(
    testStatus = HttpStatusCode.BadRequest,
    subUri = "/bad-request"
)

class ClientErrorUnauthorizedRouteTest: ClientErrorRouteTest(
    testStatus = HttpStatusCode.Unauthorized,
    subUri = "/unauthorized"
)

class ClientErrorForbiddenRouteTest: ClientErrorRouteTest(
    testStatus = HttpStatusCode.Forbidden,
    subUri = "/forbidden"
)

class ClientErrorNotFoundRouteTest: ClientErrorRouteTest(
    testStatus = HttpStatusCode.NotFound,
    subUri = "/not-found"
)

class ClientErrorMethodNotAllowedRouteTest: ClientErrorRouteTest(
    testStatus = HttpStatusCode.MethodNotAllowed,
    subUri = "/method-not-allowed"
)

class ClientErrorRequestTimeoutRouteTest: ClientErrorRouteTest(
    testStatus = HttpStatusCode.RequestTimeout,
    subUri = "/request-timeout"
)

class ClientErrorPreconditionFailedRouteTest: ClientErrorRouteTest(
    testStatus = HttpStatusCode.PreconditionFailed,
    subUri = "/precondition-failed"
)
