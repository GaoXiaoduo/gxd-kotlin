package com.gxd.kotlin.chapter3

/**
 * 循环体
 * @author gaoxiaoiduo
 * @date 18/10/10下午3:42
 * @version 1.0
 */

fun main(args: Array<String>)
{
    for (arg in args)
    {
        println(arg)
    }

    for ((index, value) in args.withIndex())
    {
        println("$index -> $value")
    }

    for (indexValue in args.withIndex())
    {
        println("${indexValue.index} -> ${indexValue.value}")
    }
    println("-----------")
    val list = MyIntList()
    list.add(1)
    list.add(2)
    list.add(3)
    list.add(4)
    for (i in list)
    {
        println(i)
    }
}

class MyIterator(val iterator: Iterator<Int>)
{
    operator fun next(): Int
    {
        return iterator.next()
    }

    operator fun hasNext(): Boolean
    {
        return iterator.hasNext()
    }
}

class MyIntList
{
    private val list = ArrayList<Int>()

    fun add(int: Int)
    {
        list.add(int)
    }

    fun remove(int: Int)
    {
        list.remove(int)
    }

    operator fun iterator(): MyIterator
    {
        return MyIterator(list.iterator())
    }
}