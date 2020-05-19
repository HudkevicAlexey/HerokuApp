package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pages.ContextMenu;
import pages.DynamicControls;
import pages.FileUploader;


import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    ContextMenu contextMenu;
    DynamicControls dynamicControls;
    FileUploader fileUploader;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        contextMenu = new ContextMenu(driver);
        dynamicControls = new DynamicControls(driver);
        fileUploader = new FileUploader(driver);
    }

//    @AfterMethod(alwaysRun = true)
//    public void closeBrowser() {
//        driver.quit();
//    }
}
