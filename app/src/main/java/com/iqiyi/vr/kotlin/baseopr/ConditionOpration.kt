package com.iqiyi.vr.kotlin.baseopr

class ConditionOpration {

    /**
     * 循环打印数据
     */
    fun forEach(ary:Array<Int>)
    {
        for (a in ary){
            print(" value of a is:${a}")
        }
    }

    /**
     * 按照步长进行打印
     */
    fun forEachByStep(){
        for(i in 100 downTo 50 step 15)
        {
            print("value of i is:${i}   \n")
        }
    }


    /**
     * 类似switch,条件选择
     */
    fun whenCondition(a:Int)
    {
        when(a){
            1 ->{
                print("获得到1 \n")
            }
            3 ->{
                print("获得到3 \n")
            }
        }
    }
}