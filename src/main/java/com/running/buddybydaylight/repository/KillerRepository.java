package com.running.buddybydaylight.repository;

import com.running.buddybydaylight.model.Killers;
import com.running.buddybydaylight.model.User;
import org.springframework.data.repository.CrudRepository;

public interface KillerRepository extends CrudRepository<Killers, Integer> {
//helps us with listing contents of table on associated html page
    public Long countById(Integer id);

    Killers findBykName(String kName);
}