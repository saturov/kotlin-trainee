package ru.strv.kotlin_trainee

class Person(name: String, surname: String) : Animal(name) {

    var name: String = ""
        get () = field.toUpperCase()
        set(value) {
            field = "Name : $value"
        }

    fun add(x: Int, y: Int): Int = x + y
}