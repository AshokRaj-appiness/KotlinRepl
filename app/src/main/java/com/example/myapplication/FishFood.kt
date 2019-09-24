package com.example.myapplication

import java.util.*

fun main(args:Array<String>){
    var day= randomDay()
    val food = feedTheFish(day)
    println("Today is ${day} tish will eat $food")
}

fun feedTheFish(day:String):String {
    return when(day){
        "Sunday" -> "flakes"
        "Monday" -> "redworms"
        "TuesDay" -> "gradles"
        "WednesDay" -> "mosquitoes"
        "Thursday" -> "planktoes"
        "Friday" -> "mutton"
        "Saturday" -> "Chicken"
        else -> "Fasting"
    }

}

fun randomDay():String{
    val week = listOf("Sunday","Monday","TuesDay","WednesDay","Thursday","Friday","Saturday")
    return week[Random().nextInt(7)]
}