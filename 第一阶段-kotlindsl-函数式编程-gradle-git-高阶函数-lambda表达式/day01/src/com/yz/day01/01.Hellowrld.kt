package com.yz.day01

/**
 * Description： Kotlin main  编译：kotlinc Hellowrld.kt 字节码：Hellowrld.Kt.class JVM虚拟机执行
 * Kotlin优化了java代码，使代码更简洁，主要针对java做了优化
 * 查看Kotlin对应的java代码：
 * 1.找到kotlin生成的字节码  Tools –Kotlin –Show Kotlin ByteCode
 * 2.通过字节码反编译为java代码 点击Decompile按钮
 * kotlin 定义变量不加分号
 *
   为什么使用Kotlin?
    •1.简洁(数据类扩展方法区间)
    •2.空值安全(针对空值处理的运算符)
    •3.100%兼容java scala
    •4.函数式编程JDK1.8 lambda表达式
    •5.协程(thread)
    •6.DSL(领域特定语言)
 * Author: yz
 * Date: Created in 2018/9/17 21:14
 */
// 定义main函数 main
fun main(args: Array<String>) {
    println("hellow")
}