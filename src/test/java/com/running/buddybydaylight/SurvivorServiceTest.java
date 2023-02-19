package com.running.buddybydaylight;

import com.running.buddybydaylight.model.Survivors;
import com.running.buddybydaylight.repository.SurvivorRepository;
import com.running.buddybydaylight.service.SurvivorService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class SurvivorServiceTest {

    @Autowired
    SurvivorService service;

    @Autowired
    SurvivorRepository repo;

    @Test
    public void testCreateSurvivor() throws Exception{
        Survivors expected = new Survivors(99,"test","test","test");
        service.createSurvivor(expected);
        Survivors actual = repo.findBysurvName("test");
        assertNotNull(actual);

    }
}
