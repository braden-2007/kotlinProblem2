fun main() {
    val Steps = 4000
    val caloriesBurned = PEDOMETERstepsTOcalories(Steps);
    println("Walking $Steps steps burns $caloriesBurned calories")
}

fun PEDOMETERstepsTOcalories(NumberOFStepS: Int): Double {
    val burnedSteps = 0.04
    val TCaloriesbruned = NumberOFStepS * burnedSteps
    return TCaloriesbruned
}