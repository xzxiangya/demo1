import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void return2When1Plus1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, "Add");
        int expectResult = 2;
        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public void return0When1Sub1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1, 1, "Sub");
        int expectResult = 0;
        Assert.assertEquals(actualResult, expectResult);
    }
}
