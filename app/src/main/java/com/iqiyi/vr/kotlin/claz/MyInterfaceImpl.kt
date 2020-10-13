package com.iqiyi.vr.kotlin.claz

class MyInterfaceImpl : IInterface{
    var implName:String = ""
    override val name: String
        get() = implName

    override fun drawName() {
        println(" override drawName ")
    }
}