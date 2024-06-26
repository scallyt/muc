package com.scallyt.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.routing.*
import io.ktor.server.response.*

fun Route.userRoutes() {
    get {
        call.respond(HttpStatusCode.OK, "User")
    }
}