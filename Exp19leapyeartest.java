import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LeapYearTest {

    @Test
    public void testLeapYear() {
        LeapYear leapYear = new LeapYear();

        // Testing a leap year
        assertEquals(true, leapYear.isLeapYear(2020));

        // Testing a common year
        assertEquals(false, leapYear.isLeapYear(2021));

        // Testing a year divisible by 100 but not by 400
        assertEquals(false, leapYear.isLeapYear(1900));

        // Testing a year divisible by 400
        assertEquals(true, leapYear.isLeapYear(2000));
    }
}
