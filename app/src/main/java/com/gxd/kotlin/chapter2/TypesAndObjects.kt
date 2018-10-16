package com.gxd.kotlin.chapter2

/**
 *
 * @author gaoxiaoiduo
 * @date 18/9/28下午4:15
 * @version 1.0
 */
class 妹子(性格: String, 长相: String, 声音: String) : 人(性格, 长相, 声音)
{
    //    init
    //    {
    //        println("妹子的构造方法：new 了一个妹子，性格：$性格，长相：$长相，声音：$声音")
    //    }
}

class 帅哥(性格: String, 长相: String, 声音: String) : 人(性格, 长相, 声音)
{
    //    init
    //    {
    //        println("帅哥的构造方法：new 了一个帅哥，性格：$性格，长相：$长相，声音：$声音")
    //    }
}

open class 人(var 性格: String, var 长相: String, var 声音: String)
{
    init
    {
        println("父类－人：new 了一个${this.javaClass.simpleName}，性格：$性格，长相：$长相，声音：$声音")
    }
}

fun main(args: Array<String>)
{
    val 我喜欢的妹子: 妹子 = 妹子("开朗", "甜美", "动人")
    val 我喜欢的帅哥: 帅哥 = 帅哥("憨厚", "帅气", "浑厚")

    println(我喜欢的妹子 is 人)
    println(我喜欢的帅哥 is 人)
}