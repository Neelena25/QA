import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    @Test(dataProvider = "validNumbers")
    public void testCalculateFactorial_ValidNumbers(int input, long expected) {
        long result = FactorialCalculator.calculateFactorial(input);
        Assert.assertEquals(result, expected, "Факториал для " + input + " не совпадает с ожидаемым значением.");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testCalculateFactorial_NegativeNumber() {
        FactorialCalculator.calculateFactorial(-1);
    }

    @DataProvider(name = "validNumbers")
    public Object[][] createValidNumbers() {
        return new Object[][] {
                {0, 1},   // 0! = 1
                {1, 1},   // 1! = 1
                {2, 2},   // 2! = 2
                {3, 6},   // 3! = 6
                {4, 24},  // 4! = 24
                {5, 120}, // 5! = 120
                {10, 3628800} // 10! = 3628800
        };
    }
}
