package com.jhy.androidlab.section4.test1

class User {
    var id: Int = 0
        set(value) {
            if(value<0)
                field = 0
            else {
                field = value
            }
        }
    var name: String? = null
        get() {
            return field?.toUpperCase()
        }
}

fun main() {
    var obj = User()
    obj.id = 10
    obj.name = "kkang"

    println("id : ${obj.id}, name: ${obj.name}")
}