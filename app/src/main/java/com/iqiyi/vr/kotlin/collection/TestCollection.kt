package com.iqiyi.vr.kotlin.collection

class TestCollection {
    fun testSet(){
        var oper:BaseOperation = BaseOperation()
        oper.printSetInfo()

        oper.printListInfo()

        oper.testCorout()
    }
}