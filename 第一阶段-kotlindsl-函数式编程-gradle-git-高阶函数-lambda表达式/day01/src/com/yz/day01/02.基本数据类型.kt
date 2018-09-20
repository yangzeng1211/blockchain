package com.yz.day01

/**
 * Description： 基本数据类型，文件名建议用英文
    Boolean 1byte        true或false
    Byte    1byte=8bit  -128~127
    Char    2byte
    Short   2byte=16bit -32768~32767
    Int     4byte       -2147483648~2147483647
    Float   4byte       精确到小数点后6位
    Long    8byte       9223372036854775807~9223372036854775807
    Double  8byte       精确到小数点后15到16位
 * Kotlin中没有包装数据类型，自动转换
 * Author: yz
 * Date: Created in 2018/9/17 22:02
 */
fun main(args: Array<String>) {
    // 定义Boolean类型
    var b:Boolean = false
    var byte:Byte = 10
    var int:Int = 20
    var long:Long = 40
    var char:Char = 'a'
    var double:Double = 1.1234567
    var float:Float = 1.1234567f
    var short:Short = 10

    println(b)
}