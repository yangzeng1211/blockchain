package com.yz.day01

/**
 * ClassName: `18.字符串模板`
 * Description： TODO
 * Author: yz
 * Date: Created in 2018/9/20 22:19
 */
fun main(args: Array<String>) {
    val result = createDiary("天安门")
    println(result)
}
// 生成日记模板,返回string
fun createDiary(place:String):String{
    // java写法
    // var result = "今天天气晴朗，万里无云，我们去"+place+"游玩，首先映入眼帘的是，"+place+place.length+"个镏金大字。"
    // kotlin写法 ${}可以传变量，也可以调用函数
    var result = "今天天气晴朗，万里无云，我们去${address(place)}游玩，首先映入眼帘的是，${place}${place.length}个镏金大字。"
    return result
}

fun address(place: String):String{
    return place
}