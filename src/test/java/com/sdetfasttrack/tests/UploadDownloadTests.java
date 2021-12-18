package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.UploadPage;
import com.sdetfasttrack.utilities.BrowserUtils;
import com.sdetfasttrack.utilities.Driver;
import com.sdetfasttrack.utilities.UploadFile;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class UploadDownloadTests {

    UploadPage uploadPage=new UploadPage();

    @Test
    public void uploadTest(){

        //1. Go to http://practice.cydeo.com/upload
        Driver.getDriver().get("http://practice.cydeo.com/upload");

        //2.Find any file that is not too big in size. And get the path of the file.
        String pathToFile="/Users/cybertek/Desktop/b10 all test cases, code.docx";

        //3.Upload the file
        uploadPage.uploadFile.sendKeys(pathToFile);

        //UploadFile.fileAttachmentUsingRobot(pathToFile);
        uploadPage.uploadBtn.click();

        //4.Assert that file upload message is displayed
        assertTrue(uploadPage.uploadMessage.isDisplayed(),"Message was not displayed");

    }

}
