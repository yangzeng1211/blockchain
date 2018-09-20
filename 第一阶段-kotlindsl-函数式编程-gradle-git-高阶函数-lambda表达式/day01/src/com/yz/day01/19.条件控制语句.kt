package com.yz.day01

/**
 * ClassName: `19.条件控制语句`
 * Description： kotlin 一般都有返回值（函数式编程 闭包）
 * ctrl + alt + l 代码格式化
 * Java声明式语法    声明no return value
 * Kotlin表达式语法 表达式return value
 * Author: yz
 * Date: Created in 2018/9/20 22:31
 */
fun main(args: Array<String>) {
    var a = 10
    var b = 20
    println(max(a, b))
}

// 查找最大值
// kotlin没有三元运算符
//fun max(a: Int, b: Int): Int {
//    if (a > b) {
//        return a
//    } else {
//        return b
//    }
//}
// 如果只有一行，可以去掉{}
//fun max(a: Int, b: Int): Int {
//    if (a > b)
//        return a
//     else
//        return b
//}
// kotin if else写法
// kotli的if语句有返回值,java if语句没有返回值
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}