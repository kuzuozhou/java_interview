package com.shanlin.exercise;

import com.shanlin.exercise.entity.Person;
import com.shanlin.exercise.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Service;

@Service
public class InitData implements ApplicationRunner{
    @Autowired
    private PersonRepository personRepository;
    @Override
    public void run(ApplicationArguments args) throws Exception {
        personRepository.save(new Person("shanlin1","18","shanghai"));
        personRepository.save(new Person("shanlin2","19","beijing"));
        personRepository.save(new Person("shanlin3","17","beijing"));
        personRepository.save(new Person("shanlin4","58","shanghai"));
    }
}
