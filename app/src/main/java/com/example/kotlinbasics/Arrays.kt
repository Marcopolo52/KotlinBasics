package com.example.kotlinbasics

fun Basics2(){

    /** Array */
    val num1: IntArray = intArrayOf(1,2,3,4,5,6,7,8,9)
    val num2 = intArrayOf(1,2,3,4,5,6,7,8,9)
    val num3 = arrayOf(1,2,3,4,5,6,7,8,9)
    println(num3.toString())
    for (element in num1){ println(element) }
    println(num2[0])
    num1[0] = 228

}

data class da(
    var x1: Int,
    val x2: Int
){
    init {
        x1 = 2
    }
    //constructor(){this.da(va)}
}