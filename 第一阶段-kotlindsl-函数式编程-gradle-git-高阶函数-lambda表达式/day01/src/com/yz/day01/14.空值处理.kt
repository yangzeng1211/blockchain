package com.yz.day01

/**
 * ClassName: `14.空值处理`
 * Description：
 *  var str:String   非空类型 不能赋值为null
 *  var str: String? 可空类型 可以赋值为null
 *  str? 空安全调用符 ?.
 *
 *  空值处理运算符
        ?可空变量类型         val a:Int? = null
        !!非空断言            var age:String = null!!  不要用
        ?.空安全调用符        age?.toInt()
        ?:Elvis操作符(猫王)   var ageInt:Int = age?.toInt()?:10
 * Author: yz
 * Date: Created in 2018/9/18 22:45
 */
fun main(args: Array<String>) {
    // 10 "10"
    var str: String? = null
    // 转换为Int类型 alt + enter
    // 告诉编译器，不要检查了，我一定不为空，实际值为null，仍然报空指针异常,不建议使用
    // str!!.toInt()
    // 空安全调用符 ?. 返回的值其实就是可空类型
    str?.toInt() // 等于 if(str != null){ str.toInt }

    // 如果str为null，返回-1
    var b:Int = str?.toInt()?:-1
    println(b)

}