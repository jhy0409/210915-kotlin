package com.jhy.androidlab.section7

open class SuperClass {
    fun some1() {

    }
}

class Outter {
    val obj = object {
        val data1: Int = 20
        fun some2() {

        }
    }

    val obj2 = object : SuperClass() {
        fun some3() {

        }
    }

    object NamedObjectClass {
        fun some4() {
        }
    }
}

fun main() {
    Outter.NamedObjectClass.some4()
}