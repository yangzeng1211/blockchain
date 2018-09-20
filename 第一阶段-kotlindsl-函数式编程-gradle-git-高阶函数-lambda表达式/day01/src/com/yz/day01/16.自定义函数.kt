package com.yz.day01

/**
 * ClassName: `16.自定义函数`
 * Description： 四种函数
 * Author: yz
 * Date: Created in 2018/9/20 22:02
 */
fun main(args: Array<String>) {
    println(getLength("张三"))
}
// 无参无返回值 ， 其实有返回值，返回:Unit(对象) 默认省略（void 不是对象）
fun sayHello(){
    println("hello")
}
// 有参无返回值
fun sayHello(name:String){
    println("hello " + name)
}
// 有参有返回值，返回Int
fun getLength(name:String):Int{
    return name.length
}
// 无参有返回值
fun get():String{
    return "hello"
}