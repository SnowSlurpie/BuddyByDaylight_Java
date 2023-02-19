package com.running.buddybydaylight;


import com.running.buddybydaylight.model.User;
import com.running.buddybydaylight.repository.UserRepository;
import com.running.buddybydaylight.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class UserServiceTest {


    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;

    @Test
    public void testCreateUser() throws Exception {
        User expected = new User(12,"test4@test.com", "test","testing4");
        userService.createUser(expected);
        User actual = userRepository.findByEmail("test4@test.com");
        assertNotNull(actual);
    }
}
