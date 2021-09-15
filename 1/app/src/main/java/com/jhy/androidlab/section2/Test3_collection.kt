package com.jhy.androidlab.section2.test3

fun main() {
    val array1 = arrayOf(10, 20, true, "hello")
    array1[2] = false
    array1.get(1)

    val array2 = arrayOf<Int>(10, 20)
    val array3 = intArrayOf(10, 20)

    Array(size = 3, { i -> i*10 }) // 배열만 선언할 경우
    val array4 = arrayOfNulls<Int>(4)

    val array5 = Array(size = 3, {0}) // 기초데이터를 위한 배열 클래스 이용
    val array6 = IntArray(size = 2)
}

