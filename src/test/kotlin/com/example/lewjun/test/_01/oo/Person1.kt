package com.example.lewjun.test._01.oo

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 13:47 LewJun Exp $$
 */
class Person1 {
    var lastName = "zhangsan"
        private set
        get() = field.toUpperCase()

    var age = 20
        set(value) {
            field = if (value > 200) 100 else value
        }

    override fun toString(): String {
        return "Person1(lastName='$lastName', age=$age)"
    }
}