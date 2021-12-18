package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.ActionPage;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ActionClassTests {

    ActionPage actionPage=new ActionPage();

    @Test
    public void actionsTest1()  {

        //TC#1
        //1. Go to http://practice.cydeo.com/hovers
        Driver.getDriver().get("http://practice.cydeo.com/hovers");

        Actions actions=new Actions(Driver.getDriver());

        //2. Hover over to first image
        actions.moveToElement(actionPage.image1).perform();
        //3. Assert: “name: user1” is displayed
        assertTrue(actionPage.user1.isDisplayed(),"user 1 was not displayed");

        //4. Hover over to second image
        actions.moveToElement(actionPage.image2).perform();
        //5. Assert: “name: user2” is displayed
        assertTrue(actionPage.user2.isDisplayed(),"user 2 was not displayed");


        //6. Hover over to third image
        actions.moveToElement(actionPage.image3).perform();
        //7. Assert: “name: user3” is displayed
        assertTrue(actionPage.user3.isDisplayed(),"user 3 was not displayed");
    }

    @Test
    public void actionsTest2(){

        //1. Go	to https://the-internet.herokuapp.com/context_menu
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        Actions actions=new Actions(Driver.getDriver());

        //2. Right click to the	box.
        //actions.contextClick(actionPage.rightClick).perform();
        actions.moveToElement(actionPage.rightClick).contextClick().perform();

        //3. Alert will open.
        Alert alert=Driver.getDriver().switchTo().alert();

        //4. Accept	alert.
        alert.accept();
    }
}
