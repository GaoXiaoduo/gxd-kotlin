package com.gxd.kotlin.chapter4

/**
 *
 * @author gaoxiaoiduo
 * @date 18/10/11下午4:01
 * @version 1.0
 */
interface Dirver
{
    fun dirve()

    fun dirveBus()
}

interface Writer
{
    fun write()

}

class Manager : Dirver, Writer
{
    override fun dirve()
    {

    }

    override fun dirveBus()
    {

    }

    override fun write()
    {

    }
}

class SeniorManager(val dirver: Dirver, val writer: Writer) : Dirver by dirver, Writer by writer

class CarDirve : Dirver
{
    override fun dirve()
    {
        println("我是car dirve ,我在开车呦！")
    }

    override fun dirveBus()
    {
        println("我是car dirve bus  ,我在开bus呦！")
    }

    fun dirveCar()
    {
        println("我是car dirve car  ,我在开car呦！")
    }
}

class PPTWriter : Writer
{
    override fun write()
    {
        println("我是 ppt writer,我在写ppt呦!")
    }

}

fun main(args: Array<String>)
{
    var dirver = CarDirve()
    var writer = PPTWriter()
    var manager = SeniorManager(dirver, writer)
    manager.dirve()
    manager.dirveBus()
    manager.write()
}









