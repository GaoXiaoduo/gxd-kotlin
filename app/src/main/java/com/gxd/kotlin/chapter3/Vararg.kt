package com.gxd.kotlin.chapter3

/**
 * 变长参数
 * @author gaoxiaoiduo
 * @date 18/10/10下午4:53
 * @version 1.0
 */
fun main(args: Array<String>)
{
    var arrayInt = intArrayOf(1, 3, 5, 7)
    hello(2.0, ints = *arrayInt, str2 = "world", str = "ok")
}

fun hello(double: Double = 3.0, vararg ints: Int, str: String = "Hello", str2: String)
{
    println(double)
    ints.forEach(::println)
    println(str)
    println(str2)
}