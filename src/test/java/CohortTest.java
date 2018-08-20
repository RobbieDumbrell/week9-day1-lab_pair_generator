import models.Cohort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CohortTest {

    Cohort e23;

    @Before
    public void before(){
        e23 = new Cohort("E23");
    }

    @Test
    public void cohortHasName(){
        assertEquals("E23", e23.getName());
    }

    @Test
    public void cohortHas20Students(){
        assertEquals(20, e23.getStudents().size());
    }

}
