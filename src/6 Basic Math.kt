fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    val subResult = subtract(firstNumber, secondNumber)
    val subAnotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    println("$firstNumber - $secondNumber = $subResult")
    println("$firstNumber - $thirdNumber = $subAnotherResult")
}

fun add(Number1: Int, Number2: Int): Int {
    return Number1 + Number2;
}

fun subtract(number1 : Int, number2 : Int): Int{
    return number1 - number2;
}