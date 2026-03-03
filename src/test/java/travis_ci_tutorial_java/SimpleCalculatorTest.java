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
    public void testSubtract() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.subtract(7,5));
    }

    @Test
    public void testMultiply() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(14, calc.multiply(7, 2));
    }

    @Test
    public void testDivide() {
        SimpleCalculator calc = new SimpleCalculator();
        assertEquals(2, calc.divide(14, 7));
    }

    @Test(expected=ArithmeticException.class)
    public void testDivideByZero() {
        SimpleCalculator calc = new SimpleCalculator();
        calc.divide(7, 0);
    }
}
