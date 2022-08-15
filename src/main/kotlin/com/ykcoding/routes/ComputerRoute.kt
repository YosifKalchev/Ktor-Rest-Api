package com.ykcoding.routes

import com.ykcoding.data.model.Computer
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private const val BASE_URL = "http://localhost:8080"
private val computers = listOf(
    Computer("MacBook Pro 16 Touch Bar", "Intel Core i9-9880H", "$BASE_URL/computers/computer1.jpg"),
    Computer("Apple MacBook Air 13.6\" Space Grey (2022)", "Apple M2", "$BASE_URL/computers/computer2.jpg"),
    Computer("Asus W202NA-GJ0090R", "Intel Celeron N3350", "$BASE_URL/computers/computer3.jpg"),
    Computer("ASUS X515FA-EJ312C", "Intel Core i3-10110U", "$BASE_URL/computers/computer4.jpg"),
)

fun Route.randomComputer() {
    get("/randompc") {
        call.respond(
            HttpStatusCode.OK,
            computers.random()
        )
    }
}
