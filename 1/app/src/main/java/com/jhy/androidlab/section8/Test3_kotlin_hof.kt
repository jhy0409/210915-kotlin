package com.jhy.androidlab.section8.test3

fun main() {
    class User {
        var name = "kim"
        fun sayHello() {

        }
    }

    val obj = User()
    obj.run {
        name="lee"
        sayHello()
    }
}

