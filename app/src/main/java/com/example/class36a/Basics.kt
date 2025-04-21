package com.example.class36a

fun lesson3(){
    //Basics of Kotlin
    //How to declare variable in kotlin
    var a = 10;       //auto takes datatype declaration
    var a1: Int = 10; //datatype defined declaration

    //Now lets declare String datatype in Kotlin
    var name = " Sarun "
    var b :String = "1"
    //type conversion in kotlin
    //Lets try to add a and b where b is String value
    //var add : Int = a + b; this code gives error
    //For type Conversion you can use variable name,datatype followed by a . and toInt() toString() and others
    var add:Int = a + b.toInt()
    println(add) //Check
    //Lets try some String method
    //String are also array can acces it using indexing
    println(name[2]) //Output : r
    println(name.length) //length method returns the length of the string in integer datatype
    println(name.uppercase()) //SARUN
    println(name.lowercase()) //sarun
    println(name.trim()) //removes spaces
    println(name.plus(" is my name"))
}

fun lesson4() {
    //Array and ArrayList in Kotlin
    var age  =  arrayOf(1,2,3,4)
    println(age) //printing array
    println(age.size) //printing array size which is 4.
    println("In index 0 data is ${age[0]}")

    var age1 = ArrayList<Int>() //Arraylist can only be initialize like this and data cannot be added
    age1.add(1)
    age1.add(2)
    age1.add(2,3) //2 represents index while 3 data

    var name = arrayListOf<String>("Sarun","Aayuj","Sandesh") // arrayListOf can be initialize in same line that's the only diffrence
    name.add("Robin")
    name.add(4,"Rahul")
    name.remove("Aayuj") //removes element
    name.removeAt(2) //removes according to index

    //var restaurant = arrayListOf<Any>("Check in",True,1) Declaring any types of variable

}

fun lesson5(){
    //Kotlin Collection
    //1.List  : Already learnd about in lesson4
    //2.Set : Has unique Elements
    //3.Map : dictionary or key value pair

    //Set
    val set1 = setOf(1,2,3,4 )
    val set2 = setOf(3,2,1,4 )
    println(set1 == set2) //returns true does not care about the order

    //Map
    val capital = mapOf(
        "Nepal" to "Kathmandu",
        "India" to "Delhi",
        "China" to "Beijing",
    )
    println(capital)
    println("All keys: ${capital.keys}")
    println("All values: ${capital.values}")
    println("Captial of Nepal is : ${capital["Nepal"]}")

}
fun lesson6(){
   //Operators like other programming languages
}

fun lesson7(){
    //IF-Else mostly same as other lang
    //Switch Case
    var day:Int = readln().toInt() //Taking user input
    var dayname:String
    when(day) {
        1 -> dayname ="Sunday"
        2 -> dayname ="Monday"
        3 -> dayname ="Tuesday"
        4 -> dayname ="Wednesday"
        5 -> dayname ="Thursday"
        6 -> dayname ="Friday"
        7 -> dayname ="Saturday"
        else -> dayname ="Invalid Day"
    }
    //Inclusive
    for (i in 1..5) {
        println(i)  // Prints 1, 2, 3, 4, 5
    }
    // Exclusive range (1 to 4)
    for (i in 1 until 5) {
        println(i)  // Prints 1, 2, 3, 4
    }
    // Descending range (5 down to 1)
    for (i in 5 downTo 1) {
        println(i)  // Prints 5, 4, 3, 2, 1
    }
    // Range with step (increment by 2)
    for (i in 1..10 step 2) {
        println(i)  // Prints 1, 3, 5, 7, 9
    }
    // Descending range with step
    for (i in 10 downTo 1 step 3) {
        println(i)  // Prints 10, 7, 4, 1
    }
}

fun lesson8(){
    //I am already used to function in Kotlin
}

fun main(){
    lesson3()
    lesson4()
    lesson5()
    lesson6()
    lesson7()
    lesson8()
}