package day02

import java.util.*


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val mealCost = scan.nextDouble() // original meal price
    val tipPercent = scan.nextInt() // tip percentage
    val taxPercent = scan.nextInt() // tax percentage
    scan.close()

    // cast the result of the rounding operation to an int and save it as totalCost
    val totalCost = Math.round(mealCost * (100 + tipPercent + taxPercent) / 100);

    // Print your result
    println("The total meal cost is $totalCost dollars.")
}



