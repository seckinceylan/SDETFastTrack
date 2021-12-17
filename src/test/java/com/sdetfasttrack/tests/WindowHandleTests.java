package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.WindowhandlePage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertEquals;

public class WindowHandleTests {

    WindowhandlePage windowHandlePage=new WindowhandlePage();

    @Test
    public void windowHandleTest(){

        //1. Go to website: http://practice.cydeo.com/windows
        Driver.getDriver().get("http://practice.cydeo.com/windows");
        //2. Assert: Title is “Practice”
        String expectedTitle="Practice";
        String actualTitle=Driver.getDriver().getTitle();
        assertEquals(actualTitle,expectedTitle,"Titles did not match");

        //3. Click to: “Click Here” text
        windowHandlePage.clickHereButton.click();

        String mainHandle= Driver.getDriver().getWindowHandle();
        System.out.println("main window: "+mainHandle);

        Set<String> windHandles=Driver.getDriver().getWindowHandles();
        //4. Switch to new Window.
        for (String eachTab : windHandles) {
            Driver.getDriver().switchTo().window(eachTab);
            String title=Driver.getDriver().getTitle();
            System.out.println(eachTab);
            if (title.contains("New Window")){
                break;
            }
        }
        //5. Assert: Title is “New Window”
        expectedTitle="New Window";
        actualTitle=Driver.getDriver().getTitle();
        assertEquals(actualTitle,expectedTitle,"Titles did not match");

        //6.Switch back to main handle
        Driver.getDriver().switchTo().window(mainHandle);

    }
}
