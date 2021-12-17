package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.IframePage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class IframeTest {

    IframePage iframePage=new IframePage();

    @Test
    public void iframeTest(){

        //1. Go to website: http://practice.cydeo.com/iframe
        Driver.getDriver().get("http://practice.cydeo.com/iframe");

        //2. Locate as WebElement
        Driver.getDriver().switchTo().frame(iframePage.iframe);
        //3. Pass index number
       // Driver.getDriver().switchTo().frame(iframePage.iframeIndex);
        //4. Pass id or name attribute value (IF THERE ARE ANY)
      //  Driver.getDriver().switchTo().frame(iframePage.iframeId);

        //5. Assert: "Your content goes here." Text is displayed.
        assertTrue(iframePage.textDisplayed.isDisplayed(),"Text did not displayed.");

        //6. switch back to default frame
        Driver.getDriver().switchTo().parentFrame();

        assertTrue(iframePage.paragraph.isDisplayed(),"paragraph did not displayed");


    }
}
