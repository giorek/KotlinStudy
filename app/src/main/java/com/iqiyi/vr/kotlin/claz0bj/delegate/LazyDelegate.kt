package com.iqiyi.vr.kotlin.claz0bj.delegate

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class LazyDelegate {
    var name:String  by Delegates.observable(""){
        prop,old,new ->
        println("")
    }
}

