package com.running.buddybydaylight.service;


import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.model.Killers;
import com.running.buddybydaylight.repository.KillerRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class KillerService {

    @Autowired
    private KillerRepository repo;

    // Returns all the Killers present in the repository
    public Iterable<Killers> listAll() {
        return repo.findAll();
    }

    // Saves a new Killer instance to the repository
    public void save(Killers killers) {
        repo.save(killers);
    }

    // Creates a new Killer instance and saves it to the repository
// Throws an exception if a Killer with the same name already exists
    @Transactional
    public void createKiller(Killers killers) throws Exception{
        Killers killExists = repo.findBykName((killers.getkName()));
        if(killExists !=null){
            throw new Exception("Killer with that name already exists.");
        }
        repo.save(killers);
    }

    // Retrieves a Killer instance by its id
// Throws an exception if the id is not present in the repository
    public Killers get(Integer id) throws UserNotFoundException {
        Optional<Killers> result = repo.findById(id);
        if (result.isPresent()) {
            return result.get();
        }
        throw new UserNotFoundException("Could not find any Killers with ID " + id);
    }

    // Deletes a Killer instance by its id
// Throws an exception if the id is not present in the repository
    public void delete(Integer id) throws UserNotFoundException {
        Long count = repo.countById(id);
        if (count == null || count == 0 ){
            throw new UserNotFoundException("Could not find any users with ID " + id);
        }
        repo.deleteById(id);
    }
}