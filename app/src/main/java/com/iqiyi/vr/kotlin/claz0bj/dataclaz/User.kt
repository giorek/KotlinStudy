package com.iqiyi.vr.kotlin.claz0bj.dataclaz

/**
 * data 关键字用于指定当前类用于数据保存
 * 1、主构造函数需要至少有一个参数
 * 2、主构造函数的参数有两种类型：var val
 * 3、数据类不能是抽象abstract、开放open、密封private或者内部internal
 * 4、构造函数，可设置默认值
 * 5、属性声明 address声明
 * 6、使用data关键字，无法使用copy方式
 */
 data class User constructor(var name:String = "",
                            var age:Int = 0) {
    var address:String? = null

    //not work
    //fun copy(name:String = this.name, age:Int = this.age) = User(name, age)

    fun CopyUser(name: String,age: Int):User{
        return User(name, age)
    }

    fun printInfo(){
        println("printInfo: name:$name age:$age ")
    }
}