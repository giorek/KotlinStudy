package com.iqiyi.vr.kotlin.nestinnerclaz

/**
 * 1、内部类可以获取外部类的参数
 * 2、匿名内部类使用object进行实现
 * window.addListener(object:Listener(){
 *      override fun method1(){......}
 * })
 */
class OutInnerClaz {
    var name:String = "outer class name"

    inner class inner constructor(){
        fun printInfo(){
            println("this is inner claz ,and outer claz name is ${name}")
        }
    }
}