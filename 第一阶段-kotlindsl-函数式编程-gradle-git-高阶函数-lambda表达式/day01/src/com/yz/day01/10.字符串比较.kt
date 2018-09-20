package com.yz.day01

/**
 * ClassName: `10.字符串比较`
 * Description： TODO
 * Author: yz
 * Date: Created in 2018/9/18 22:06
 */
fun main(args: Array<String>) {
    var str1 = "abc"
    var str2 = String(charArrayOf('a','b','c'))
    // equals 比较值 true
    println(str1.equals(str2))
    // == 比较的也是值 true
    println(str1 == str2)
    // === 比较内存地址值 false
    println(str1 === str2)

}