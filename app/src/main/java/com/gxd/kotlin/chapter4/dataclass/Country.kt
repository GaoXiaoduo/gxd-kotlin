package com.gxd.kotlin.chapter4.dataclass

import com.gxd.kotlin.chapter4.annotations.PoKo


/**
 * java bean
 * @author gaoxiaoiduo
 * @date 18/10/15下午2:34
 * @version 1.0
 */
// data 打印时自动输出key,value
@PoKo
data class Country(val id: Int, val name: String)


class ComponentX
{
    operator fun component1(): String
    {
        return "您好！我是："
    }

    operator fun component2(): Int
    {
        return 1
    }

    operator fun component3(): Int
    {
        return 1
    }

    operator fun component4(): Int
    {
        return 0
    }
}

fun main(args: Array<String>)
{

    val country = Country(0, "中国")
    println(country)
    val componentX = ComponentX()
    val (a, b, c, d) = componentX
    println("$a $b $c $d")
}