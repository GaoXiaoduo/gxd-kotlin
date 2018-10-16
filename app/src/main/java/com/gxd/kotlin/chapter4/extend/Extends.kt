package com.gxd.kotlin.chapter4.extend

/**
 * 扩展
 * @author gaoxiaoiduo
 * @date 18/10/12下午3:34
 * @version 1.0
 */

fun main(args: Array<String>)
{
    println("abc ".multiply(4))
    println("abc ".times(5))
    println("abc " * 3)
}

@JvmOverloads
fun String.multiply(int: Int): String
{
    val stringBuilder = StringBuilder()
    for (i in 0 until int)
    {
        stringBuilder.append(this)
    }
    return stringBuilder.toString()
}

@JvmOverloads
operator fun String.times(int: Int): String
{
    val stringBuilder = StringBuilder()
    for (i in 0 until int)
    {
        stringBuilder.append(this) //this：指代他的调用者，也就是例子中的abc
    }
    return stringBuilder.toString()
}
