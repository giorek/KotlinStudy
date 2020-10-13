package com.iqiyi.vr.kotlin

import android.util.Log
import android.util.LogPrinter
import com.iqiyi.vr.kotlin.baseopr.BaseOperation
import com.iqiyi.vr.kotlin.baseopr.ConditionOpration
import com.iqiyi.vr.kotlin.claz.Person
import com.iqiyi.vr.kotlin.claz.Singleton
import com.iqiyi.vr.kotlin.claz0bj.dataclaz.DataClaz
import com.iqiyi.vr.kotlin.claz0bj.delegate.DerivedTest
import com.iqiyi.vr.kotlin.collection.TestCollection

import org.junit.Assert.*
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    val TAG:String = "Monty:";
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testAdd(){
        var operation:BaseOperation = BaseOperation();
        val a:Int = 20
        val b:Int = 12
        var addResult:Int = 0
        addResult = operation.add(a,b)

        //基础计算
        print("${TAG} value add ${a} and ${b} is:${addResult} \n")

        var reduceResult:Int
        reduceResult = operation.reduce(a,b)
        print("${TAG} value reduce ${a} and ${b} is:${reduceResult} \n")

        val factor:Float = 0.1f;
        var multip:Float?
        multip = operation.multiFactor(factor)
        print("${TAG} value multi factor:${factor} result : ${multip} \n")

        //转换
        print("${TAG} parse to Byte:${multip?.toByte()} toShort: ${multip?.toShort()} toInt:${multip?.toInt()}   toLong:${multip?.toLong()} " +
                " toFloat:${multip?.toFloat()} toDouble:${multip?.toDouble()}  toChar:${multip?.toChar()}\n")


        print("${TAG} 10%6 : ${operation.remain(10,6)} \n")

        print("${TAG} 10%6 : ${operation.division(10,6)} \n")

        print("${TAG} 10<<2 : ${operation.operationShl(10,2)} \n")

        print("${TAG} : ${operation.compare(10,2)} \n")

        var intAry:IntArray = intArrayOf(1,2,3,4,6,29,10,63,72)
        print("${TAG} queryFromIntArray: ${operation.queryFromIntArray(10,intAry)} \n")

        var value = 10
        var startRange = 1
        var endRange = 100
        print(" ${value}  ${operation.containInRange(value,startRange, endRange)} range (${startRange} , ${endRange} ) \n")
        print(" ${value} ${operation.containNotInRange(value,startRange, endRange)}  range (${startRange} , ${endRange} ) \n")

        var intNAry : Array<Int?> = arrayOfNulls<Int>(10)
        print("${TAG} print Null array ${operation.printArray(intNAry)} \n")
        print("${TAG} print Null array ${operation.setArray(intNAry)} \n")

        print("${'$'}\n")


        var conditionOpration:ConditionOpration = ConditionOpration()
        print("${conditionOpration.whenCondition(3)}")
        print("${conditionOpration.forEachByStep()}")

    }

    @Test
    fun testClaz(){
        var person:Person = Person("Monty")
        person = Person("Hello",10)

        var singleton: Singleton.Singleton = Singleton.Singleton
    }

    @Test
    fun testDataClaz(){
        var dataClaz:DataClaz = DataClaz()
        dataClaz.testConstruct()
    }

    @Test
    fun testCollection(){
        val obj:TestCollection = TestCollection()
        obj.testSet()
    }

    @Test
    fun testDelegate(){
        val delegate:DerivedTest = DerivedTest()
        delegate.testDerived()
    }
}