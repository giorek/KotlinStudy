package com.iqiyi.vr.kotlin.collection

import kotlin.concurrent.thread

/**
 * 基本集合操作
 * 1、创建基本的set、空set
 */
class BaseOperation {
    //初始化set
    val numberSet = setOf("element1","element2","element3")
    val numberEmptySet = setOf<String>()
    val emptySet = mutableSetOf<String>()

    fun printSetInfo()
    {
        println(" num of numberSet is:${numberSet.size}")
        println(" num of numberEmptySet is:${numberEmptySet.size}")
        println(" num of emptySet is:${emptySet.size}")
    }


    //赋值与初始化map
    val numMap = mapOf("key1" to 1,"key2" to 2)//不建议使用
    var mutMap = mutableMapOf<String,String>().apply { this["one"] = "1" ; this["two"] = "2"}//建议使用

    fun printMapInfo()
    {
        println("num of numMap :${numMap.size}")
        println("num of mutMap :${mutMap.size}")
    }


    //list处理
    val empList = emptyList<String>()
    var mutList = mutableListOf(10,9,8,7,6,5,4,3,2,1)



    fun printListInfo()
    {
        println("num of empList :${empList.size}")
        println("num of mutList :${mutList.size}")
        var index:Int = 0
        /*for (ele in mutList){
            mutList[ele] = index + 1
            index++
        }*/


        for (ele in mutList){
            println("num of mutList ....:${ele}")
            println("num of mutList ....:${mutList[index]}")
            index++
        }
    }

    fun testCorout(){
       /* thread {
            Thread.sleep(50)
            println("world")
        }
        println("Hello")
        Thread.sleep(10)*/
    }
}