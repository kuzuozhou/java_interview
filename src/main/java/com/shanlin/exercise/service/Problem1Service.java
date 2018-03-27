package com.shanlin.exercise.service;

public class Problem1Service {
    public void problem1() {

        methodA();
        methodB();
        methodC();
        // TODO 如果这个方法被100个controller调用，
        // 现在需要修改这个方法，增加调用methodD
        // 当接受MethodDException，希望能会的特定的错误编码
        // 请问如何设计最为简洁
    }

    private void methodA(){

    };
    private void methodB(){

    };
    private void methodC(){

    };
    private void methodD() throws MethodDException {
    }

    public static class MethodDException extends RuntimeException{

    }
}
