package com.shanlin.exercise.service;

import java.util.List;

public class Problem2Service<T extends Problem2Service.Person> {
    public List<T> convert(T[] a) {
        // TODO 对A中的所有元素排序：name 正序（null最前），age倒叙（null最后）。T 为 null对象放在最后。
        // 返回的list不能被其他类修改,并且是线程安全的
        return null;
    }

    public static class Person {
        private String name;
        private String age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }
    }
}
