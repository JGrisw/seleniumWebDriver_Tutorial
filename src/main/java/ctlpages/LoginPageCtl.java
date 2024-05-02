package ctlpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageCtl {

    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginbutton = By.name("action");

    public LoginPageCtl(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setUsername(String username)
    {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }

    public OverviewPageCtl clickLoginButton()
    {
        driver.findElement(loginbutton).click();
        return new OverviewPageCtl(driver);
    }

}
