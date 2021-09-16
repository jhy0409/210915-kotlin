package com.jhy.androidlab.section5.test2

class User(val id: String, val name: String) { // 생성자 매개변수, 생성자 local variable, 함수에서 일반접근 불가능
    var email: String? = null
    init {
        println("init... id: $id, name: $name")
    }

//    var id: String
//    var name: String
//    init {
//        this.id = id
//        this.name = name
//    }

    constructor(id: String, name: String, email: String) : this(id, name) {
        println("constructor... id $id, name: $name, email: $email")
    }

    constructor(id: String, name: String, email: String, age: String): this(id, name, email) {
        println("constructor... id $id, name: $name, email: $email, age: $age")
    }
    fun some() {
        println("some... id: $id, name: $name")
    }
}

fun main() {
    User("1", "hello")
    User("2","world","a@a.com")
    User("3","world","a@a.com", "20")
}