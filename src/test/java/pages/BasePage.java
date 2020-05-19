package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.swing.*;

public abstract class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 10);
    }

    protected abstract BasePage openPage();

    protected abstract BasePage isPageOpened();

    public void waitForNumberOfElements(By locator, int numberOfElements) {
        wait.until(ExpectedConditions.numberOfElementsToBe(locator, numberOfElements));
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(locator, numberOfElements));
        } catch (TimeoutException ex) {
            Assert.fail("Колличество элементов на стртанице не соответсвует твоим ожидания");
        }
    }

    public boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return false;
        } catch (NoSuchElementException e) {
            return true;
        }
    }
    public void rightClick(By by){
        Actions actions = new Actions(driver);
        actions.contextClick(driver.findElement(by)).build().perform();
    }
    public  void  alertSwitching(){
        Alert alert=driver.switchTo().alert();
    }
}


