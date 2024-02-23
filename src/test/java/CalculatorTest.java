import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    @Test
    public void testSquareRoot() {
        double result = Calculator.squareRoot(25);
        assertEquals(5.0, result, 0.0001); // Delta is used for floating-point comparisons
    }

    @Test
    public void testFactorial() {
        int result = Calculator.factorial(5);
        assertEquals(120, result);
    }

    @Test
    public void testNaturalLog() {
        double result = Calculator.naturalLog(10);
        assertEquals(2.3026, result, 0.0001);
    }

    @Test
    public void testPower() {
        double result = Calculator.power(2, 3);
        assertEquals(8.0, result, 0.0001);
    }

    // Add more test cases as needed for your specific requirements

}
