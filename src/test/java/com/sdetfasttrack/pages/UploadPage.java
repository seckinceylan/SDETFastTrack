package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UploadPage {

    //1. Go to http://practice.cydeo.com/upload
    //2.Find any file that is not too big in size. And get the path of the file.
    //3.Upload the file
    //4.Assert that file upload message is displayed

    public UploadPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath="//input[@id='file-upload']")
    public WebElement uploadFile;

    @FindBy(id = "file-submit")
    public WebElement uploadBtn;


    @FindBy(xpath = "//h3[.='File Uploaded!']")
    public WebElement uploadMessage;





}
