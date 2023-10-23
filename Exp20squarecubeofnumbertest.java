import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberOperationsTest {

    @Test
    public void testFindSquare() {
        NumberOperations numberOperations = new NumberOperations();
        assertEquals(25, numberOperations.findSquare(5));
        assertEquals(16, numberOperations.findSquare(-4)); // Example for negative numbers
    }

    @Test
    public void testFindCube() {
        NumberOperations numberOperations = new NumberOperations();
        assertEquals(125, numberOperations.findCube(5));
        assertEquals(-64, numberOperations.findCube(-4)); // Example for negative numbers
    }
}
