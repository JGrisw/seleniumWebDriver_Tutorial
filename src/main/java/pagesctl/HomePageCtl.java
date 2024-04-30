package pagesctl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageCtl {

    private WebDriver driver;

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButtom = By.name("action");

    public HomePageCtl(WebDriver driver)
    {
        this.driver = driver;
    }

    public void setUserName(String username)
    {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
    }

    public FrontPageCtl clickLoginButton()
    {
        driver.findElement(loginButtom).click();
        return new FrontPageCtl(driver);
    }

}
