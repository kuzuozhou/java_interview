package com.shanlin.exercise.repository;

import com.shanlin.exercise.entity.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person,Long>{

    // TODO 请写下的sql
    // 1）对于Person表，查询用户的最多的城市
    // 2） 
}
