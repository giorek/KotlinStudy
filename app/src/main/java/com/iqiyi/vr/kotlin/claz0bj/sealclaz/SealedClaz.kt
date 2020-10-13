package com.iqiyi.vr.kotlin.claz0bj.sealclaz

/**
 * 1、密封类需要使用关键词 sealed
 * 2、密封类类似于枚举，子类可包含几种状态
 * 3、密封类是自身的抽象，无法直接实例化，可以包含抽象成员
 * 4、密封类不允许有非private的构造函数
 */
sealed class SealedClaz private constructor(){

}

/**
 * 1、继承自密封类的子类
 */
data class SealedImpl1(var name:String = " SealedImpl1 "):SealedClaz(){

}

/**
 * 1、无参构造函数
 */
class SealedImpl2():SealedClaz(){}



