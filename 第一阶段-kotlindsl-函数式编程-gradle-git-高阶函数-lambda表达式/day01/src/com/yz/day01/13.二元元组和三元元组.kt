package com.yz.day01

/**
 * ClassName: `13.二元元组和三元元组`
 * Description：给多个变量同时赋值
    •二元元组Pair
    •三元元组Triple
 * Author: yz
 * Date: Created in 2018/9/18 22:28
 */
fun main(args: Array<String>) {
    // 定义二元元组 保存 姓名 年龄
    // var pair = Pair<String,Int>("张三",20)  // 常规写法
    var pair = "张三" to 20  // 简洁写法
    println(pair.first)
    println(pair.second)

    // 定义三元元组
    var triple = Triple<String,Int,String>("张三",20,"北京")
    println(triple.first)
    println(triple.second)
    println(triple.third)
}
