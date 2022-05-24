package com.example.myapplication

fun main() {
    print("welcome to kotlin")
    var c = add(10,20)
    print("\nthe result is--"+c)
}


fun add(a: Int, b: Int): Int {
    return a + b
}