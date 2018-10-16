package com.gxd.kotlin.chapter3

/**
 *
 * @author gaoxiaoiduo
 * @date 18/10/9下午5:46
 * @version 1.0
 */
class A
{
    var b = 0
        get()
        {
            println("get b")
            return field
        }
        set(value)
        {
            println("set b")
            field = value
        }
}