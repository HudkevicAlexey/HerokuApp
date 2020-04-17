
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HerokuAppTest {

    @Test
    public void aHomeworkAddRemoveElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addBtn = driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addBtn.click();
        addBtn.click();
        WebElement frstDeleteBtn = driver.findElement(By.xpath("//*[@id=\"elements\"]/button[1]"));
        WebElement scndDeleteBtn = driver.findElement(By.xpath("//*[@id=\"elements\"]/button[2]"));
        frstDeleteBtn.isDisplayed();
        scndDeleteBtn.isDisplayed();
        scndDeleteBtn.click();
        WebElement savedDeleteBtn = driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        savedDeleteBtn.isDisplayed();
        driver.quit();
    }

    @Test
    public void bHomeworkCheckboxes() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://the-internet.herokuapp.com/checkboxes");

        WebElement frstCheckBox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]"));
        WebElement scndCheckBox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]"));
        frstCheckBox.getAttribute("checked");
        System.out.println(frstCheckBox.getAttribute("checked"));
        if (frstCheckBox.getAttribute("checked") != null) {
            System.out.println("First check box is Check");
        } else {
            System.out.println("First check box is Uncheck");
        }
        scndCheckBox.getAttribute("checked");
        System.out.println(scndCheckBox.getAttribute("checked"));
        if (scndCheckBox.getAttribute("checked") == null) {
            System.out.println("Second check box is Uncheck");
        } else {
            System.out.println("Second check box is Check");
        }
        scndCheckBox.click();
        System.out.println(scndCheckBox.getAttribute("checked"));
        if (scndCheckBox.getAttribute("checked") == null) {
            System.out.println("Second check box is Uncheck");
        } else {
            System.out.println("Second check box is Check");
        }
        driver.quit();
    }

    @Test
    public void cHomeWorkDropdown() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select dropdown = new Select(driver.findElement(By.xpath("//*[@id=\"dropdown\"]")));
        WebElement dropdownVerification = driver.findElement(By.xpath("//*[@id=\"dropdown\"]"));
        dropdown.getOptions();
        System.out.println(dropdown.getOptions());
        dropdown.selectByVisibleText("Option 1");
        dropdownVerification.getAttribute("value");
        System.out.println(dropdownVerification.getAttribute("value"));
        dropdown.selectByVisibleText("Option 2");
        dropdownVerification.getAttribute("value");
        System.out.println(dropdownVerification.getAttribute("value"));
        driver.quit();
    }
    @Test
    public void eHomeworkInputs(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("http://the-internet.herokuapp.com/inputs");
        WebElement digitInput = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/input"));
        digitInput.sendKeys(Keys.ARROW_UP);
        digitInput.sendKeys(Keys.ARROW_DOWN);
        driver.quit();
    }
@Test
    public void gHomeworkSDT(){
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options);
    driver.get("http://the-internet.herokuapp.com/tables");
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[1]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[2]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[3]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[4]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[1]/td[5]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[1]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[2]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[3]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[4]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[2]/td[5]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[1]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[2]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[3]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[4]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[3]/td[5]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[1]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[2]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[3]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[4]")).getText();
    driver.findElement(By.xpath("//*[@id=\"table1\"]/tbody/tr[4]/td[5]")).getText();
    driver.quit();
}
@Test
    public void hHomeworkTypos(){
    System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    WebDriver driver = new ChromeDriver(options);
    driver.get("http://the-internet.herokuapp.com/typos");
    WebElement text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p[2]"));
    String rightText = "Sometimes you'll see a typo, other times you won't.";
    String textFromPage = text.getText();
    Assert.assertEquals(textFromPage,rightText,"wrong text displayed");
    driver.quit();

}
}

