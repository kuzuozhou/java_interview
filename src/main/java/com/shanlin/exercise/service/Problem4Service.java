package com.shanlin.exercise.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem4Service {
    // TODO 这个是一个job的内部逻辑，数据库中查询出来1000000条记录，然后逐条进行业务操作
    // 请问
    // 1）当运行至590910条记录时，系统需要发版，这个问题怎么解决
    // 2） 现在有性能问题，请如何解决（使用增加机器的方式解决）
    public void job(){
        List<Object> objects = getDataFromDB();
        for(Object tem : objects) {
            System.out.println(tem);
        }
    }

    private List<Object> getDataFromDB(){
        return new ArrayList<>();
    }
}
