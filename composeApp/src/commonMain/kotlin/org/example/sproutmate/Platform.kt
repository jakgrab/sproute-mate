package org.example.sproutmate

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform