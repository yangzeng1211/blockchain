package com.yz.day01

/**
 * ClassName: `12.字符串截取`
 * Description： 需求：
    •获取前6个字符
    •把第一个r之前的字符截取
    •把最后一个r之前的字符截取
    •把第一个r之后的字符截取
    •把最后一个r之后的字符截取
 * Author: yz
 * Date: Created in 2018/9/18 22:16
 */
fun main(args: Array<String>) {
    var path = "/Users/yole/kotlin-book/chapter.adoc"
    // 获取前6个字符串
//    println(path.substring(0,6))
      println(path.substring(0..5)) // 0到5
    // 把第一个r之前的字符截取
    println(path.substringBefore("r"))
    // 把最后一个r之前的字符截取 .sout 打印
    println(path.substringBeforeLast("r"))
    // 把第一个r之后的字符截取
    println(path.substringAfter("r"))
    // 把最后一个r之后的字符截取
    println(path.substringAfterLast("r"))
}