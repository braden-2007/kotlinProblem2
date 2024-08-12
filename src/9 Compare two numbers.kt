fun main(){
    println(compare(300,250))
    println(compare(300,300))
    println(compare(200,220))
}

fun compare(num1: Int, num2: Int): Boolean{
    if(num1 - num2 > 0){
        return true
    }
    else return false
}