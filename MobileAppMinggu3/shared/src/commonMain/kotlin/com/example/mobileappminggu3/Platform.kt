package com.example.mobileappminggu3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform