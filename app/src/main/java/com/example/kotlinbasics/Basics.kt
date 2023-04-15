package com.example.kotlinbasics

fun main(){
    //mutable variables (Changeable)
    var myName = "Juee"
    myName = "Parulekar"
    print("Hello $myName!!")

    //immutable variables (fixed)
    //type String
    val myName1 = "Jyoti"
    println("Hello $myName1")

    /* This is a multi line comment starts with /* and ends with *'/ without the '
     var is used for variables which are mutable/changeable.
     kotlin is a strongly typed language that supports Type Inference.
     The compiler will directly assume the size and type to a variable by that.
     For example, if you assign any whole number to a variable,
     the compiler will directly assume that the variable is of type Int
    */ */
    var myAge = 31

    // Integer TYPES: Byte (8 bit), Short (16 bit), Int (32 bit), Long (64 bit)
    val myByte: Byte = 13
    val myShort: Short = 125
    val myInt: Int = 123123123
    val myLong: Long = 12_039_812_309_487_120

    // Floating Point number Types: Float (32 bit), Double (64 bit)
    val myFloat: Float = 13.37F
    val myDouble: Double = 3.14159265358979323846

    // Booleans the type Boolean is used to represent logical values.
    // It can have two possible values true and false.
    var isSunny: Boolean = true
    // not sunny anymore...
    isSunny = false

    // Characters
    val letterChar = 'A'
    val digitChar = '1'

    // Strings
    val myStr = "Hello World"
    var firCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    //Topic 24 Exercise
    var myStr1: String = "Android Masterclass"
    val myFloat1: Float = 13.37F
    val myDouble1: Double = 3.14159265358979
    var myByte1: Byte = 25
    var myShort2: Short = 2020
    var myLong1: Long = 18881234567
    var myBoolean1: Boolean = true
    var myChar: Char = 'a'


    //Arithmetic Operators (+,-,*,/,%)
    var result = 5+3
    result /= 2
    println(result)
    val a = 5.0
    val b = 3
    var resultDouble : Double
    resultDouble = a / b
    println(resultDouble)

    //Comparison Operator (==, !=, <, >, <=, >=)
    val isEqual = 5==3
    println("isEqual is $isEqual")
}
