package com.iqiyi.vr.kotlin.claz0bj.delegate

/**
 * 1、kotlin的代理类似java,代理类和实现类都需要实现相同的接口
 * 2、代理类的构造方法需要传递需要代理的实际类的引用
 * 3、代理类在实现了接口后需要增加  by 关键字，后面跟的是 构造时传递的具体实现类
 * 4、使用代理类时因为代理类实现了接口，故可以使用代理类直接调用接口方法
 * 5、上述步骤4中，如果代理类复写(override)了接口方法，则不再调用实现类中对应的方法
 * 6、此种方式的代理使用方式，在代理对象中只能访问代理对象本身的成员，无法访问被代理对象的成员属性
 */
interface DerivedBase {
    fun printInfo()
    fun printMsg()
}

class DerivedImpl(var name:String ) : DerivedBase{
    open val impName:String = name
    override fun printInfo() {
        println(" DerivedImpl name:${name}")
    }

    override fun printMsg() {
        println(" print DerivedImpl method printMsg")
    }
}

class Derived(b:DerivedBase) : DerivedBase by b{
    val derivedName:String = "Derived name"
    override fun printMsg() {
        println("print Derived method printMsg name:${derivedName} ")
    }
}


