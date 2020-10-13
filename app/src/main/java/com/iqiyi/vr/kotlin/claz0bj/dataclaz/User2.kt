package com.iqiyi.vr.kotlin.claz0bj.dataclaz

/**
 * 1、省去data关键字之后，才可用copy这种方式
 */
class User2 constructor(var name:String ,var age:Int){
    fun copy(name:String = this.name,age: Int = this.age) = User2(name, age)
}