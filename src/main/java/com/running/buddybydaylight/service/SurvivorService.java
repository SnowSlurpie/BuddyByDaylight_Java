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

    /**
     * Returns an Iterable of all Survivors in the database.
     */
    public Iterable<Survivors> listAll() {
        return repo.findAll();
    }

    /**
     * Saves the given Survivor object to the database.
     */
    public void save(Survivors survivors){
        repo.save(survivors);
    }

    /**
     * Creates a new Survivor in the database with the given information.
     * Throws an exception if a Survivor with the same name already exists.
     */
    @Transactional
    public void createSurvivor(Survivors survivors) throws Exception{
        Survivors survExists = repo.findBysurvName((survivors.getSurvName()));
        if(survExists !=null){
            throw new Exception("Survivor with that name already exists.");
        }
        repo.save(survivors);
    }

    /**
     * Returns the Survivor with the given ID.
     * Throws a UserNotFoundException if no Survivor is found with the given ID.
     */
    public Survivors get(Integer id) throws UserNotFoundException {
        Optional<Survivors> result = repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new UserNotFoundException("Could not find any Survivors with ID" + id);
    }

    /**
     * Deletes the Survivor with the given ID.
     * Throws a UserNotFoundException if no Survivor is found with the given ID.
     */
    public void delete(Integer id) throws UserNotFoundException {
        Long count = repo.countBysurvId(id);
        if (count == null || count == 0 ){
            throw new UserNotFoundException("Could not find any Survivors with ID " + id);
        }
        repo.deleteById(id);
    }
}

