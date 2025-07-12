import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Calculator {
    int add(int a, int b) { return a + b; }
    int subtract(int a, int b) { return a - b; }
}

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(1, calc.subtract(3, 2));
    }
}
