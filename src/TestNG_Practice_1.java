import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;

import java.sql.SQLOutput;
import java.util.Random;

public class TestNG_Practice_1 extends BaseDriver {

    @Test
    void createAddress(){

        ProjectObjectModel pom = new ProjectObjectModel(driver);

        WebElement my_addresses = driver.findElement(By.className("icon-building"));
        my_addresses.click();
        WebElement addNewAddress = driver.findElement(By.xpath("//span[text()='Add a new address']"));
        addNewAddress.click();

        pom.address1.sendKeys("700 Main Dr.");
        pom.address2.sendKeys("Apt B101");
        pom.city.sendKeys("Colombus");

        Select state = new Select(pom.id_state);
        state.selectByIndex(new Random().nextInt(54));

        pom.postcode.sendKeys("12345");
        pom.phone_mobile.sendKeys("2345678901");
        pom.alias.clear();
        String aliasNewName = "My address1";
        pom.alias.sendKeys(aliasNewName);
        pom.saveButton.click();
        String expectedAddress = "MY ADDRESS1";
        Assert.assertTrue(expectedAddress.equalsIgnoreCase(pom.addressVerification.getText()));

        pom.updateButton2nd.click();
        pom.firstname.clear();
        String newName = "Wer";
        pom.firstname.sendKeys(newName);
        pom.lastname.clear();
        String newLastName = "sdf";
        pom.lastname.sendKeys(newLastName);
        pom.saveButton.click();

        Assert.assertEquals(newName, pom.updatedName.getText());
        Assert.assertEquals(newLastName, pom.updatedLastName.getText());

        pom.deleteButton2nd.click();
        driver.switchTo().alert().accept();

        try{
            wait.until(ExpectedConditions.visibilityOf(pom.addressVerification));
        }catch(Exception e){
            System.out.println("New address deleted succesfully");
        }
    }


}
/*
NOTE: All TestNG practices should be in the same project and in the different class

Everybody in the team should create their own account.

Everybody in the team should upload the project individually.

And everyone in the team should push the code to github as well.

One member in the team should send the project to sena or ali but everyone push the code to github.

After finishing the project create testNG.xml file and in this file run the TestNG Practices 1
and TestNG Practices 2 run the project as parallel and in the chrome and in the firefox.
Use the Thread.sleep as less as you can. Use a explicit wait.

DO NOT DO THIS PROJECT IN THE MAIN METHOD PROJECT SHOULD BE IN THE
 TESTNG.

Use a page object model concept. Create a baseDriver class and login functionality should
be done in this class.

Use a page object model concept while working on the project.


 Navigate to:  http://automationpractice.com/index.php

Click on sign in button

Click on the my addresses

Click on the add a new address

Enter all the fields (Choose random items from the dropdown)

Click on save button

Verify your address is displayed in the website

Click on the update button

Change the first name and last name

Click on the save button

Verify first name and last name is updated

Click on the delete button

Click on the okay

Verify address is removed from the website
 */