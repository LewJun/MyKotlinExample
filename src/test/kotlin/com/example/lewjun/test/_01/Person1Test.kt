package com.example.lewjun.test._01

import com.example.lewjun.test._01.oo.*
import com.example.lewjun.test._01.oo.accessModifier.BaseModel
import com.example.lewjun.test._01.oo.accessModifier.MyEntity1
import org.junit.Before
import org.junit.Test
import java.net.URL
import java.text.DecimalFormat
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 13:48 LewJun Exp $$
 */
class Person1Test {
    lateinit var p1: Person1
    @Before
    fun before() {
        p1 = Person1()
    }

    @Test
    fun test1() {
        p1.age = 300
        println(p1)
    }

    @Test
    fun test2() {
        var p2 = Person2("zhang")
        p2.age = 180
        p2.printLastName()
        println(p2)
    }

    @Test fun test3() {
        var p3 = Person3(33)
        p3.pLastName = "Lew"
        println(p3)
    }

    @Test
    fun test4() {
        var b: Derived = DerivedImpl()
        b.f()
    }

    @Test
    fun test5() {
        var s = UnNameInnerType()
        s.test1(object : InterfaceA {
            override fun greeting(name: String) {
                println("the name is $name")
            }

        })
    }

    @Test
    fun testModifier() {
        var b: BaseModel = MyEntity1()
        b.hi()
    }

    @Test
    fun testInterface() {
        var f = MyInterfaceImpl()
        f.foo()
    }

    @Test
    fun fanxing() {
        var b1 = Box("zhangsan") // 等同于 Box<String>("zhangsan")
        println(b1.value)
        println(b1.returnT(3))
        println(b1.returnT("sdf"))
        println(b1.returnT(3.14f))

        b1.return2("aaaa")
        b1.return2("aaaa")
    }


    @Test
    fun fanxing2() {
        var runoob = Runoob<String, Any>(t = "string")
        println(runoob.foo("ss"))
        var runoob2 = Runoob<String, Any>("sdfwer")
        println(runoob2.foo("zs"))
    }

    @Test
    fun testNull() {
        val readText = URL("http://www.baidu.com").readText()
        println(readText)
    }

    @Test
    fun testWith() {
        val p = Person3("zhangsan")
        with(p) {
            println(pLastName)
            println(age)
        }
    }

    @Test fun testWeituo() {
        val b = Base1Impl(5)
        Derived1(b).print()

        val e = Example()
        e.p = "hello kotlin"
        println(e.p)
    }

    val lazyValue: String by lazy {
        println("computed")
        "lazy value"
    }

    @Test
    fun testLazyValue() {
        println(lazyValue)
        println(lazyValue)
    }

    @Test
    fun testDelegateObservable() {
        val u = User()
        u.username = "LewJun"
        println(u.username)
        u.username = "liujun"
        println(u.username)

        /*
        username, init value, LewJun
        LewJun
        username, LewJun, liujun
        liujun
        */
    }

    @Test
    fun testDelegateMap() {
        val u = User1(mapOf(
                "username" to "LewJun",
                "age" to 30
        ))
        println(u.username)
        println(u.age)
    }

    var positiveNumber = Delegates.vetoable(0) {
        kProperty: KProperty<*>, oldVal: Int, newVal: Int ->
        newVal >= 0
    }

    @Test
    fun testGetTemperature1Ret() {
        val temperature1Ret = GetTemperature1Ret.getCode("Open simm90614 fail")
        println(GetTemperature1Ret.descs)
        println(GetTemperature1Ret.descs)

        val format = DecimalFormat("0.00")
        println(format.format(0.125564))
    }

    // Return null if str does not hold a number
    fun parseInt(str: String) = try {
        str.toInt()
    } catch (e: Exception) {
        null
    }

    @Test
    fun testParseInt() {
        val a = parseInt("555")
//        println(a*a) error
        if (a != null) {
            println(a * a)
        }

    }

}