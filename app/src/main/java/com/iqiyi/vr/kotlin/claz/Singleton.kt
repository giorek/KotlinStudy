package com.iqiyi.vr.kotlin.claz

class Singleton private constructor(){
    lateinit var name:String

     fun printName(){
        println(" print singleton name:${name}")
    }


    object Singleton
}