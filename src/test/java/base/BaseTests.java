package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {

    //////////////////////////////////////////////////////////////////////
    // a WebDriver is a browser automation framework that allows you to //
    // set commands and send them to a browser                          //
    //////////////////////////////////////////////////////////////////////
    private WebDriver driver;

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
        driver.get("https://the-internet.herokuapp.com/");

        ///////////////////////////////////////////////////////////////
        // Method to maximize the window of the browser              //
        //driver.manage().window().maximize();                       //
        //                                                           //
        // Method to open fullscreen window of browser               //
        // driver.manage().window().fullscreen();                    //
        //                                                           //
        // Method to set the size of the window                      //
        // driver.manage().window().setSize(new Dimension(375,812)); //
        ///////////////////////////////////////////////////////////////

        System.out.println(driver.getTitle());

        //////////////////////////////////////////////////////
        // closing the driver, so we aren't keeping it open //
        //////////////////////////////////////////////////////
        driver.quit();
    }

    public static void main(String args[])
    {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
