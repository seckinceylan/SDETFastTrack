package com.sdetfasttrack.tests;

import com.sdetfasttrack.pages.RadioButtonPage;
import com.sdetfasttrack.utilities.Driver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RadioButtonsTest {

     RadioButtonPage radioButtonPage =new RadioButtonPage();

    @Test
    public void radioButtonTest(){
        //TC #1:radio buttons
        //1.GO TO: http://practice.cydeo.com/radio_buttons
        Driver.getDriver().get("http://practice.cydeo.com/radio_buttons");
        //2. Confirm radio button #Blue is selected by default
        assertTrue(radioButtonPage.blueBtn.isSelected(),"Blue button is not selected by default!");
        //3. Confirm radio button #Football is NOT selected by default
        assertTrue(!radioButtonPage.footballBtn.isSelected(),"Football button is selected");
        //assertFalse(radioButtonPage.footballBtn.isSelected(),"Football button is selected");
        //4. Click radio button #Football to select it.
        radioButtonPage.footballBtn.click();
        //5. Verify radio button #Football is selected.
        assertTrue(radioButtonPage.footballBtn.isSelected(),"Football button is not selected");
        //6. Click radio button #Red to select it.
        radioButtonPage.redBtn.click();
        //7. Verify radio button #Red is selected.
        assertTrue(radioButtonPage.redBtn.isSelected(),"Red button is not selected");
        //8. Verify radio button #Blue is not selected.
        assertTrue(!radioButtonPage.blueBtn.isSelected(),"Blue button is selected");
        //9. Verify radio button #Green is not Enabled.
         assertTrue(!radioButtonPage.greenBtn.isEnabled(),"Green button is enabled");
    }

}
