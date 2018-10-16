package com.gxd.kotlin.chapter4

/**
 *
 * @author gaoxiaoiduo
 * @date 18/10/11下午3:10
 * @version 1.0
 */
abstract class Person(open val age: Int)
{
    open fun work()
    {

    }
}

class MaNong(age: Int) : Person(age)
{
    override val age: Int
        get() = 0

    override fun work()
    {
        super.work()
        println("我是码农，我在写代码")
    }
}

class Doctor(age: Int) : Person(age)
{
    override fun work()
    {
        super.work()
        println("我是医生，我在给人看病")
    }
}

fun main(args: Array<String>)
{
    var person: Person = MaNong(23)
    person.work()
    println(person.age)
    var person2: Person = Doctor(40)
    person2.work()
    println(person2.age)

}