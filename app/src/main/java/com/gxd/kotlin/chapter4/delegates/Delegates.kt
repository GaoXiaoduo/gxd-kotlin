package com.gxd.kotlin.chapter4.delegates

import kotlin.reflect.KProperty

/**
 * 代理模式
 * @author gaoxiaoiduo
 * @date 18/10/12下午6:00
 * @version 1.0
 */

class Delegates
{
    val hello by lazy {
        "Hello World!" //在第一次访问的时候才被初始化为Hello World!
    }

    val hello2 by X()

    var hello3 by X()
}

class X
{
    private var value: String? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String
    {
        println("x getValue : $thisRef -> ${property.name}")
        return value ?: ""
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String)
    {
        println("x setValue : $thisRef -> ${property.name} = $value")
        this.value = value
    }
}

fun main(args: Array<String>)
{
    var delegates = Delegates()
    println(delegates.hello)
    println(delegates.hello2)
    println(delegates.hello3)
    delegates.hello3 = "value of hello_3"
    println(delegates.hello3)
}