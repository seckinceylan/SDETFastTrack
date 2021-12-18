package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.SynchronizationPage;
import com.sdetfasttrack.utilities.BrowserUtils;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;

import static org.testng.Assert.assertTrue;

public class SynchronizationTests {

    SynchronizationPage synchronizationPage=new SynchronizationPage();

    @Test
    public void synchronizationTest1(){
        //TC#1
        //1. Go to http://practice.cydeo.com/dynamic_loading/1
        Driver.getDriver().get("http://practice.cydeo.com/dynamic_loading/1");

        //2. Click to start
        synchronizationPage.startButton.click();

        //3. Wait until loading bar disappears
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(synchronizationPage.username));

//        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver()).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
//        synchronizationPage.username = wait.until(new Function<WebDriver, WebElement>() { public WebElement apply(WebDriver driver) {
//            return synchronizationPage.username;
//        } });

        //4. Assert username inputbox is displayed
        assertTrue(synchronizationPage.username.isDisplayed(),"User name was not displayed");

        //5. Enter username: tomsmith
        synchronizationPage.username.sendKeys("tomsmith");

        //6. Enter password: incorrectpassword
        synchronizationPage.password.sendKeys("incorrectpassword");

        //7. Click to Submit button
        synchronizationPage.submitButton.click();

        //8. Assert “Your password is invalid!” text is displayed.
        assertTrue(synchronizationPage.message.isDisplayed(),"Message was not displayed");
    }

    @Test
    public void synchronizationTest2(){
        //TC#2
        //1. Go to http://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("http://practice.cydeo.com/dynamic_loading/7");

        //2. Wait until title is “Dynamic title”
        WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //3. Assert : Message “Done” is displayed.
       // wait.until(ExpectedConditions.visibilityOf(synchronizationPage.doneMessage));
        assertTrue(synchronizationPage.doneMessage.isDisplayed(),"Done Message was not displayed");

        //4. Assert : Image is displayed.
        //wait.until(ExpectedConditions.visibilityOf(synchronizationPage.image));
        assertTrue(synchronizationPage.image.isDisplayed(),"Image was not displayed");
    }
}
