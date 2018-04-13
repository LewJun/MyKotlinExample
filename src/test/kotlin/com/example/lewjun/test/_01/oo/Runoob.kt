package com.example.lewjun.test._01.oo

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 16:42 LewJun Exp $$
 */
class Runoob<in T : String, out A: Any>(val t: A) {
    fun foo(name : T): A {
        return t
    }
}