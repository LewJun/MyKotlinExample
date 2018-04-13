package com.example.lewjun.test._01.oo

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 13:59 LewJun Exp $$
 */
class Person2(lastName: String) {
    var pLastName = lastName
    var age: Int? = null
        set(value) {
            field = if (value?.compareTo(150) == 1)
                100
            else value
        }

    var sex: Boolean = false
        private set

    init {
        println("Constructor last name is $lastName")
    }

    fun printLastName() {
//        println("last name is $lastname") // error
        println("last name is $pLastName")
    }

    override fun toString(): String {
        return "Person2(pLastName='$pLastName', age=$age, sex=$sex)"
    }


}