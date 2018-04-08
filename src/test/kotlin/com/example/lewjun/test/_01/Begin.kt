package com.example.lewjun.test._01

class Begin {
    // 声明顶层不可变属性
    val PI = 3.14


    fun sum1(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int)/*: Unit */ {
        println("sum of $a and $b is ${a + b}")
    }

    fun getS(): Double {
        // 声明局部不可变变量
        val r: Int = 2
        return PI * r * r
    }

    fun add1() {
        // 声明局部可变变量
        var x = 2
        println("x is $x")
        x += 1
        println("but now x is $x")
    }

    // 使用条件表达式
    fun maxOf(a: Int, b: Int) = if (a > b) a else b

    fun parseInt(str: String): Int? {
        return str.toIntOrNull()
    }

    fun printProduct(str1: String, str2: String) {
        var x = parseInt(str1)
        var y = parseInt(str2)

        if (x == null || y == null) {
            println("either '$str1' or '$str2' is not a number")
            return
        }
        println(x * y)
    }

    // 使用is类型检测及自动转换
    fun getStringLen(obj: Any): Int {
        // 使用is做类型检测
        if (obj is String) {
            // obj已经自动转换为String，无需显示转换
            return obj.length
        } else if (obj is Array<*>) {
            return obj.size
        } else if (obj is Collection<*>) {
            return obj.size
        }

        return 0
    }

    fun loop() {
        val items = listOf("baba", "mama", "gege", "mm")
        for (item in items) {
            println(item)
        }

        var index = 0
        while (index < items.size) {
            println(items[index])
            index++
        }
    }

    // 使用when表达式
    fun describe(obj: Any): String = when (obj) {
        1 -> "One"
        "Hello"     -> "Greeting"
        is Int      -> "is Int"
        is Long     -> "is Long"
        !is String  -> "Not a String"
        else        -> "Unknown"
    }

    // 使用in来判断某数是否在某区间内
    fun rangeIn() {
        val x = 9
        val y = 11
        if (x in 2..y) {
            println("x in 2 to $y")
        }

        if (-5 !in -2..1) {
            println("-5 !in -2..1")
        }

        for (x in 0..9) {
            println(x)
        }

        for (x in 0..9 step 2) {
            println(x)
        }

        for (x in 0..9 step 2) {
            println(x)
        }

/*        for (x in 9..0) {// 不能这样为什么呢？
            println(x)
        }*/

        for (x in 9 downTo 0) {
            println(x)
        }
    }
}