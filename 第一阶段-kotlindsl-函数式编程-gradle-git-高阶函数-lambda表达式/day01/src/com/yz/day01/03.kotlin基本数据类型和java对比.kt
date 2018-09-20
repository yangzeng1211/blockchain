package com.yz.day01

/**
 * Description： 03.kotlin基本数据类型和java对比
 * Kotlin中没有包装数据类型，自动转换
 * Shift 按两次 搜索show bytecode ，点击Decompile 查看对应java代码
 * Author: yz
 * Date: Created in 2018/9/17 22:18
 */
fun main(args: Array<String>) {
    var a:Int = 10
    // 基本数据类型
    var b:Int = a+10
    // 调用hashcode
    val hashCode:Int = a.hashCode()
    // hashCode.sout 打印hashCode
    println(hashCode)
}