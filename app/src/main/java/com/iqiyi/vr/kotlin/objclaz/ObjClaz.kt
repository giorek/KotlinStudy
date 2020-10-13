package com.iqiyi.vr.kotlin.objclaz


interface MyInterface{
    fun printInterfaceInfo():Unit
}

open class ObjSuperClaz constructor(open var name:String){

}

class ObjClaz(override var name:String):ObjSuperClaz(name),MyInterface {
    override fun printInterfaceInfo() {

    }
}

/**
 * 使用object创建内部对象
 */
class ObjClazTest(){
    var mobj:ObjSuperClaz = object :ObjSuperClaz("Monty"),MyInterface{
        override fun printInterfaceInfo() {

        }
    }
}

/**
 * 1、使用object关键字替换class关键字，可以将此类用于单例
 * 2、使用时直接像使用静态方法一样，claz.method即可
 */
object MyObjClaz{
    fun printInfo(){

    }
}