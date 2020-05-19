package calculator;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseCalculatorTest {
    BasicCalculator basicCalculator;
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before method");
        basicCalculator = new BasicCalculator();
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod() {
        System.out.println("Closing calculator");
    }

}
