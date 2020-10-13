package com.iqiyi.vr.kotlin.nestinnerclaz

class OuterClaz {
    var outerName:String ? = ""

    class NestClaz{
        fun printInfo(){
            println("this is NestClaz, and there is no relationship between outer and nest claz")
        }
    }
}

