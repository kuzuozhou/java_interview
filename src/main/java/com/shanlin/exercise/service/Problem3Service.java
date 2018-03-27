package com.shanlin.exercise.service;

import java.util.Random;

public class Problem3Service {

    public void exercise() {
        new Exercise("thread1").start();
        new Exercise("thread2").start();
        new Exercise("thread3").start();
        new Exercise("thread4").start();
        // TODO 希望下面的方法在所有的子线程运行结束后运行
        // 请问应该如何修改相关的代码
        System.out.print("子线程运行结束了");
    }

    public static class Exercise extends Thread {
        private String threadName;

        public Exercise(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print("线程["+threadName +"]运行结束了");
        }
    }


}
