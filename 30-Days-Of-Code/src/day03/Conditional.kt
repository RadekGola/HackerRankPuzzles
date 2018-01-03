package day03


import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val x = scan.nextInt()
    scan.close()

    when {
        x % 2 == 1 -> weird(true)
        x % 2 == 0 && x >= 2 && x <= 5 -> weird(false)
        x % 2 == 0 && x >= 6 && x <= 20 -> weird(true)
        x % 2 == 0 && x > 20 -> weird(false)
    }
}

private fun weird(weird: Boolean) {
    when {
        weird -> println("Weird")
        else -> println("Not Weird")
    }
}
