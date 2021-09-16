package com.jhy.androidlab.section4

class MyClass {
    val data1: Int
    var data2: String

    init {
        data1 = 10
        data2 = "kim"
    }

    lateinit var data3: String
    val data4: Int by lazy {
        println("\nlazy...")
        10
    }
}

fun main() {
    println("main start......")
    val obj = MyClass()
    println(obj.data4)
    println("main end......")
}