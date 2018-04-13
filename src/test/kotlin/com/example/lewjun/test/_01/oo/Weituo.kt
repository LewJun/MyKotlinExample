package com.example.lewjun.test._01.oo

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/12 09:39 LewJun Exp $$
 */
interface Base1 {
    fun print()
}

class Base1Impl(val x: Int) : Base1 {
    override fun print() {
        println(x)
    }
}

class Derived1(b: Base1) : Base1 by b/* {
    override fun print() {
        println("abc")
    }
}*/

class DelegateExample {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you delegating '${property.name}' to me."
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has bean assigned to '${property.name}' in $thisRef.")
    }
}

class Example {
    var p: String by DelegateExample()
}

class User {
    var username: String by Delegates.observable("init value") {
        kProperty: KProperty<*>, oldValue: String, newValue: String ->
        println("${kProperty.name}, $oldValue, $newValue")
    }
}

class User1(map: Map<String, Any>) {
    val username: String by map
    val age: Int by map
}
