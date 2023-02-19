package com.running.buddybydaylight.service;

import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.model.Survivors;
import com.running.buddybydaylight.repository.SurvivorRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SurvivorService {

    @Autowired
    private SurvivorRepository repo;

    public Iterable<Survivors> listAll() {
        return repo.findAll();
    }

    public void save(Survivors survivors){
        repo.save(survivors);
    }

    @Transactional
    public void createSurvivor(Survivors survivors) throws Exception{
        Survivors survExists = repo.findBysurvName((survivors.getSurvName()));
        if(survExists !=null){
            throw new Exception("Account with that email already exists.");
        }
        repo.save(survivors);
    }

    //    Exception Handling
    public Survivors get(Integer id) throws UserNotFoundException {
        Optional<Survivors> result = repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new UserNotFoundException("Could not find any Survivors with ID" + id);
    }


    public void delete(Integer id) throws UserNotFoundException {
        Long count = repo.countBysurvId(id);
        if (count == null || count == 0 ){
            throw new UserNotFoundException("Could not find any Survivors with ID " + id);
        }
        repo.deleteById(id);
    }
}

