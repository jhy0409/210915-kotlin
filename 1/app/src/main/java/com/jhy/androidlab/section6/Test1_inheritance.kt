package com.jhy.androidlab.section6.test1

open class Super(no: Int) {
    open fun some() {

    }
}

class Sub(no: Int): Super(no) {
    override fun some() {

    }
}