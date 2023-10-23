import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleInterestCalculatorTest {

    @Test
    public void testCalculateSimpleInterest() {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();
        double principal = 1000;
        double rate = 5;
        double time = 2;
        double expectedInterest = 100.0; // Expected interest for the given inputs

        double calculatedInterest = calculator.calculateSimpleInterest(principal, rate, time);

        assertEquals(expectedInterest, calculatedInterest, 0.001); // Tolerance for double comparison
    }
}

public class SimpleInterestCalculator {
    public double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
}
