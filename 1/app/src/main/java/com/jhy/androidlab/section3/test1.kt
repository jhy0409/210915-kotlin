package com.jhy.androidlab.section3.test1

fun main() {
    fun myFun(arg1: Int, arg2: String) = println("arg1: $arg1, arg2: $arg2")
    fun myFun_1(arg1: Int, arg2: String = "kkang") = println("arg1: $arg1, arg2: $arg2")

    myFun_1(arg1 = 10)
    myFun_1(arg1 = 10)
    myFun_1(arg2 = "lee", arg1 = 20)

    fun myFun2(arg1: Int, vararg arg2: Int) {
        for(a in arg2) {

        }
    }

    myFun2(10,20,30,40)
}

