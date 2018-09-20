package com.yz.day01

/**
 * ClassName: `09.字符串删除空格`
 * Description： TODO
 * Author: yz
 * Date: Created in 2018/9/18 21:54
 */
fun main(args: Array<String>) {
    // 普通字符串删除空格
    var str = "  张三  "
    var s = str.trim()
    println(s)
    // 原样输出字符串 , 去掉|（含） 之前的空格
    var str1 = """
        |张三
        |李四
        |王五
    """.trimMargin("|")
    println(str1)
}