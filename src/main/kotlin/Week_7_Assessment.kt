
fun main(args: Array<String>) {
    var num = 795843
    var reversedcounting = 0

    while (num != 0) {
        val digit = num % 10
        reversedcounting = reversedcounting * 10 + digit
        num /= 10
    }

    println("Reversed Count: $reversedcounting")



    for (countingreverse: Int in 20 downTo 0) println(countingreverse)
}