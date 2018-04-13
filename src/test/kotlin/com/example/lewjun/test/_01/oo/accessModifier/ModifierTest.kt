package com.example.lewjun.test._01.oo.accessModifier

import org.junit.Test

/**
 *
 * @author LewJun
 * @version v0.1 2018/04/10 14:53 LewJun Exp $$
 */
class ModifierTest {
    @Test fun test1() {
        var m :BaseModel = MyEntity1()
        m.hi()
    }
}