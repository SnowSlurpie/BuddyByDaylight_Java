package com.running.buddybydaylight.service;

import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.model.User;
import com.running.buddybydaylight.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired private UserRepository repo;

    public Iterable<User> listAll() {
        return repo.findAll();
    }

    public void save(User user){
        repo.save(user);
    }
    
    public User get(Integer id) throws UserNotFoundException {
        Optional<User> result = repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new UserNotFoundException("Could not find any users with ID" + id);
    }


    public void delete(Integer id) throws UserNotFoundException {
        Long count = repo.countById(id);
        if (count == null || count == 0 ){
            throw new UserNotFoundException("Could not find any users with ID " + id);
        }
        repo.deleteById(id);
    }
}