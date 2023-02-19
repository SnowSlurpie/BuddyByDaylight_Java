package com.running.buddybydaylight;


import com.running.buddybydaylight.model.Killers;
import com.running.buddybydaylight.repository.KillerRepository;
import com.running.buddybydaylight.service.KillerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class KillerServiceTest {

    @Autowired
    KillerService service;

    @Autowired
    KillerRepository repo;

    @Test
    public void testCreateKiller() throws Exception{

        Killers expected = new Killers(99, "test","test","test","test","test");
        service.createKiller(expected);
        Killers actual = repo.findBykName("test");
        assertNotNull(actual);

    }
}
