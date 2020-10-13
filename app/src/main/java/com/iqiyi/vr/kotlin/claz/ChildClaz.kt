package com.iqiyi.vr.kotlin.claz

class ChildClaz : SuperClaz{
    constructor(age:Int):super(age)
    constructor(nm:String,ag:Int) : super(nm,ag)

    final override fun printMsg() {
        super.printMsg()
        println("print child msg")
    }
}