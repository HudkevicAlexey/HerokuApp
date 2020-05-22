package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FileUploader extends BasePage{
    private static final By FILE_INPUT = By.id("file-upload");
    private static final By UPLOAD_BUTTON = By.id("file-submit");
    private static final  By UPLOADED_FILE_NAME = By.id("uploaded-files");

    public FileUploader(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage openPage() {
        driver.get("http://the-internet.herokuapp.com/upload");
        return this;
    }

    @Override
    protected BasePage isPageOpened() {
        return null;
    }
    public void fileUpload() {
        driver.findElement(FILE_INPUT).sendKeys("C:\\Users\\Capt.Houdini\\IdeaProjects\\HerokuApp\\src\\test\\resources\\TestFile.txt");
        driver.findElement(UPLOAD_BUTTON).click();
    }
    public void uploadedFileTitleCheck() {
        Assert.assertEquals(driver.findElement(UPLOADED_FILE_NAME).getText(), "TestFile.txt");

    }
}
