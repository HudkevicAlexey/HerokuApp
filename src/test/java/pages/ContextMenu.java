package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenu extends BasePage {
    private static final String CONTEXTMENU_URL = "http://the-internet.herokuapp.com/context_menu";
    private static final By HOTSPOT = By.id("hot-spot");

    public ContextMenu(WebDriver driver) {
        super(driver);
    }


    @Override
    public BasePage openPage() {
        driver.get(CONTEXTMENU_URL);
        return this;
    }

    @Override
    protected BasePage isPageOpened() {
        driver.findElement(HOTSPOT).isDisplayed();
        return this;
    }

    public void contextMenuAlertCheck() {
        rightClick(HOTSPOT);
        driver.switchTo().alert().dismiss();

    }

}
