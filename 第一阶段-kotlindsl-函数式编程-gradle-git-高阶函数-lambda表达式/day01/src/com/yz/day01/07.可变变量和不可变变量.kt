package com.yz.day01

/**
 * ClassName: `07.可变变量和不可变变量`
 * Description：
    •可变变量:可以修改的       var   var a = 10
    •不可变变量:圆周率一周7天  val   val b = 20
 * java 编译期常量 private static final int WEEK = 7;
 * val 不可变常量（运行时常量），可以通过反射修改里面的值
 * kotlin常量 const val c = 20
 *
 * 项目开发中尽量使用val , 不可变可以保证程序稳定性
 * Author: yz
 * Date: Created in 2018/9/18 21:11
 */
// 常量
const val c = 20
fun main(args: Array<String>) {
    // 可变变量 var
    var a = 10
    a = 20

    // 不可变变量 val
    val b = 20

}