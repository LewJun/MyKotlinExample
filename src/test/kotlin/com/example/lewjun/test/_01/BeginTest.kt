package com.example.lewjun.test._01

import org.junit.Before
import org.junit.Test

class BeginTest {
    lateinit var b: Begin
    @Before
    fun before() {
        b = Begin()
    }

    @Test
    fun testSum1() {
        println(b.sum1(3, 4))
    }

    @Test
    fun testSum2() {
        println(b.sum2(3, 4))
    }

    @Test
    fun testPrintSum() {
        b.printSum(4, 5)
    }

    @Test
    fun testGetS() {
        val s = b.getS()
        println("s is $s")

        val r = Math.sqrt(s / b.PI)
        val str = "r is $r"
        println(str)

        val c = 2 * b.PI * r
        println("c is $c")

        println("${str.replace("is", "was")}, but now is $r too, $str")
    }

    @Test
    fun testMaxOf() {
        println(b.maxOf(3, 2))
    }

    @Test
    fun testAdd1() {
        b.add1()
    }

    @Test
    fun testParseInt() {
        println(b.parseInt("3")) // 3->3 ""-> null
    }

    @Test
    fun testPrintProduct() {
        b.printProduct("4", "3")
    }

    @Test
    fun testGetStringLen() {
        println(b.getStringLen(""))
        println(b.getStringLen("ww"))
        println(b.getStringLen("234234"))
        println(b.getStringLen(listOf("a", "b", 3)))
    }

    @Test
    fun testLoop() {
        b.loop()
    }

    @Test
    fun testDescribe() {
        println(b.describe(2))
    }

    @Test
    fun testRangeIn() {
        b.rangeIn()
    }

    @Test
    fun testListOf() {
        // 返回一个只读列表（包含重复）
        val fruits = listOf("avocado", "orange", "apple", "apple", "banana", "kiwifruit")
        for (fruit in fruits) {
            println(fruit)
        }

        if ("orange" in fruits) {
            println("orange in fruits")
        }
    }

    @Test
    fun testSetOf() {
        // 返回一个只读列表（重复的数据只返回一次）
        val fruits = setOf("avocado", "orange", "apple", "apple", "banana", "kiwifruit")
        for (fruit in fruits) {
            println(fruit)
        }

        if ("orange" in fruits) {
            println("orange in fruits")
        }

        // when 如果匹配成功即返回，后面的即使能匹配也不再去匹配
        when {
            "orange" in fruits -> println("orange")
            "pear" !in fruits -> println("pear is not in fruits")
        }

        fruits.filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println(it) }
    }
}