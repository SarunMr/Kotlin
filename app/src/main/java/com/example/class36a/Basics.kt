package com.example.class36a

fun Greeting(name : String) : String {
    return  "Hello $name"
}

fun main(){
   //Declaring a variable
    //mutability varname : datatype
    var age : Int = 18;
    var name : String = "Sarun"

    println("I am $age")

    var address = arrayListOf("ktm","bhaktapur","lalitpur")
    var capital = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing"
    )
    println(capital["Nepal"])
   //for loop settings
    for (i in  5 downTo   0){
        println(i)
    }
   println("Enter days of week: ")
    var days = readln().toInt()

    var weekDay : String = ""


    when(days){
        1  -> weekDay = "Sunday"
        2  -> weekDay = "Monday"
        3  -> weekDay = "Tuesday"
        4  -> weekDay = "Wednesday"
        5  -> weekDay = "Thursday"
        6  -> weekDay = "Friday"
        7  -> weekDay = "Saturday"
    }
    println(weekDay)
    println(Greeting(name))
}
