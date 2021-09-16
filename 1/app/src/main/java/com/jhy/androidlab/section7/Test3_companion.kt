package com.jhy.androidlab.section7.test3


class Outter {
    companion object CompanionObjectClass {
        var data: Int = 0
        fun someFun() {

        }
    }

    fun some() {
        CompanionObjectClass.data = 10
        CompanionObjectClass.someFun()

        data = 20
        someFun()

    }
}

fun main() {
    Outter.CompanionObjectClass.data = 30
    Outter.data = 40
    Outter.someFun()
}