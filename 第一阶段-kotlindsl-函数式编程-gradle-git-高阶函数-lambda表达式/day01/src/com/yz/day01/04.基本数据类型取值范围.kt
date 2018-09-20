package com.yz.day01

/**
 * ClassName: `04.基本数据类型取值范围`
 * Description： 通过kotlin api调用查询
 * 1byte=8bit
    1bit(位): 0 1 两种状态
    2bit(位):00 01 10 11 四种状态
    3bit(位):000 001 010 011 100 101 110 111 八种状态
    4bit(位):0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111 十六种状态

    计算机存储数据用二进制存储
    •1位二进制存储2种状态
    •2位二进制存储4种状态
    •3位二进制存储8种状态
    •4位二进制存储16种状态
    •
    …
    •N位二进制存储2的N次方种状态
 * Author: yz
 * Date: Created in 2018/9/17 22:36
 */
fun main(args: Array<String>) {
    var maxShort:Short = Short.MAX_VALUE
    var minShort:Short = Short.MIN_VALUE
    // maxShort.sout 打印 32767 -32768
    println(maxShort)
    println(minShort)

    var maxByte:Byte = Byte.MAX_VALUE
    var minByte:Byte = Byte.MIN_VALUE
    println(maxByte)
    println(minByte)

    var maxInt:Int = Int.MAX_VALUE
    var minInt:Int = Int.MIN_VALUE
    println(maxInt)
    println(minInt)

    var maxLong:Long = Long.MAX_VALUE
    var minLong:Long = Long.MIN_VALUE
    println(maxLong)
    println(minLong)

    var maxFloat:Float = Float.MAX_VALUE
    var minFloat:Float = -Float.MAX_VALUE // 最小值
    println(maxFloat)
    println(minFloat)

    var maxDouble:Double = Double.MAX_VALUE
    var minDouble:Double = -Double.MAX_VALUE // 最小值
    println(maxDouble)
    println(minDouble)

}