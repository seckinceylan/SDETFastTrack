package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActionPage {
    //TC#1
    //1. Go to http://practice.cydeo.com/hovers
    //2. Hover over to first image
    //3. Assert: “name: user1” is displayed
    //4. Hover over to second image
    //5. Assert: “name: user2” is displayed
    //6. Hover over to third image
    //7. Assert: “name: user3” is displayed


    //TC#2
    //1. Go	to https://the-internet.herokuapp.com/context_menu
    //2. Right click to the	box.
    //3. Alert will open.
    //4. Accept	alert.

    public ActionPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='figure'][1]")
    public WebElement image1;

    @FindBy(xpath = "//div[@class='figure'][2]")
    public WebElement image2;

    @FindBy(xpath = "//div[@class='figure'][3]")
    public WebElement image3;

    @FindBy(xpath = "//h5[.='name: user2']")
    public WebElement user2;

    @FindBy(xpath = "//h5[.='name: user1']")
    public WebElement user1;

    @FindBy(xpath = "//h5[.='name: user3']")
    public WebElement user3;

    @FindBy(id = "hot-spot")
    public WebElement rightClick;

    public void clickUserByName(String name){
        Driver.getDriver().findElement(By.xpath("//td[.='"+name+"'")).click();
    }




}
