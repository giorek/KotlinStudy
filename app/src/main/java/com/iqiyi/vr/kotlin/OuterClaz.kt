package com.iqiyi.vr.kotlin

class OuterClaz {
    fun call(){
        println("call out claz")
    }

    inner class InnerClaz
    {
        fun innerCall(){
            println("call inner claz")
            call()
        }
    }
}