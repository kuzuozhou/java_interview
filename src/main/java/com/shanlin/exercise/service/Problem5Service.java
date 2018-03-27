package com.shanlin.exercise.service;

import javax.transaction.Transactional;

public class Problem5Service {
    @Transactional
    public void methodA(){

    }
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void methodB(){

    }
    public void methodC(){
        methodA();
        methodB();
    }
    // TODO 事务相关
    // 1） methodA和methodB有什么区别
    // 2） 调用methodC会有几个事务产生，为什么？
}
