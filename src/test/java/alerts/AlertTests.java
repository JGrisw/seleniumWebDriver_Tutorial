package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert()
    {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(), "You successfully clicked an alert", "result did not match " );
    }

    @Test
    public void testGetTextFromAlert()
    {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerConfirmButton();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert()
    {
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.triggerPromptButton();
        String text = "In Space no one can hear you fart...";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResult(),"You entered: In Space no one can hear you fart..." , "Text incorrect");

    }
}
