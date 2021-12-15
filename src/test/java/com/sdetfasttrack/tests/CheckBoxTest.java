package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.CheckBoxPage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class CheckBoxTest {



    CheckBoxPage checkBoxPage=new CheckBoxPage();

    @Test
    public void checkBoxTest(){
        //TC #1:checkboxes
        //1. Go to http://practice.cydeo.com/checkboxes
        Driver.getDriver().get("http://practice.cydeo.com/checkboxes");
        //2. Confirm checkbox #1 is NOT selected by default
        assertTrue(!checkBoxPage.checkBox1.isSelected(),"checkBox 1 is selected");
        //3. Confirm checkbox #2 is SELECTED by default.
        assertTrue(checkBoxPage.checkBox2.isSelected(),"Check box 2 is not selected by default");
        //4. Click checkbox #1 to select it.
        checkBoxPage.checkBox1.click();
        //5. Click checkbox #2 to deselect it.
        checkBoxPage.checkBox2.click();
        //6. Confirm checkbox #1 is SELECTED.
        assertTrue(checkBoxPage.checkBox1.isSelected(),"checkBox 1 is not selected");
        //7. Confirm checkbox #2 is NOT selected.
        assertTrue(!checkBoxPage.checkBox2.isSelected(),"Check box 2 is selected");
    }
}
