package com.example.kotlinbasics

fun main() {
    //mutable variables (Changeable)
//    var myName = "Juee"
//    myName = "Parulekar"
//    print("Hello $myName!!")
//
//    //immutable variables (fixed)
//    //type String
//    val myName1 = "Jyoti"
//    println("Hello $myName1")
//
//    /* This is a multi line comment starts with /* and ends with *'/ without the '
//     var is used for variables which are mutable/changeable.
//     kotlin is a strongly typed language that supports Type Inference.
//     The compiler will directly assume the size and type to a variable by that.
//     For example, if you assign any whole number to a variable,
//     the compiler will directly assume that the variable is of type Int
//    */ */
//    var myAge = 31
//
//    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
//    val myByte: Byte = 13
//    val myShort: Short = 125
//    val myInt: Int = 123123123
//    val myLong: Long = 12_039_812_309_487_120
//
//    // Floating Point number Types: Float (32 bit), Double (64 bit)
//    val myFloat: Float = 13.37F
//    val myDouble: Double = 3.14159265358979323846
//
//    // Booleans the type Boolean is used to represent logical values.
//    // It can have two possible values true and false.
//    var isSunny: Boolean = true
//    // not sunny anymore...
//    isSunny = false
//
//    // Characters
//    val letterChar = 'A'
//    val digitChar = '1'
//
//    // Strings
//    val myStr = "Hello World"
//    var firCharInStr = myStr[0]
//    var lastCharInStr = myStr[myStr.length - 1]
//
//    //Topic 24 Exercise
//    var myStr1: String = "Android Masterclass"
//    val myFloat1: Float = 13.37F
//    val myDouble1: Double = 3.14159265358979
//    var myByte1: Byte = 25
//    var myShort2: Short = 2020
//    var myLong1: Long = 18881234567
//    var myBoolean1: Boolean = true
//    var myChar: Char = 'a'
//
//
//    //Arithmetic Operators (+,-,*,/,%)
//    var result = 5 + 3
//    result /= 2
//    println(result)
//    val a = 5.0
//    val b = 3
//    var resultDouble: Double
//    resultDouble = a / b
//    println(resultDouble)
//
//    //Comparison Operator (==, !=, <, >, <=, >=)
//    val isEqual = 5 == 3
//    println("isEqual is $isEqual")
//
//    var heightPerson1 = 170
//    var heightPerson2 = 170
//
//    if (heightPerson1 > heightPerson2) {
//        println("use raw force")
//    } else if (heightPerson1 == heightPerson2) {
//        println("use your power technique")
//    } else {
//        println("use technique")
//    }
//
//    var name = "Juee"
//
//    if (name == "Juee") {
//        println("Welcome home juee")
//    } else {
//        println("Who are you?")
//    }
//
//    var isRainy = true
//    if (isRainy)
//        println("It's rainy")
//
//    var age = 25
//    when (age) {
//        in 0..20 -> println("now you may drink in the US")
//        in 18..20 -> println("you may vote now")
//        16, 17 -> println("you may drive now")
//        else -> println("you are too young")
//    }
//
////    var x: Any = 13.37f
////    when(x){
////        is Int -> println("$x is an Int")
////        is Double -> println("$x is a Double")
////        is String -> println("$x is a String")
////        else -> println("$x is none of the above")
////    }
//
//    val x: Any = 13.37
//    //assign when to a variable
//    val result_ = when (x) {
//    //let condition for each block be only a string
//        is Int -> "is an Int"
//        !is Double -> "is not Double"
//        is String -> "is a String"
//        else -> "is none of the above"
//    }
//    //then print x with the result
//    println("$x $result_")
//
//    val value = 1;
//    var xy = "aah"
//
//    if (value > 5) {
//        if (value < 2) {
//            xy = "oh"
//        }
//    }
//
//    println(xy)
//
//    //for loop exercises
//
//    for(num in 0..10000)
//        if(num == 9001)
//            println("It's Over 9000!!!")
//
//    var humidity = "humid"
//    var humidityLevel = 80
//
//    while(humidity == "humid"){
//        humidityLevel -= 5
//        println("humidity decreased")
//
//        if(humidityLevel < 60){
//            humidity = "comfy"
//            println("It's comfy now")
//        }
//    }

//    var count = 0
//    for (x in 0..9) {
//        for (y in 0..9) {
//            count ++
//            println("Result = ${x * y}")
//        }
//    }
//    println("count = $count")

//    var result = averageNumber(15.5, 20.5)
//
//    println("Average is $result")

//    val numbers = arrayOf(10,30,50,20)
//    println(numbers.contentToString())

//    val fruits = arrayOf(Fruits("Apple", 100.00),
//    Fruits("Mango", 150.00)
//    )
//
//    for (i in fruits){
//        println("Fruit name is ${i.name}")
//    }
//    println(fruits.contentToString())

//    val days = arrayOf(Days("Monday"), Days("Friday"), Days("Tuesday"))
//
//    for(j in days){
//        println("Today is ${j.name}")
//    }
}

fun averageNumber(a: Double, b: Double) : Double{
    return (a+b)/2
}

data class Fruits(val name:String, val price:Double)
data class Days(val name:String)