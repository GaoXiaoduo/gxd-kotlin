package com.gxd.kotlin.chapter3

/**
 * 函数
 * @author gaoxiaoiduo
 * @date 18/10/8下午2:32
 * @version 1.0
 */
fun main(args: Array<String>)
{
    //    checkArgs(args)
    //    val arg1 = args[0].toInt()
    //    val arg2 = args[1].toInt()
    //    println("$arg1+$arg2=${sum(arg1, arg2)}")
    //    println(intToLong(3))

    args.forEach gxd@{
        if (it == "f") return@gxd
        println(it)
    }
    println("The end !")
}

fun checkArgs(args: Array<String>)
{
    if (args.size != 2)
    {
        printUsage()
        System.exit(0)
    }
}

fun printUsage()
{
    println("请传入两个整型参数，例如 1 和 2")
}

fun sum(arg1: Int, arg2: Int): Int
{
    return arg1 + arg2
}

/**
 * 匿名函数
 */
val intToLong = fun(x: Int): Long
{
    return x.toLong()
}