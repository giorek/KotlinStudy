package com.iqiyi.vr.kotlin.claz0bj.delegate

class DerivedTest {
    fun testDerived(){
        var impl : DerivedImpl = DerivedImpl("Monty")
        Derived(impl).printInfo()
        Derived(impl).printMsg()

        val derivedProp:DerivedProp = DerivedProp()
        println("value .. of derived arg p:${derivedProp.p}")
        derivedProp.p = "Hello Monty"
        println("value of derived arg p:${derivedProp.p}")
    }
}