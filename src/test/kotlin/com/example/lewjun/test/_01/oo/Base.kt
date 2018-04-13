package com.example.lewjun.test._01.oo

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 14:24 LewJun Exp $$
 */
// open 表示该类可以被继承
open class Base {
    open fun f() {}
}

// 抽象的方法和类无需使用open关键字修饰
abstract class Derived : Base() {
    override abstract fun f()
}

class DerivedImpl : Derived() {
    override fun f() {
        println("f called")
    }

}

// 嵌套类不可以访问所在外部类的成员
class Outer {
    private val a = 3

    class Inner {
        fun printA() {
            println("outer.a is can't access")
        }
    }
}

// 内部类可以访问所在外部类的成员
class Outer2 {
    private val a = 3

    inner class Inner2 {
        fun printA() {
            println("outer.a is ${this@Outer2.a}")
        }
    }
}

interface InterfaceA {
    fun greeting(name: String)
}

class UnNameInnerType {
    fun test1(t: InterfaceA) {
        t.greeting("LewJun")
    }
}