package com.jhy.androidlab.section5

class User {
    var name: String = "kkang"
    fun some() {
        println("some fun called... $name")
    }
}

fun main() {
    val obj1 = User()
    val obj2 = User()

    obj1.name = "Hello"
    obj2.name = "world"

    obj1.some()
    obj2.some()
}