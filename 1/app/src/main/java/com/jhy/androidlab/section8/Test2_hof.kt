package com.jhy.androidlab.section8.test2

fun main() {
    fun myFilter(list: List<Int>, arg: (Int)->Boolean): List<Int> {
        var resultList = mutableListOf<Int>()
        var iterator = list.iterator()

        while(iterator.hasNext()) {
            val no = iterator.next()
            val result = arg(no)

            if(result) {
                resultList.add(no)
            }
        }

        for (i in resultList) {
            println("i : $i")
        }
        println()
        return resultList
    }

    myFilter(listOf<Int>(10, 20, 30, 3, 5), {it>10})
    myFilter(listOf<Int>(10, 20, 30, 3, 5)) {it>10}
}

