package com.jhy.androidlab.section6

import com.jhy.androidlab.section6.test1.Super

abstract class Super {
    abstract val data1: String

    open fun some1() {

    }
    abstract fun some2()

    open fun some3() {

    }
}

interface MyInterface {
    val data1: String
    fun some4() {

    }

    fun some5()
}

class Sub: Super(), MyInterface {
    override fun some2() {

    }

    override fun some5() {
        TODO("Not yet implemented")
    }

    override val data1: String
        get() = TODO("Not yet implemented")

}