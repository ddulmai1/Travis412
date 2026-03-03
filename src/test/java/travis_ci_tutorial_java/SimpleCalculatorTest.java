package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(2, calc.add(1, 1));
	}

    @Test
    public void testAddAssociative() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.add(2, 1), calc.add(1, 2));
    }

    @Test
    public void testSubtract() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.subtract(7,5));
    }

    @Test
    public void testSubtractAssociative() {
        SimpleCalculator calc = new SimpleCalculator();
        assertNotEquals(calc.subtract(2, 1), calc.subtract(1, 2));
    }

    @Test
    public void testMultiply() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(14, calc.multiply(7, 2));
    }

    @Test
    public void testMultiplyAssociative() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(calc.multiply(2, 1), calc.multiply(1, 2));
    }

    @Test
    public void testDivide() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.divide(14, 7));
    }

    @Test
    public void testDivideAssociative() {
        SimpleCalculator calc = new SimpleCalculator();
        assertNotEquals(calc.divide(2, 1), calc.divide(1, 2));
    }

    @Test(expected=ArithmeticException.class)
    public void testDivideByZero() {
        SimpleCalculator calc = new SimpleCalculator();
        calc.divide(7, 0);
    }
}
