package com.iqiyi.vr.kotlin.claz0bj.genclaz

/**
 * 1、泛型的表现形式
 */
class GenClaz<T> constructor(t:T) {
    var value = t
}

class GenTest{
    /**
     * 1、两种构造形式
     *  取决于是否可以明确区分出来泛型的类型
     */
    fun testConstruct(){
        val instance:GenClaz<Int> = GenClaz<Int>(10)

        val instance1 = GenClaz(10)
    }
}