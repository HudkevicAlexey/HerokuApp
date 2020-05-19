package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class DynamicControls extends BasePage {
    private static final By CHECKBOX = By.id("checkbox");
    private static final By BUTTON = By.xpath("//button[contains(text(),'Remove')]");
    private static final By MESSAGE = By.id("message");
    private static final String URL = "http://the-internet.herokuapp.com/dynamic_controls";
    private static final By INPUT = By.xpath("//form[@id='input-example']//input");
    private static final By ENABLED_DISABLED_BTN = By.xpath("//button[contains(text(),'Enable')]");
    public DynamicControls(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage openPage() {
        driver.get(URL);
        return this;
    }

    @Override
    public BasePage isPageOpened() {
        return this;
    }

    public void checkboxCheck() {
        driver.findElement(CHECKBOX);
        driver.findElement(BUTTON).click();
        driver.findElement(MESSAGE).getText();
        Assert.assertEquals(driver.findElement(MESSAGE).getText(), "It's gone!", "Unexpected message behavior");
        isElementPresent(CHECKBOX);
    }

    public void inputCheck() {
        driver.findElement(INPUT).getAttribute("disabled").equals("disabled");
        driver.findElement(ENABLED_DISABLED_BTN).click();
        Assert.assertEquals(driver.findElement(MESSAGE).getText(), "It's enabled!", "Unexpected message behavior");
        wait.until(ExpectedConditions.elementToBeClickable(INPUT));
        driver.findElement(INPUT).sendKeys("dssdsd");

    }
}
