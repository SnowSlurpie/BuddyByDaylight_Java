package com.running.buddybydaylight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import com.running.buddybydaylight.model.Survivors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParamTest {

    @DisplayName("Test that Survivors object is created correctly")
    @ParameterizedTest(name = "{index} => surv_id=''{0}'', surv_name=''{1}'', surv_desc=''{2}'', surv_perk=''{3}''")
    @MethodSource("survivorsProvider")
    public void testCreateSurvivor(int id, String name, String desc, String perk) {
        Survivors survivor = new Survivors(id, name, desc, perk);

        assertEquals(id, survivor.getSurvId());
        assertEquals(name, survivor.getSurvName());
        assertEquals(desc, survivor.getSurvDesc());
        assertEquals(perk, survivor.getSurvPerk());
    }

    static Collection<Object[]> survivorsProvider() {
        return Arrays.asList(new Object[][] {
                { 1, "Dwight Fairfield", "A nervous leader", "Bond" },
                { 2, "Meg Thomas", "An athlete", "Quick & Quiet" },
                { 3, "Claudette Morel", "A medic", "Empathy" },
                { 4, "Jake Park", "A solitary survivalist", "Iron Will" }
        });
    }
}