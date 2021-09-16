package com.jhy.androidlab.section3.test3

fun main() {
    for(i in 10 downTo 1 step 2) {
        println(i)
    }

    val array = arrayOf("hello", "world")
    for((index, value) in array.withIndex()) {

    }

    val map = mapOf<String, String>("one" to "hello", "two" to "world")
    for(item in map) {
        println("key: ${item.key}, value: ${item.value}")
    }
}

