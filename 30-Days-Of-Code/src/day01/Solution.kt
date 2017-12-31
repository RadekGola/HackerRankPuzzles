package day01

import java.io.ByteArrayInputStream
import java.util.*

fun main(args: Array<String>) {
    val message = Scanner(System.`in`).nextLine()
    println("Hello, World.")
    println(message)
}

val sInOverride = System.setIn(ByteArrayInputStream("hello".toByteArray()))



