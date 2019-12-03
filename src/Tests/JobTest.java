package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;

public class JobTest {


    Job test_Job1 ;
    Job test_Job2 ;

    @Test
    public void testSettingJobId() {

    }
    @Before
    public void createJobObjects() {
        test_Job1 = new Job();
        test_Job2 = new Job();

    }
@Test
    public void checkIdSequence() {
        assertEquals(1,test_Job2.getId() - test_Job1.getId());
}
@Test
    public void testJobConstructorSetsAllFields() {
    Job test_Job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(true, test_Job3.getEmployer() instanceof Employer);
    assertEquals(true, test_Job3.getLocation() instanceof Location);
    assertEquals(true, test_Job3.getPositionType() instanceof PositionType);
     assertEquals(true,test_Job3.getCoreCompetency() instanceof CoreCompetency);

}
    @Test
    public void testJobsForEquality() {
        Job test_Job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_Job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(false, test_Job4.equals(test_Job5) );
    }
    @Test
    public void testToString(){

        Job test_Job6 = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));


       assertEquals(true,test_Job6.toString().endsWith("\n"));
       assertEquals(true,test_Job6.toString().startsWith("\n"));
        assertEquals(true,test_Job6.toString().contains("ID:"));
        assertEquals(true,test_Job6.toString().contains("Name:"));
        assertEquals(true,test_Job6.toString().contains("Employer:"));
        assertEquals(true,test_Job6.toString().contains("Location:"));
        assertEquals(true,test_Job6.toString().contains("Position Type:"));
        assertEquals(true,test_Job6.toString().contains("Core Competency:"));
        assertEquals(true,test_Job6.toString().contains("Employer: Data not available"));

        System.out.println("ravee" + test_Job6.toString());
    }
}
