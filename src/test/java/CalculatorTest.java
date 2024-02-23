// Import necessary classes for testing
import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

// Test class for the Calculator class
public class CalculatorTest {

    // Positive Test Cases
    @Test
    public void testAddition() {
        double result = Calculator.add(5, 3);
        assertEquals(8.0, result, 0.0001);
        System.out.println("Addition Test Passed");
    }

    @Test
    public void testSubtraction() {
        double result = Calculator.subtract(10, 4);
        assertEquals(6.0, result, 0.0001);
        System.out.println("Subtraction Test Passed");
    }

    @Test
    public void testMultiplication() {
        double result = Calculator.multiply(3, 5);
        assertEquals(15.0, result, 0.0001);
        System.out.println("Multiplication Test Passed");
    }

    @Test
    public void testDivision() {
        double result = Calculator.divide(8, 2);
        assertEquals(4.0, result, 0.0001);
        System.out.println("Division Test Passed");
    }

    @Test
    public void testSquareRoot() {
        double result = Calculator.squareRoot(25);
        assertEquals(5.0, result, 0.0001);
        System.out.println("Square Root Test Passed");
    }

    @Test
    public void testFactorial() {
        int result = Calculator.factorial(5);
        assertEquals(120, result);
        System.out.println("Factorial Test Passed");
    }

    @Test
    public void testNaturalLog() {
        double result = Calculator.naturalLog(10);
        assertEquals(2.3026, result, 0.0001);
        System.out.println("Natural Log Test Passed");
    }

    @Test
    public void testNaturalLogOfNonPositiveNumber() {
        double result = Calculator.naturalLog(0);
        assertEquals(0.0, result, 0.0001);
        System.out.println("Natural Log of Non-Positive Number Test Passed");
    }

    @Test
    public void testPower() {
        double result = Calculator.power(2, 3);
        assertEquals(8.0, result, 0.0001);
        System.out.println("Power Test Passed");
    }

    @Test
    public void testPowerWithZeroExponent() {
        double result = Calculator.power(5, 0);
        assertEquals(1.0, result, 0.0001);
        System.out.println("Power With Zero Exponent Test Passed");
    }

    // Negative Test Cases

    @Test
    public void testAdditionNegative() {
        double result = Calculator.add(5, 3);
        assertNotEquals(10.0, result, 0.0001);
        System.out.println("Addition Negative Test Passed");
    }

    @Test
    public void testSubtractionNegative() {
        double result = Calculator.subtract(10, 4);
        assertNotEquals(2.0, result, 0.0001);
        System.out.println("Subtraction Negative Test Passed");
    }

    @Test
    public void testMultiplicationNegative() {
        double result = Calculator.multiply(3, 5);
        assertNotEquals(20.0, result, 0.0001);
        System.out.println("Multiplication Negative Test Passed");
    }

    @Test
    public void testDivisionNegative() {
        double result = Calculator.divide(8, 2);
        assertNotEquals(3.0, result, 0.0001);
        System.out.println("Division Negative Test Passed");
    }

    @Test
    public void testSquareRootNegative() {
        double result = Calculator.squareRoot(25);
        assertNotEquals(6.0, result, 0.0001);
        System.out.println("Square Root Negative Test Passed");
    }

    @Test
    public void testFactorialNegative() {
        int result = Calculator.factorial(5);
        assertNotEquals(121, result);
        System.out.println("Factorial Negative Test Passed");
    }

    @Test
    public void testNaturalLogNegative() {
        double result = Calculator.naturalLog(10);
        assertNotEquals(2.0, result, 0.0001);
        System.out.println("Natural Log Negative Test Passed");
    }

    @Test
    public void testPowerNegative() {
        double result = Calculator.power(2, 3);
        assertNotEquals(9.0, result, 0.0001);
        System.out.println("Power Negative Test Passed");
    }
}