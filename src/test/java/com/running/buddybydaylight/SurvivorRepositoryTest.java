package com.running.buddybydaylight;

import com.running.buddybydaylight.model.Survivors;
import com.running.buddybydaylight.repository.SurvivorRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class SurvivorRepositoryTest {
    @Autowired
    SurvivorRepository repo;

    @Test
    public void testFindBysurvName(){

        String survName = "test";
        Survivors expected = new Survivors(500, "test","test","test");
        repo.save(expected);

        Survivors actual = repo.findBysurvName(survName);
        assertNotNull(actual);
    }

    @Test
    public void testCountById() {
        SurvivorRepository repo = mock(SurvivorRepository.class);
        when(repo.countBysurvId(1)).thenReturn(1L);
        when(repo.countBysurvId(2)).thenReturn(0L);
        assertEquals(1L, repo.countBysurvId(1).longValue());
        assertEquals(0L, repo.countBysurvId(2).longValue());
    }

}
