package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.List;

public class BaseTests {

    //////////////////////////////////////////////////////////////////////
    // a WebDriver is a browser automation framework that allows you to //
    // set commands and send them to a browser                          //
    //////////////////////////////////////////////////////////////////////
    private WebDriver driver;
    protected HomePage homePage;

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

        homePage = new HomePage(driver);
        homePage.clickFormAuthentication();


        //////////////////////////////////////////////////////////////
        // calling the driver to get the website with a string that //
        // represents the url we want to navigate to                //
        //////////////////////////////////////////////////////////////
        driver.get("https://the-internet.herokuapp.com/");

        ///////////////////////////////////////////////////////////////////
        // When the find element method is called on the driver instance //
        // it returns a reference to the first element in the DOM that   //
        // matches with the provided locator.                            //
        // in the below example we save that to a variable 'inputsLink   //
        ///////////////////////////////////////////////////////////////////
//        WebElement inputsLink =  driver.findElement(By.linkText("Inputs"));

        //////////////////////////////////////////////////////////////////
        // once we have selected the element and saved it to a variable //
        // we then use 'click' which sends a click command to be        //
        // executed in the browser                                      //
        //////////////////////////////////////////////////////////////////
//        inputsLink.click();
//
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println(links.size());

        ///////////////////////////////////////////////////////////////
        // Method to maximize the window of the browser              //
        // driver.manage().window().maximize();                      //
        //                                                           //
        // Method to open fullscreen window of browser               //
        // driver.manage().window().fullscreen();                    //
        //                                                           //
        // Method to set the size of the window                      //
        // driver.manage().window().setSize(new Dimension(375,812)); //
        ///////////////////////////////////////////////////////////////

//        System.out.println(driver.getTitle());

        //////////////////////////////////////////////////////
        // closing the driver, so we aren't keeping it open //
        //////////////////////////////////////////////////////
        //driver.quit();
    }

    public static void main(String args[])
    {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
