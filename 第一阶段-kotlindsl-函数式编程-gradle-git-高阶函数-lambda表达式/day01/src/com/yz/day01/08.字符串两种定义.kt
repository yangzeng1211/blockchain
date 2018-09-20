package com.yz.day01

/**
 * ClassName: `08.字符串两种定义`
 * Description：字符串两种定义
 * 需求字符串换行
 * 广东省
 * 深圳市
 * 广安区
 * 查看java代码 double shift -> show byte code -> Decompile
 * Author: yz
 * Date: Created in 2018/9/18 21:26
 */
fun main(args: Array<String>) {
    /*---------------普通字符串-------------------*/
    var place = "广东省深圳市宝安区"
    println(place)
    /*---------------原样输出字符串-------------------*/
    var place1 = """
        广东省
        深圳市
        宝安区
    """.trimIndent()
    println(place1)

}