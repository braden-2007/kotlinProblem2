fun main() {
    val operatingSystem = "Chrome OS"
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(emailId: String): String {
    return "There's a new sign-in request on Unknown OS for your Google Account $emailId"
}

fun displayAlertMessage(system : String, email : String): String{
    return "There's a new sign-in request on $system for your Google Account $email"
}
