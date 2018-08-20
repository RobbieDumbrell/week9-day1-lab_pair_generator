import models.Cohort;
import models.Student;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

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

    @Test
    public void canSelectOneRandomStudentAndListDoesNotDecrease(){
        Student aStudent = e23.selectRandomStudent();
        assertEquals(20, e23.getStudents().size());
    }

    @Test
    public void canGeneratePairAndListDoesNotDecrease(){
        ArrayList<Student> randomPair = e23.selectRandomPair();
        assertEquals(20, e23.getStudents().size());
    }

    @Test
    public void canGenerateDifferentGroupSizes(){
        ArrayList<Student> groupOfFour = e23.selectRandomGroup(4);
        ArrayList<Student> groupOfFive = e23.selectRandomGroup(5);
        ArrayList<Student> groupOfSix = e23.selectRandomGroup(6);
        ArrayList<Student> groupOfTwo = e23.selectRandomGroup(2);
        ArrayList<Student> groupOfOne = e23.selectRandomGroup(1);
        ArrayList<Student> groupOfZero = e23.selectRandomGroup(0);
        ArrayList<Student> groupOfTwentyOne = e23.selectRandomGroup(21);
        assertEquals(4, groupOfFour.size());
        assertEquals(5, groupOfFive.size());
        assertEquals(6, groupOfSix.size());
        assertEquals(2, groupOfTwo.size());
        assertEquals(1, groupOfOne.size());
        assertEquals(0, groupOfZero.size());
        assertEquals(null, groupOfTwentyOne);
    }
}
