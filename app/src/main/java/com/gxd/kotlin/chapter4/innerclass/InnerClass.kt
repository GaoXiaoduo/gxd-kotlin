package com.gxd.kotlin.chapter4.innerclass

/**
 * 内部类外部类
 * @author gaoxiaoiduo
 * @date 18/10/16上午10:58
 * @version 1.0
 */
open class Outer
{
    var a: Int = 0

    class Inner
    {
        var a: Int = 5

        //默认静态内部类
        //静态内部类不持有外部类的引用
        fun hello()
        {
            println(a)
        }
    }

    inner class Inner2
    {
        //+inner后为非静态内部
        var a: Int = 10

        fun hello()
        {
            println(this@Outer.a)  //a=0
            println(a)             //a=10
            println(this.a)        //a=10
            println(this@Inner2.a) //a=10
        }
    }
}

interface OnClickListener
{
    fun OnClick()
}

class View
{
    var onClickListener: OnClickListener? = null
}

fun main(args: Array<String>)
{
    val inner = Outer.Inner()
    val inner2 = Outer().Inner2()
    val view = View()
    view.onClickListener = object : Outer(), OnClickListener
    {
        override fun OnClick()
        {

        }
    }
}