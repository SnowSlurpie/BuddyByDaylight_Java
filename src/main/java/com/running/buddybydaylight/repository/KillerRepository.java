package com.running.buddybydaylight.repository;

import com.running.buddybydaylight.model.Killers;
import org.springframework.data.repository.CrudRepository;

public interface KillerRepository extends CrudRepository<Killers, Integer> {

    public Long countById(Integer id);
}