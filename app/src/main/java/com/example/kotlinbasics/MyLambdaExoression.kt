fun main() {

    //normal addition of 2 numbers function
    addNum(5, 10)

    //addition of 2 num using lambda expression
    val sum: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println(sum(20, 20))

    //even shorter
    val sum2 = { a: Int, b: Int -> println(a + b) }
    sum2(50, 50)
}

fun addNum(a: Int, b: Int) {
    var result = a + b
    println(result)
}

