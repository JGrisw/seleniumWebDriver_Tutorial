package basectl;

import ctlpages.LoginPageCtl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestsCtl {

    private WebDriver driver;

    protected LoginPageCtl loginPageCtl;

    @BeforeClass
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        driver = new ChromeDriver();
    }

    public WebDriver getDriver()
    {
        return this.driver;
    }
}


