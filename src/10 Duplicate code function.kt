fun main() {
    easy("Ankara",27,31,82)
    easy("Tokyo",32,36,10)
    easy("Cape Town",50,64,2)
    easy("Giatemala City",50,55,7)
}

fun easy(city: String, loTemp: Int, hiTemp: Int, rain: Int) {
    println("City: $city")
    println("Low temperature: $loTemp, High temperature: $hiTemp")
    println("Chance of rain: $rain%")
    println()
}