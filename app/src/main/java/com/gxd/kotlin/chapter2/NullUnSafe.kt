package com.gxd.kotlin.chapter2

/**
 * 空类型
 * @author gaoxiaoiduo
 * @date 18/9/29上午11:24
 * @version 1.0
 */
fun getName(): String?
{
    return null
}

fun main(args: Array<String>)
{
    //val name: String = getName() ?: return
    //println(name.length)

    val value: String? = "HelloWorld!"
    println(value!!.length)
}