package ru.strv.kotlin_trainee

class Person(name: String, surname: String) : Animal(name) {
    init {

    }

    fun add(x: Int, y: Int): Int = x + y
}