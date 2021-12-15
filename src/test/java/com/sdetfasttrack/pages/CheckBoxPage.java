package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    //TC #1:checkboxes
    //1. Go to http://practice.cydeo.com/checkboxes
    //2. Confirm checkbox #1 is NOT selected by default
    //3. Confirm checkbox #2 is SELECTED by default.
    //4. Click checkbox #1 to select it.
    //5. Click checkbox #2 to deselect it.
    //6. Confirm checkbox #1 is SELECTED.
    //7. Confirm checkbox #2 is NOT selected.

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//input[@id='box1']")
    public WebElement checkBox1;

    @FindBy(xpath="//input[@id='box2']")
    public WebElement checkBox2;
}
