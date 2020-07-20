import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void canSubtract() {
        assertEquals(1, calculator.subtract(2, 1));
    }

    @Test
    public void canMultiply() {
        assertEquals(2, calculator.multiply(2, 1));
    }

    @Test
    public void canDivide() {
        assertEquals(2, calculator.divide(2, 1), 0.01);
    }

}
