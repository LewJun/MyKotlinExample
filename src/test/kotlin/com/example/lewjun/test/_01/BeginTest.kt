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
}