package cinema

fun main() {
    // write your code here
    // Stage 1
    println("Cinema:")
    println("  1 2 3 4 5 6 7 8")
    println("1 S S S S S S S S")
    println("2 S S S S S S S S")
    println("3 S S S S S S S S")
    println("4 S S S S S S S S")
    println("5 S S S S S S S S")
    println("6 S S S S S S S S")
    println("7 S S S S S S S S")
    println(" ")

    // Stage 2
    println("Enter the number of rows:")
    val rows = readln().toInt()
    println("Enter the number of seats in each row:")
    val seats = readln().toInt()

    val totalSeat = rows * seats

    if (totalSeat <= 60) {
        val price = 10
        val total = totalSeat * price
        println("Total income:\n$" + total)
    } else {
        val frontRow = rows / 2
        val frontTotal = frontRow * seats * 10

        val backRow = rows - frontRow
        val backTotal = backRow * seats * 8

        val total = frontTotal + backTotal
        println("Total income:\n$" + total)
    }
}