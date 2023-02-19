package com.running.buddybydaylight;

import com.running.buddybydaylight.model.Killers;
import com.running.buddybydaylight.model.Survivors;
import com.running.buddybydaylight.repository.KillerRepository;
import com.running.buddybydaylight.repository.SurvivorRepository;
import com.running.buddybydaylight.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class SurvivorRepositoryTest{
    @Autowired
    SurvivorRepository repo;

    @Test
    public void testFindBykName(){

        String survName = "test";
        Survivors expected = new Survivors(500, "test","test","test");
        repo.save(expected);

        Survivors actual = repo.findBysurvName(survName);
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
