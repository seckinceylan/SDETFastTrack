package com.sdetfasttrack.tests;

import com.google.common.base.Verify;
import com.sdetfasttrack.pages.DropDownPage;
import com.sdetfasttrack.utilities.BrowserUtils;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDowntest {

    DropDownPage dropdownPage = new DropDownPage();

    @Test
    public void dropDownTest1() {
        //TC#1
        //1. Go to http://practice.cydeo.com/dropdown
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        Select select=new Select(dropdownPage.stateSelector);

        //2. Select Illinois --> select by visible text
        select.selectByVisibleText("Illinois");
        String expected="Illinois";
        String actual=select.getFirstSelectedOption().getText();
        assertEquals(actual,expected,"Illinois did not selected");
        //3. Select Virginia --> select by value
        select.selectByValue("VA");
        expected="Virginia";
        actual=select.getFirstSelectedOption().getText();
        assertEquals(actual,expected,"Virginia did not selected.");

        //4. Select California --> select by index
        select.selectByIndex(5);
        expected="California";
        actual=select.getFirstSelectedOption().getText();
        assertEquals(actual,expected,"California did not selected");

        //5. Verify final selected option is California.

    }
    @Test
    public void dropDownTest2(){
        //TC#2
        //Select “December 1st, 1950g” and verify it is selected.
        //1. Go to http://practice.cydeo.com/dropdown
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        //2. Select Year --> by visible text
        Select selectyear=new Select(dropdownPage.year);
        selectyear.selectByVisibleText("1950");
        String expectedYear="1950";
        String actualYear=selectyear.getFirstSelectedOption().getText();
        assertEquals(actualYear,expectedYear,"Year was not select correctly");

        //3. Select Month -->  by value
        Select selectmonth=new Select(dropdownPage.month);
        selectmonth.selectByValue("11");
        String expectedMonth="December";
        String actualMonth= selectmonth.getFirstSelectedOption().getText();
        assertEquals(actualMonth,expectedMonth,"Month was not select correctly");

        //4. Select Day -->  by index
        Select selectday=new Select(dropdownPage.day);
        selectday.selectByIndex(0);
        String expectedDay="1";
        String actualDay= selectday.getFirstSelectedOption().getText();
        assertEquals(actualDay,expectedDay,"Day was not select correctly");


    }

    @Test
    public void dropDownTest3() {
        //TC#3
        //1.Go to http://practice.cydeo.com/dropdown
        Driver.getDriver().get("http://practice.cydeo.com/dropdown");

        Select select=new Select(dropdownPage.language);

        List<WebElement> list=select.getOptions();
        //2. Select all the options from multiple select dropdown.
        //3. Print out all selected values and verify each is selected.
        for(WebElement eachElement:list){
            String eachLanguage=eachElement.getText();
            select.selectByVisibleText(eachLanguage);
            System.out.println(eachLanguage);
            assertTrue(eachElement.isSelected(),"Webelement is not selected");
        }

        //4.Deselect all values and verify each is deselected.
        select.deselectAll();

        List<WebElement> list2=select.getOptions();

        for(WebElement webElement:list2){
            assertTrue(!webElement.isSelected(),"Webelement is selected");
        }

    }


}