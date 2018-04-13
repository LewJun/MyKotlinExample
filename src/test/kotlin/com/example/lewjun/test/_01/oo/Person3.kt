package com.example.lewjun.test._01.oo

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 13:59 LewJun Exp $$
 */
class Person3 {
    var pLastName: String
    var age: Int = 0
        set(value) {
            field = if (value.compareTo(150) == 1)
                100
            else value
        }

    constructor(lastName: String) {
        pLastName = lastName
    }

    constructor(age: Int) : this("Unknown") {
        this.age = age
    }

    var sex: Boolean = false
        private set

    fun printLastName() {
//        println("last name is $lastname") // error
        println("last name is $pLastName")
    }

    override fun toString(): String {
        return "Person2(pLastName='$pLastName', age=$age, sex=$sex)"
    }


}