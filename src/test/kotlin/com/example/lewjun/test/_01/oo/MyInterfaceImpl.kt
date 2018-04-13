package com.example.lewjun.test._01.oo

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 16:10 LewJun Exp $$
 */
class MyInterfaceImpl : MyInterfaceA, MyInterfaceB {
    override fun foo() {
        super<MyInterfaceA>.foo()
        super<MyInterfaceB>.foo()
    }
}