package com.yz.day01

import java.math.BigDecimal

/**
 * ClassName: `05.kotlin调用java`
 * Description： TODO
 * Author: yz
 * Date: Created in 2018/9/18 20:40
 */
fun main(args: Array<String>) {
    // 1.123456789123456789
    // 存钱
    var money:Double = 1.123456789123456789
    // 取钱 1.1234567891234568 少一位
    println(money)

    // 银行存钱 调用java代码 BigDecimal()
    var bigDe:BigDecimal = BigDecimal("1.123456789123456789") // 省略new关键字 没有分号
    // 取钱
    println(bigDe)

}