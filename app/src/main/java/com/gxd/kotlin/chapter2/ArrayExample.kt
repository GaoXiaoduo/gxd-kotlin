package com.gxd.kotlin.chapter2

/**
 * 数组
 * @author gaoxiaoiduo
 * @date 18/9/29下午4:39
 * @version 1.0
 */

val arrayOfInt: IntArray = intArrayOf(1, 3, 5, 7)
val arrayOfChar: CharArray = charArrayOf('H', 'E', 'L', 'L', 'O', 'W', 'O', 'R', 'L', 'D')
val arrayOfString: Array<String> = arrayOf("我", "是", "大美女")


fun main(args: Array<String>)
{
    println(arrayOfInt.size)
    for (int in arrayOfInt)
    {
        println(int)
    }
    println("----------------")
    println(arrayOfString[2])
    arrayOfString[2] = "大帅哥"
    println(arrayOfString[2])
    println("----------------")
    println(arrayOfChar.joinToString(""))
    println(arrayOfInt.slice(1..2))
}