package com.iqiyi.vr.kotlin.claz0bj.delegate

import kotlin.reflect.KProperty

/**
 * 属性代理
 *
 */
class DerivedProp {
    var p:String by Delegate()
}

class Delegate{
    operator fun getValue(derivedProp: Any?, property: KProperty<*>): String {
        return ""
    }

    operator fun setValue(derivedProp: Any?, property: KProperty<*>, s: String) {
        
    }
}