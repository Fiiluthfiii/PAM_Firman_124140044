package com.example.mobileappminggu1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform