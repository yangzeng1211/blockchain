package com.yz.day01

/**
 * ClassName: `06.智能类型推断和类型转换`
 * Description： var b = 10
 * Author: yz
 * Date: Created in 2018/9/18 20:52
 */
fun main(args: Array<String>) {
    /*-------------------kotlin智能类型推断---------------------*/
    // 类型安全的语言，类型一旦确定，不再改变了
    // kotlin编译器推断出Int类型
    var a:Int = 10
    var b = 10
    var e = 10L // long
    var c = "张三"
    var d = 'a'

    /*-------------------kotlin类型转换---------------------*/
    // String 和 int 类型转换
    var m = 10
    var s = "10"
    println(s.toInt())

    // 不同的数据类型不能相互赋值
    var u = 10
    var v = 10L
    v = u.toLong() // Int赋值给Long类型
    u = v.toInt()  // Long赋值给Int类型

}