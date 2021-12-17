package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.AlertClass;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class AlertTest {

    AlertClass alertClass=new AlertClass();

    @Test
    public void alertTest(){
        //1. Go to website: http://practice.cydeo.com/javascript_alerts
        Driver.getDriver().get("http://practice.cydeo.com/javascript_alerts");

        //2. Clicking to the button for alert to be displayed
        alertClass.clickJsAlert.click();
        Alert alert1=Driver.getDriver().switchTo().alert();
        //3. Click to OK button from the alert
        alert1.accept();
        //4. Verify "You successfully clicked an alert" text is displayed.
        String expected="You successfuly clicked an alert";
        String actual=alertClass.result.getText();
        assertEquals(actual,expected);

        alertClass.clickJsConfirm.click();
        Alert alert2=Driver.getDriver().switchTo().alert();
        alert2.accept();
        expected="You clicked: Ok";
        actual=alertClass.result.getText();
        assertEquals(actual,expected);


        alertClass.clickJsPrompt.click();
        Alert alert3=Driver.getDriver().switchTo().alert();
        expected="You entered: hello";
        alert3.sendKeys("hello");
        alert3.accept();
        actual=alertClass.result.getText();
        assertEquals(actual,expected,"Did not see message!");
    }
}
