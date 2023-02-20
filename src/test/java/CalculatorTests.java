import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        int result = calculator.add(6, 2);
        assertEquals(8, result);
    }
    @Test
    public void canSubtract() {
        int result = calculator.subtract(5, 4);
        assertEquals(1, result);
    }
    @Test
    public void canMultiply() {
        int result = calculator.multiply(3, 3);
        assertEquals(9, result);
    }
    @Test
    public void canDivide() {
        double result = calculator.divide(9, 3);
       assertEquals(3, result, 0.0);
    }
}

