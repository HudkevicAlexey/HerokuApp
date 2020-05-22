package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalculationTest extends BaseCalculatorTest {
    //Тут просто добавлены приоритеты
    @Test(priority = 4)
    public void sumTest1 () {
        int div = basicCalculator.div(2, 6);
        Assert.assertEquals(div, 8);
    }
    @Test(priority = 2)
    public void  sumTest2(){
        int div = basicCalculator.div(5,4);
        Assert.assertEquals(div, 9);
    }
    @Test(priority = 1)
    public void  sumTest3() {
        int div = basicCalculator.div(3, 4);
        Assert.assertEquals(div, 7);
    }
    @Test(priority = 3)
    public void  sumTest4() {
        int div = basicCalculator.div(1, 4);
        Assert.assertEquals(div, 5);
    }
}
