package com.yz.day01;

import java.util.ArrayList;

/**
 * Description： TODO
 * Author: yz
 * Date: Created in 2018/9/17 22:19
 */
public class Test {
    // 快捷键 const 定义常量
    private static final int WEEK = 7;
    public static void main(String[] args) {
        // int数据类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        int a = 10 ;
        int b = a+10;
        Integer it = Integer.valueOf(a);
        int i = it.hashCode();
        // i.sout 打印i
        System.out.println(i);
    }
}
