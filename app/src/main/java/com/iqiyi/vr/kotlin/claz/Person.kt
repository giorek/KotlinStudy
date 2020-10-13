package com.iqiyi.vr.kotlin.claz

private const val TAG:String = ""
class Person constructor(name:String) {

    val age:Int = 10

    init {
        println(" In person init name:${name} age:${age} \n")
    }

    val secondAge:Int = 20

    init {
        println(" In person init name:${name} secondAge:${secondAge} \n")
    }

    var savedName:String = ""
    constructor(name:String, age:Int) : this(name){
        print(" ......name...... ${name} age:${age}")
    }

    val isEmpty:Boolean get() = (this.age == 0)

    val isNotEmpty:Boolean get() {
        return this.age == 0
    }

    lateinit var address:String

    fun isInited():Boolean{
        return age == 20
    }

}