package com.yz.day01

/**
 * ClassName: `11.字符串切割`
 * Description： TODO
 * Author: yz
 * Date: Created in 2018/9/18 22:12
 */
fun main(args: Array<String>) {
    var str = "张三，李四-王五"
    // 返回集合 多条件切割
    var result = str.split(",","-")
    println(result)
}