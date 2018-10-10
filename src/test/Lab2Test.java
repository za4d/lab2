import org.junit.Test;
import static org.junit.Assert.*;

public class Lab2Test {
    private Lab2 lab = new Lab2();

    @Test
    public void testPercentageOf() {
        assertEquals(50.0, lab.percentageOf(50,100), 0.0);
        assertEquals(25.0, lab.percentageOf(1,4), 0.0);
        assertEquals(75.0, lab.percentageOf(6,8), 0.0);
        assertEquals(0.0, lab.percentageOf(0,42), 0.0);
        assertEquals(100.0, lab.percentageOf(23,23), 0.0);
        assertEquals(200.0, lab.percentageOf(216,108), 0.0);
    }

    @Test
    public void testOverallModuleMark() {
        assertEquals(0.0, lab.overallModuleMark(0,0,0), 0.1);
        assertEquals(100.0, lab.overallModuleMark(100,100,100), 0.1);
        assertEquals(15.0, lab.overallModuleMark(100,0,0), 0.1);
        assertEquals(25.0, lab.overallModuleMark(0,100,0), 0.1);
        assertEquals(60.0, lab.overallModuleMark(0,0,100), 0.1);
        assertEquals(40.0, lab.overallModuleMark(100,100,0), 0.1);
        assertEquals(62.5, lab.overallModuleMark(50,100,50), 0.1);
        assertEquals(15.5, lab.overallModuleMark(30,20,10), 0.1);
        assertEquals(24.5, lab.overallModuleMark(10,20,30), 0.1);
        assertEquals(72.715, lab.overallModuleMark(63.4f,42.1f,87.8f), 0.1);
    }

    @Test
    public void testDesiredExamMarkToAchieve() {
        assertEquals(0.0, lab.desiredExamMarkToAchieve(0,0,0), 0.1);
        assertEquals(100.0, lab.desiredExamMarkToAchieve(100,100,100), 0.1);
        assertEquals(100.0, lab.desiredExamMarkToAchieve(0,0,60), 0.1);
        assertEquals(0.0, lab.desiredExamMarkToAchieve(100,100,40), 0.1);
        assertEquals(83.33, lab.desiredExamMarkToAchieve(50,50,70), 0.1);
        assertEquals(116.66, lab.desiredExamMarkToAchieve(0,0,70), 0.1);
    }

    @Test
    public void testMarkToAchieve() {
        assertEquals(0.0, lab.markToAchieve(0,15,0,25,0), 0.1);
        assertEquals(100.0, lab.markToAchieve(100,15,100,25,100), 0.1);
        assertEquals(100.0, lab.markToAchieve(0,15,0,25,60), 0.1);
        assertEquals(0.0, lab.markToAchieve(100,15,100,25,40), 0.1);
        assertEquals(83.33, lab.markToAchieve(50,15,50,25,70), 0.1);
        assertEquals(116.66, lab.markToAchieve(0,15,0,25,70), 0.1);
        assertEquals(66.0, lab.markToAchieve(10,10,90,40,70), 0.1);
        assertEquals(98.0, lab.markToAchieve(90,10,30,40,70), 0.1);
        assertEquals(66.0, lab.markToAchieve(10,10,90,40,70), 0.1);
        assertEquals(73.74, lab.markToAchieve(72.1f,10,64.8f,40,70), 0.1);
        assertEquals(53.74, lab.markToAchieve(72.1f,10,64.8f,40,60), 0.1);
        assertEquals(33.74, lab.markToAchieve(72.1f,10,64.8f,40,50), 0.1);
    }
}
