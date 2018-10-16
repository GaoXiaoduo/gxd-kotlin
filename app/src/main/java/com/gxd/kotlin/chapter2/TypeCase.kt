package com.gxd.kotlin.chapter2

/**
 *
 * @author gaoxiaoiduo
 * @date 18/9/29下午2:51
 * @version 1.0
 */
fun main(args: Array<String>)
{
    val parent: Parent? = Parent()
    val child: Child? = parent as? Child
    println(child)


    val string: String? = "Hello World!"
    println(string!!.length)
}