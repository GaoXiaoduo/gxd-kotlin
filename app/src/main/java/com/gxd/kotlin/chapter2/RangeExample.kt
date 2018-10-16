package com.gxd.kotlin.chapter2

/**
 * 区间
 * @author gaoxiaoiduo
 * @date 18/9/29下午4:22
 * @version 1.0
 */

var range: IntRange = 0..100   // [0,100]
val range_exclusive: IntRange = 0 until 100 // [0,100)
val empty_exclusive: IntRange = 0..-1

fun main(args: Array<String>)
{
    println(empty_exclusive.isEmpty())
    println(range_exclusive.contains(100))
    println(50 in range)

    for (i in range)
    {
        print("$i,")
    }
}