package com.running.buddybydaylight;

import com.running.buddybydaylight.model.User;
import com.running.buddybydaylight.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


@SpringBootTest
public class UserRepositoryTest {

    @Autowired
    UserRepository repo;

//    test to find users by email
    @Test
    public void testFindByEmail(){

        String email = "test1234@test.com";
        User expected = new User(1,"test1234@test.com", "test","testing102");
        repo.save(expected);

        User actual = repo.findByEmail(email);
        assertNotNull(actual);
    }

//    test to add new users
    @Test
    public void testAddNew(){

        User user = new User();
        user.setEmail("bligblingboy@test.com");
        user.setPassword("test987");
        user.setUserName("bbBoy101");

        User savedUser = repo.save(user);

        Assertions.assertThat(savedUser).isNotNull();
        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);


    }

    @Test
    public void testCountById() {
        UserRepository repo = mock(UserRepository.class);
        when(repo.countById(1)).thenReturn(1L);
        when(repo.countById(2)).thenReturn(0L);
        assertEquals(1L, repo.countById(1).longValue());
        assertEquals(0L, repo.countById(2).longValue());
    }

}
