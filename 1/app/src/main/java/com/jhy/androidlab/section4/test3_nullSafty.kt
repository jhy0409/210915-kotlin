package com.jhy.androidlab.section4

fun main() {
    var data1: String? = "kkang"
    //data1 = null
    val result = data1?.uppercase()

    val result2 = data1?.run {
        println("this is not null")
    } ?: run {
        println("this is null")
    }
}