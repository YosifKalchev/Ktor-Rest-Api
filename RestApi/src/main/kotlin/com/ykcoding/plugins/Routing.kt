package com.ykcoding.plugins

import com.ykcoding.routes.randomComputer
import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {
    

    routing {
        randomComputer()
        // Static plugin. Try to access `/static/index.html`
        static {
            resources("static")
        }
    }
}
