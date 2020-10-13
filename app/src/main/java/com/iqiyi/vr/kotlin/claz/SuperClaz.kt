package com.iqiyi.vr.kotlin.claz

/**
 * 父类需要使用open关键字声明
 */
open class SuperClaz {
    var name:String = ""
    var age:Int = 0
    constructor(age:Int)

    constructor(name:String , age:Int)

    open fun printMsg(){}
}