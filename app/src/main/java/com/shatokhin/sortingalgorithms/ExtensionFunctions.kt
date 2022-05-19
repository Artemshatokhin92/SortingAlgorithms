package sortingalgorithms

import java.util.*
import kotlin.collections.ArrayList

fun ArrayList <Int>.swap(number1: Int, number2: Int) {
    val buffer = this[number1]
    this[number1] = this[number2]
    this[number2] = buffer
}

fun LinkedList<Int>.swap(number1: Int, number2: Int){
    val buffer = this[number1]
    this[number1] = this[number2]
    this[number2] = buffer
}

fun IntArray.swap(number1: Int, number2: Int){
    val buffer = this[number1]
    this[number1] = this[number2]
    this[number2] = buffer
}