package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestsCTL {

    private WebDriver driver;

    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://live.coldtrack.com/");

        WebElement userNameInput = driver.findElement(By.name("username"));
        String username = "justin+test@coldtrack.com";
        userNameInput.sendKeys(username);

        WebElement passwordInput = driver.findElement(By.name("password"));
        String password = "Pickles1!";
        passwordInput.sendKeys(password);

        WebElement continueButton = driver.findElement(By.name("action"));
        continueButton.click();
    }

    public static void main(String args[])
    {
        //BaseTests test = new BaseTests();
        BaseTestsCTL test = new BaseTestsCTL();
        test.setUp();
    }
}
