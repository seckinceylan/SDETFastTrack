package com.sdetfasttrack.tests;

import com.github.javafaker.Faker;
import com.sdetfasttrack.pages.JavaFakerPractice;
import com.sdetfasttrack.utilities.Driver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class JavaFakerTest {

    JavaFakerPractice javaFakerPractice=new JavaFakerPractice();

    @Test
    public void testJavaFaker(){

        //1- Open a chrome browser
        //2- Go to:http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        //3- Login
        javaFakerPractice.userName.sendKeys("Tester");
        javaFakerPractice.password.sendKeys("test");
        javaFakerPractice.loginBtn.click();

        //4. Click on Order
        javaFakerPractice.orderBtn.click();

        //5. Select familyAlbum from product, set quantity to 5
        Select select=new Select(javaFakerPractice.dropDown);
        select.selectByVisibleText("FamilyAlbum");
        javaFakerPractice.quantity.sendKeys("5");

        //6. Click to "Calculate" button
        javaFakerPractice.calculateBtn.click();

        //7. Fill address Info with JavaFaker
        Faker person =new Faker();
        javaFakerPractice.name.sendKeys(person.name().fullName());
        javaFakerPractice.streetAdr.sendKeys(person.address().streetAddress());
        javaFakerPractice.city.sendKeys(person.address().city());
        javaFakerPractice.state.sendKeys(person.address().state());
        javaFakerPractice.zip.sendKeys(person.address().zipCode().replace("-",""));

        //8. Click on "visa" radio button
        javaFakerPractice.visaBtn.click();

        //9. Generate card number using JavaFaker
        javaFakerPractice.creditCard.sendKeys(person.business().creditCardNumber().replace("-",""));

        //10 Enter expiration date
       // javaFakerPractice.expireDate.sendKeys(person.business().creditCardExpiry().substring(5).replaceAll("-","/"));
        javaFakerPractice.expireDate.sendKeys(person.business().creditCardExpiry().substring(0,2) +
                "/" + person.business().creditCardExpiry().substring(2));

        //11. Click on "Process"
        javaFakerPractice.process.click();

        //12.Verify success message "New order has been successfully added." is displayed.
        String expected="New order has been successfully added.";
        String actual=javaFakerPractice.message.getText();
        assertEquals(actual,expected,"Message did not appeared.");

    }
}
