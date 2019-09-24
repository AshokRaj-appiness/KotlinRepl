package com.example.myapplication

fun main(args:Array<String>){
    //1 st example
//    println("your fortune is : ${getFortuneCookie()}")

    //2nd example
    getTakeItEasy()
}

fun getFortuneCookie() :String{
    val fortuneList = mutableListOf<String>(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )
    print("Enter your birthday")
    var birthDay = readLine()?.toIntOrNull()?:1
    return fortuneList[birthDay.rem(fortuneList.size)]
}
fun getTakeItEasy(){
    for(i in 1..10){
        var fortune = getFortuneCookie()
        println("Your fortune is : $fortune")
        if(getFortuneCookie().contains("Take it")) break
    }
}
