package com.shanlin.exercise.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class ExerciseController {

    // TODO 下面的方法测试中，任选两题，请作答
    @GetMapping("/fibonacci")
    public Long getFibonacci(@RequestParam("n") String n){
        // TODO 完成斐波那契数列，n(<=50)，返回对应的 f(n)
        // index=1，return=1
        //index=2，return=1
        //index=3,return = 2
        //index=4, return = 3
        // ......
        return null;
    }

    @GetMapping("/24dian")
    public String print24Algorithm(@RequestParam("n")List<Integer> n){
        // TODO 输入4个数字（1-10），返回对应的24点的算法
        return null;
    }

    // TODO 打印数字
    //用1、2、2、3、4、5这六个数字，用java写一个main函数，打印出所有不同的排列，
    // 如：512234、412345等，要求："4"不能在第三位，"3"与"5"不能相连。
    public List<String> getlist(){
        return null;
    }
    // TODO 设计一个算法，计算出n(<100000)阶乘中尾部零的个数
    // 11! = 39916800，因此应该返回 2
    public Integer getZeroSize(@RequestParam("n") Integer n) {
        return null;
    }
}
