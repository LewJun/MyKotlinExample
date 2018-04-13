package com.example.lewjun.test._01.oo.accessModifier

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 14:50 LewJun Exp $$
 */
class MyEntity1 : BaseModel() {
    override fun hi() {
        super.hi()
        println("hi")
    }
}