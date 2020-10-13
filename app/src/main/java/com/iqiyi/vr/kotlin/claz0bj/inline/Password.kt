package com.iqiyi.vr.kotlin.claz0bj.inline

/**
 * 1、内联函数需要有一个属性需要在主构造函数中初始化
 * 2、
 */
inline class Password(val value:String) {
    val length:Int get() = value.length

}

class test{
    val psw = Password("123456")
}