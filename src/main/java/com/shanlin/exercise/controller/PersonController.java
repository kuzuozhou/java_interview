package com.shanlin.exercise.controller;

import com.shanlin.exercise.entity.Person;
import com.shanlin.exercise.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/person")
public class PersonController {
    // TODO 返回以 {city:[person]}的数据格式
    @GetMapping("/all")
    public Map<String, List<Person>> all(){
        Map<String, List<Person>> result = new HashMap<>();
        return result;
    }
}
