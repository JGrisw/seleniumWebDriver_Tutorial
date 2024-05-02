package logIn;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin()
    {
       LoginPage loginPage =  homePage.clickFormAuthentication();
       loginPage.setUserName("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
       assertTrue(secureAreaPage.getAlertText(), "You logged in to a secure area!", "Alert text is incorect");

    }

    private void assertTrue(String alertText, String s, String alertTextIsIncorect) {
    }
}
