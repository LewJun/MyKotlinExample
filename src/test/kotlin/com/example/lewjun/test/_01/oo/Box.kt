package com.example.lewjun.test._01.oo

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 16:23 LewJun Exp $$
 */
class Box<T>(t: T) {
    var value = t

    fun <V> returnT(t: V) : V {
        when(t) {
            is String -> "is str"
            is Int -> 0
            else -> t
        }
        return t
    }

    fun <V : Comparable<V>> return2(t: V) {
        println(t.javaClass)
    }
}