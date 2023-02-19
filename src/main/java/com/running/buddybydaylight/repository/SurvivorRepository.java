package com.running.buddybydaylight.repository;


import com.running.buddybydaylight.model.Survivors;
import org.springframework.data.repository.CrudRepository;

public interface SurvivorRepository extends CrudRepository<Survivors, Integer> {
    //helps us with listing contents of table on associated html page
    public Long countById(Integer survId);

    Survivors findBysurvName(String survName);
}
