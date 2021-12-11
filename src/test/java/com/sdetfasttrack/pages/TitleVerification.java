package com.sdetfasttrack.pages;

import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TitleVerification {

    //TC #1: Back and forth navigation
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Click to Gmail from top right.
    //4- Verify title contains:
    //Expected: Gmail
    //5- Go back to Google by using the .back();
    //6- Verify title equals:
    //Expected: Google

    //TC #2: Google search
    //1- Open a chrome browser
    //2- Go to: https://google.com
    //3- Write “apple” in search box
    //4- Click google search button
    // //(instead of clicking to search button we press ENTER)
    //5- Verify title:
    //Expected: Title should contain “apple” word
}
