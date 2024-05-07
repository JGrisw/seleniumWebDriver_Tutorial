package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {

    //////////////////////////////////////////////////////////////////////
    // a WebDriver is a browser automation framework that allows you to //
    // set commands and send them to a browser                          //
    //////////////////////////////////////////////////////////////////////
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp()
    {
        //////////////////////////////////////////////////////////////////////
        // Method that sets the system property specified by the key that   //
        // takes in two arguments                                           //
        // key = the name of the system property                            //
        // value = essentially the path or value of "where to find the key" //
        //////////////////////////////////////////////////////////////////////
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");

        ////////////////////////////////////////////////
        // Instantiate the driver with Chrome browser //
        ////////////////////////////////////////////////
        driver = new ChromeDriver();

        //////////////////////////////////////////////////////////////
        // calling the driver to get the website with a string that //
        // represents the url we want to navigate to                //
        //////////////////////////////////////////////////////////////
        goHome();
        homePage = new HomePage(driver);

    }

    @BeforeMethod
    public void goHome()
    {
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown()
    {
        //////////////////////////////////////////////////////
        // closing the driver, so we aren't keeping it open //
        //////////////////////////////////////////////////////
        driver.quit();
    }
}
