package com.running.buddybydaylight.service;

import com.running.buddybydaylight.exception.UserNotFoundException;
import com.running.buddybydaylight.model.User;
import com.running.buddybydaylight.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


/*

This is a service class for User entity which provides CRUD operations using UserRepository.
It contains a UserRepository instance which is autowired and used to retrieve data from the database.
The service layer encapsulates the data access layer, and provides a simpler interface for clients to interact with.
*/
@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    // Returns all users from the database.
    public Iterable<User> listAll() {
        return repo.findAll();
    }

    // Saves a user entity to the database.
    public void save(User user){
        repo.save(user);
    }

    // Creates a new user entity in the database.
// Throws an exception if a user with the same email already exists.
    @Transactional
    public void createUser(User user) throws Exception{
        User userExists = repo.findByEmail((user.getEmail()));
        if(userExists !=null){
            throw new Exception("Account with that email already exists.");
        }
        repo.save(user);
    }

    // Returns a user entity with the given ID.
// Throws an exception if no user entity with the given ID is found in the database.
// Exception Handling
    public User get(Integer id) throws UserNotFoundException {
        Optional<User> result = repo.findById(id);
        if (result.isPresent()){
            return result.get();
        }
        throw new UserNotFoundException("Could not find any users with ID" + id);
    }

    // Deletes a user entity with the given ID from the database.
// Throws an exception if no user entity with the given ID is found in the database.
    public void delete(Integer id) throws UserNotFoundException {
        Long count = repo.countById(id);
        if (count == null || count == 0 ){
            throw new UserNotFoundException("Could not find any users with ID " + id);
        }
        repo.deleteById(id);
    }
}
