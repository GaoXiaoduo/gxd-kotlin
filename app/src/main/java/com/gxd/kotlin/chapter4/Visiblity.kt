package com.gxd.kotlin.chapter4

/**
 *
 * @author gaoxiaoiduo
 * @date 18/10/11下午5:44
 * @version 1.0
 */

class House

class Flower


open class ForbiddenCity()
{
    protected val house: House = House()
    val flower: Flower = Flower() //kotlin默认为public
}

class SunForbiddenCity : ForbiddenCity()
{
    fun test()
    {
        house
        flower
    }
}

fun main(args: Array<String>)
{
    var forbiddenCity: ForbiddenCity = ForbiddenCity()
    //forbiddenCity.house protected只有子类可以引用
    forbiddenCity.flower
    var sunForbiddenCity: SunForbiddenCity = SunForbiddenCity()
    sunForbiddenCity.flower
}
