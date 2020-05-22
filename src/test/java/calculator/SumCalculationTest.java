package calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class SumCalculationTest extends BaseCalculatorTest {

    @Test(retryAnalyzer = RetryAnalazer.class)
    public void retryUse(){
        if(new Random().nextBoolean()){
            Assert.fail();
        }
    }
}
