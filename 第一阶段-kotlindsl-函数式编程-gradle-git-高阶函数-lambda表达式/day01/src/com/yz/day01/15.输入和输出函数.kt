package com.yz.day01

/**
 * ClassName: `15.输入和输出函数`
 * Description： 人机交互
 *  输出函数:println()
 *  输入函数:readLine()
 * Author: yz
 * Date: Created in 2018/9/20 21:51
 */
fun main(args: Array<String>) {
    // 输出函数
    var a = 10
    println(a)

    // m+n 从控制台输入m和n
    var m:Int
    var n:Int
    m = readLine()?.toInt()?:-1
    n = readLine()?.toInt()?:-1  // F2 快速定位错误
    println(("m+n=") + (m + n))

}