package loginctl;

import basectl.BaseTestsCtl;
import ctlpages.LoginPageCtl;
import ctlpages.OverviewPageCtl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTestsCtl extends BaseTestsCtl {

    private WebDriver driver;

    @BeforeMethod
    public void setUp()
    {
        BaseTestsCtl baseTestsCtl = new BaseTestsCtl();
        baseTestsCtl.setUp();
        driver = baseTestsCtl.getDriver();
    }
    @Test
    public void testSuccessfulLogin()
    {
        driver.get("https://live.coldtrack-dev.com/");
        loginPageCtl = new LoginPageCtl(driver);
        loginPageCtl.setUsername("justin+test@coldtrack.com");
        loginPageCtl.setPassword("Pickles1!");

        OverviewPageCtl overviewPageCtl =  loginPageCtl.clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.titleContains("Overview"));

        String actualTitle = overviewPageCtl.getOverviewtitle();
        Assert.assertEquals(actualTitle, "Overview", "Overview title did not match");
    }

}
