package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalculationTest extends BaseCalculatorTest {
    //Тут просто добавлены приоритеты
    @Test(priority = 4)
    public void sumTest1 () {
        int sum = basicCalculator.sum(2, 6);
        Assert.assertEquals(sum, 8);
    }
    @Test(priority = 2)
    public void  sumTest2(){
        int sum = basicCalculator.sum(5,4);
        Assert.assertEquals(sum, 9);
    }
    @Test(priority = 1)
    public void  sumTest3() {
        int sum = basicCalculator.sum(3, 4);
        Assert.assertEquals(sum, 7);
    }
    @Test(priority = 3)
    public void  sumTest4() {
        int sum = basicCalculator.sum(1, 4);
        Assert.assertEquals(sum, 5);
    }
}
