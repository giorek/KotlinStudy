package com.iqiyi.vr.kotlin.claz0bj.dataclaz

class DataClaz {
    fun testConstruct(){
        var user:User = User("Monty",20)
        user.address = "Beijing"
        println("print address for monty : ${user.address}")
        println("print info for monty : ${user.toString()}")
        println("print info for monty 2: ${user}")

        user.printInfo()
    }
}