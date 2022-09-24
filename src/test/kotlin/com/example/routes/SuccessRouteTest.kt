package com.example.routes

import io.ktor.http.*

abstract class SuccessRouteTest(
    testStatus: HttpStatusCode,
    subUri: String,
): AbstractRouteTest(
    baseUri = "/success",
    testStatus = testStatus,
    subUri = subUri
)

class SuccessOKRouteTest: SuccessRouteTest(
    testStatus = HttpStatusCode.OK,
    subUri = "/ok"
)

class SuccessCreatedRouteTest: SuccessRouteTest(
    testStatus = HttpStatusCode.Created,
    subUri = "/created"
)

class SuccessAcceptedRouteTest: SuccessRouteTest(
    testStatus = HttpStatusCode.Accepted,
    subUri = "/accepted"
)

class SuccessNoContentRouteTest: SuccessRouteTest(
    testStatus = HttpStatusCode.NoContent,
    subUri = "/no-content"
)
