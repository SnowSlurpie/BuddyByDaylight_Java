package com.running.buddybydaylight;

import com.running.buddybydaylight.model.Killers;
import com.running.buddybydaylight.repository.KillerRepository;
import com.running.buddybydaylight.repository.UserRepository;
import com.running.buddybydaylight.service.KillerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class KillerRepositoryTest {

    @Autowired
    KillerService service;
    @Autowired
    KillerRepository repo;

    @Test
    public void testFindBykName(){

        String kName = "test";
        Killers expected = new Killers(500, "test","testy","testing","tests","Tester");
        repo.save(expected);

        Killers actual = repo.findBykName(kName);
        assertNotNull(actual);
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


