package com.iqiyi.vr.kotlin.baseopr

import android.util.Log

class BaseOperation {
    private val TAG:String = "BaseOperation:"
    /***
     * 加法
     */
    fun add(a:Int , b:Int) : Int{
        return a + b;
    }

    /**
     * 减法
     */
    fun reduce(a:Int, b:Int) = a - b;


    /**
     * 乘法
     */
    fun multiFactor(factor:Float):Float? = factor * 2005;

    /**
     * 取余
     */
    fun remain(a:Int ,b: Int):Int{
        return a % b
    }

    /**
     * 除法
     */
    fun division(a: Int , b: Int):Int = a/b


    /**
     * 位移操作
     *  shl(bits) – 有符号左移
        shr(bits) – 有符号右移
        ushr(bits) – 无符号右移
        and(bits) – 位与
        or(bits) – 位或
        xor(bits) – 位异或
        inv() – 位非
     */
    fun operationShl(data:Int ,bit:Int):Int{
        return data.shl(bit)
    }


    /**
     * 关系运算
     */
    fun compare(a:Int , b:Int){
        if (a > b)
        {
            print(TAG+" compare ${a} is bigger than ${b} \n")
        }
        else if (a == b)
        {
            print(TAG+" compare ${a} is same as ${b} \n")
        }
        else if(a < b)
        {
            print(TAG+" compare ${a} is smaller than ${b} \n")
        }
    }


    /**
     * 从数组中查找
     */
    fun queryFromIntArray(a:Int,list:IntArray):Boolean{
        return a in list;
    }

    /**
     * 是否落在某区间
     */
    fun containInRange(value:Int , startRange:Int , endRange:Int):Boolean
    {
        var result = value in startRange..endRange
        return result
    }

    /**
     * 是否不再某区间
     */
    fun containNotInRange(value:Int , startRange:Int , endRange:Int):Boolean
    {
        var result = value !in startRange..endRange
        return result
    }

    /**
     * 打印数组，包括空数组
     */
    fun printArray(input:Array<Int?>){
        for (a in input){
            print(TAG+" :"+a+" \n")
        }
    }

    fun setArray(input:Array<Int?>)
    {
        var index:Int = 0;
        for (a in input){
            input[index] = index;
            print(TAG+" :"+a+" \n")
            index++
        }

        for (a in input){
            print("${TAG} after input[${input.indexOf(a)}] = "+a+" \n")
        }
    }
}