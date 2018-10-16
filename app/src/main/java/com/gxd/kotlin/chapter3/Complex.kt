package com.gxd.kotlin.chapter3

/**
 *
 * @author gaoxiaoiduo
 * @date 18/10/9下午6:29
 * @version 1.0
 */
class Complex(var real: Double, var imaginary: Double)
{

   operator fun plus(other: Complex): Complex
    {
        return Complex(real + other.real, imaginary + other.imaginary)
    }

    override fun toString(): String
    {
        return "$real+${imaginary}i"
    }
}

fun main(args: Array<String>)
{
    val c1 = Complex(2.0, 5.0)
    val c2 = Complex(3.0, 4.0)
    println(c1 + c2)
    println("$c1 plus $c2=${c1 + c2}")
}