import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class FactorialCalculatorTest {

    @Test
    void testCalculateFactorialPositive() {
        assertEquals(120, FactorialCalculator.calculateFactorial(5));
        assertEquals(1, FactorialCalculator.calculateFactorial(0));
    }

    @Test
    void testCalculateFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.calculateFactorial(-1));
        assertEquals("Number must be non-negative", exception.getMessage());
    }

    @Test
    void testCalculateFactorialLargeNumber() {
        assertEquals(720, FactorialCalculator.calculateFactorial(6));
    }
}
