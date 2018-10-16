package com.gxd.kotlin.chapter4

/**
 *
 * @author gaoxiaoiduo
 * @date 18/10/11上午10:32
 * @version 1.0
 */
interface InputDevice
{
    fun input(event: Any)
}

interface USBInputDevice : InputDevice
interface BLEInputDevice : InputDevice

class USBMouse(val name: String) : USBInputDevice
{
    override fun input(event: Any)
    {
        println("usb mouse input event:$event")
    }

    override fun toString(): String
    {
        return name
    }

}

class Computer
{
    fun addUSBIputDevice(inputDevice: USBInputDevice)
    {
        println("add usb input device:$inputDevice")
    }

    fun addBLEInputDevice(inputDevice: BLEInputDevice)
    {
        println("add ble input device:$inputDevice")
    }

    fun addInputDevice(inputDevice: InputDevice)
    {
        when (inputDevice)
        {
            is BLEInputDevice -> addBLEInputDevice(inputDevice)
            is USBInputDevice -> addUSBIputDevice(inputDevice)
            else              -> throw IllegalAccessException("输入设备类型不支持！") as Throwable
        }
    }
}

fun main(args: Array<String>)
{
    var computer = Computer()
    var usbInputDevice = USBMouse("罗技鼠标")
    usbInputDevice.input("罗技鼠标输入")
    computer.addInputDevice(usbInputDevice)

}