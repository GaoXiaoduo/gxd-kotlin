package com.gxd.kotlin.chapter3

/**
 * 条件语句
 * @author gaoxiaoiduo
 * @date 18/10/10上午10:47
 * @version 1.0
 */

private const val USER_NAME = "kotlin"
private const val PASS_WORD = "123456"

private const val ADMIN_NAME = "admin"
private const val ADMIN_PSD = "admin"

private const val DEBUG = 1
private const val USER = 0

fun main(args: Array<String>)
{
    //testIf(args)
    testWhen(args)
}

fun testWhen(args: Array<String>)
{
    println("------ when 语句 -------------")
    var x = 5
    when (x)
    {
        is Int          -> println("Hello $x")
        in 0..100       -> println("$x is in 0..100")
        !in 0..100      -> println("$x is not in 0..100")
        args[0].toInt() -> println("args[0] is $args[0]")
        else            -> println("x is $x")
    }
    println("------ when 表达式 -------------")
    var mode = when
    {
        args.isNotEmpty() && args[0] == "1" -> 1
        else                                -> 0
    }
    println("mode = $mode")
}

fun testIf(args: Array<String>)
{
    val debug = if (args.isNotEmpty() && args[0] == "1")
    {
        DEBUG
    } else
    {
        USER
    }
    println("请输入用户名：")
    val userName = readLine()
    println("请输入密码：")
    val passWord = readLine()

    if (debug == DEBUG && userName == ADMIN_NAME && passWord == ADMIN_PSD)
    {
        println("管理员登录成功！")

    } else if (userName == USER_NAME && passWord == PASS_WORD)
    {
        println("登录成功！")
    } else
    {
        println("登录失败！")
    }
}

