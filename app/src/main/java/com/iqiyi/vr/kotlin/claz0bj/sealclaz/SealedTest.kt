package com.iqiyi.vr.kotlin.claz0bj.sealclaz

/**
 * 1、封闭类相当于枚举类
 * 2、使用when时，如果当前的类型为某个子类时返回固定信息
 * 3、封闭类的构造函数都是private的
 */

class SealedTest {
    fun testWhen(status: SealedClaz):Int = when(status){
        is SealedImpl1 -> 1
        is SealedImpl2 -> 2
    }
}