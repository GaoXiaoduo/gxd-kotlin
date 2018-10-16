package com.gxd.kotlin.chapter2

/**
 * 字符串
 * @author gaoxiaoiduo
 * @date 18/9/28下午3:02
 * @version 1.0
 */
val string: String = "HELLOWORLD"
val fromChars: String = String( )


fun main(args: Array<String>)
{
    println(string)
    println(fromChars)
    // equal
    println(string == fromChars)
    // 对象是否相等
    println(string === fromChars)

    val arg1: Int = 0
    val arg2: Int = 1

    println("$arg1+$arg2=${arg1 + arg2}")

    val salary: Int = 1000
    println("\$$salary")
    val rawString: String = """
        \t
        \n
        \$ salary
    """
    println(rawString)
    println(rawString.length)
    println("------------")
}

