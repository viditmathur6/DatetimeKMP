package com.datetime

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform