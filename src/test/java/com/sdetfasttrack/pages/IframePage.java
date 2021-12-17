package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePage {

    public IframePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //1. Go to website: http://practice.cydeo.com/iframe
    //2. Locate as WebElement
    //3. Pass index number
    //4. Pass id or name attribute value (IF THERE ARE ANY)
    //5. Assert: "Your content goes here." Text is displayed.
    //6. switch back to default frame


    @FindBy(id="mce_0_ifr")
    public WebElement iframe;

    public String iframeId="mce_0_ifr";
    public int iframeIndex=0;

    @FindBy(xpath="//p[.='Your content goes here.']")
    public WebElement textDisplayed;

    @FindBy(css=".tox-tbtn__select-label")
    public WebElement paragraph;
}
