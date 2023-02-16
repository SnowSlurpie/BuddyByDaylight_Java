package com.running.buddybydaylight;

import com.running.buddybydaylight.model.User;
import com.running.buddybydaylight.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {

    @Autowired
    private UserRepository repo;

    @Test
    public void testAddnew() {
        User user = new User();

        user.setEmail("test@test.org");
        user.setPassword("test3lol");
        user.setUserName("Peepee");

//        User savedUser = repo.save(user);
//        Assertions.assertThat(savedUser).isNotNull();
//       assertThat(savedUser.getId()).isGreaterThen(0);

//        TODO: Fix testing--review testing documents and see if we can just execute another way tbh check 52:36 to pickup  https://www.youtube.com/watch?v=u8a25mQcMOI&t=387s
//    }
//        @Test
//                public void testListAll()  {
//                    Iterable<User> users = repo.findAll();
//                    Assertions.assertThat(users).hasSizeGreaterThan(0);
//
//                    for (User user : users) {
//                        System.out.println(user);
//                    }
//        }
//@Test public testUpdate(){
//            Integer userId = 1
//            Optional<User> optionalUser = repo.findById(userId);
//
//    User user = optionalUser.get();
//    user.setPassword("hehehehe");
//    repo.save(user);
//
//    User updatedUser = repo.findById(userId).get();
//    Assertions.assertThat(updatedUser.getPassword()).isEqualTo("hehehehe");
//
//        }

    }
}
