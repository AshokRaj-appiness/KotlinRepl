package com.example.myapplication

import java.util.*

fun main(args:Array<String>){
    dayOfWeek()
}

fun dayOfWeek() {
    when(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
        1 -> println("Today is Sunday")
        2 -> println("Today is Monday")
        3 -> println("Today is TuesDay")
        4 -> println("Today is wednesday")
        5 -> println("Today is Thurday")
        6 -> println("Today is Friday")
        7 -> println("Today is Saturday")
    }
}
