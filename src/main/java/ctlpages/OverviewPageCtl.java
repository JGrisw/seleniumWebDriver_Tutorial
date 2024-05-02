package ctlpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverviewPageCtl {

    private WebDriver driver;

    private By overviewTitle = By.xpath("/html/body/div[1]/div[3]/div[1]/h3");

    public OverviewPageCtl(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getOverviewtitle()
    {
        return driver.findElement(overviewTitle).getText();
    }
}
