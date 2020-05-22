package calculator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MulCalculationTest extends BaseCalculatorTest {

    @DataProvider(name = "mulData")
    public Object[][] asd() {
        return new Object[][]{
                {5, 6, 30},
                {2, 3, 6}};
    }

    @Test(enabled = true, timeOut = 2000, description = "Выключеный тест с таймаутом")
    public void mulTest1() {
        int mul = basicCalculator.mul(2, 3);
        Assert.assertEquals(mul, 6);
    }

    @Test(invocationCount = 30, description = "Тридцать повтарений в три потока", threadPoolSize = 3)
    public void mulTest2() {
        int mul = basicCalculator.mul(3, 3);
        Assert.assertEquals(mul, 9);
    }

    @Test(dataProvider = "mulData",description = "Тест через DataProvider")
    public void mulTest3(int a, int b, int expectedMul) {
        int mul = basicCalculator.mul(a, b);
        Assert.assertEquals(mul,expectedMul);
    }
    @Parameters({"a", "b", "expectedMul"})
    @Test
    public void mulTest4(int a, int b, int expectedMul) {
       int mul = basicCalculator.mul(a, b);
        Assert.assertEquals(mul, expectedMul);
    }
}
