package com.anma

class Misc {
}

data class Dog(var name: String, var age: Int, var color: String)

class Cat {
    var name: String = ""
    var color: String = ""
    override fun toString(): String {
        return "Cat(name='$name', color='$color')"
    }

}

fun main() {
    val murz = Cat()
    murz.name = "Murz"
    murz.color = "White"
    println(murz)
    var sharik = Dog("Shar", 4, "red")
    println(sharik)

}