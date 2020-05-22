package calculator;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubCalculationTest extends BaseCalculatorTest {
    @Parameters({"a", "b", "expectedSub"})
    @Test
    public void subTest(int a, int b, int expectedSub) {
        int mul = basicCalculator.sub(a, b);
        Assert.assertEquals(mul, expectedSub);
    }
}
