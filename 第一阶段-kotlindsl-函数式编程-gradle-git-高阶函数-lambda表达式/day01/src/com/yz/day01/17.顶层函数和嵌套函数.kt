package com.yz.day01

/**
 * ClassName: `17.顶层函数和嵌套函数`
 * Description： TODO
 * Author: yz
 * Date: Created in 2018/9/20 22:10
 */
// 函数式编程 对于kotlin来说，函数是一等公民 函数可以独立于对象单独存在
fun main(args: Array<String>) {
    // 嵌套函数，只定义不调用，不打印
    fun sayHello(){
        println("hello")
    }
    // 调用嵌套函数
    sayHello()
}

// 顶层函数，没有在对象中
fun haha(){

}
