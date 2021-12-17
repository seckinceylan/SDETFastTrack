package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DropDownPage {

    public DropDownPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //TC#1
    //1. Go to http://practice.cydeo.com/dropdown
    //2. Select Illinois --> select by visible text
    //3. Select Virginia --> select by value
    //4. Select California --> select by index
    //5. Verify final selected option is California.

    @FindBy(id="state")
    public WebElement stateSelector;




}
