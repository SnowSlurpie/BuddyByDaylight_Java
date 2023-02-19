package com.running.buddybydaylight.repository;

import com.running.buddybydaylight.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    //helps us with listing contents of table on associated html page
    public Long countById(Integer id);
    User findByEmail(String email);

}
