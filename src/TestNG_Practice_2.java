import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;

import java.util.Random;

public class TestNG_Practice_2 extends BaseDriver {

    @Test
    void createAddress(){


//        ProjectObjectModel pom = new ProjectObjectModel(driver);
//
//        WebElement my_addresses = driver.findElement(By.className("icon-building"));
//        my_addresses.click();
//        WebElement addNewAddress = driver.findElement(By.xpath("//span[text()='Add a new address']"));
//        addNewAddress.click();
//
//        pom.address1.sendKeys("700 Main Dr.");
//        pom.address2.sendKeys("Apt B101");
//        pom.city.sendKeys("Colombus");
//
//        Select state = new Select(pom.id_state);
//        state.selectByIndex(new Random().nextInt(54));
//
//        pom.postcode.sendKeys("12345");
//        pom.phone_mobile.sendKeys("2345678901");
//        pom.alias.clear();
//        String aliasNewName = "My address1";
//        pom.alias.sendKeys(aliasNewName);
//        pom.saveButton.click();
//        String expectedAddress = "MY ADDRESS1";
//        Assert.assertTrue(expectedAddress.equalsIgnoreCase(pom.addressVerification.getText()));
//
//        pom.updateButton2nd.click();
//        pom.firstname.clear();
//        String newName = "Wer";
//        pom.firstname.sendKeys(newName);
//        pom.lastname.clear();
//        String newLastName = "sdf";
//        pom.lastname.sendKeys(newLastName);
//        pom.saveButton.click();
//
//        Assert.assertEquals(newName, pom.updatedName.getText());
//        Assert.assertEquals(newLastName, pom.updatedLastName.getText());
//
//        pom.deleteButton2nd.click();
//        driver.switchTo().alert().accept();
//
//        try{
//            wait.until(ExpectedConditions.visibilityOf(pom.addressVerification));
//        }catch(Exception e){
//            System.out.println("New address deleted succesfully");
//        }
    }


}
/*
 NOTE: All TestNG practices should be in the same project and in the different class

Navigate to:  http://automationpractice.com/index.php
Click on sign in button
Enter the Email Address and Password (Create your own account from left side)
Click on sign in button

Click on dresses
Click on any item
Click on the add to wishlist

Click on the user name on the top right  (Next to sign out button )

Click on "My WISHLIST" button

Verify Item is in the wishlist

Click on X button under the Item picture

Verify item is not in the wishlist anymore

Click on the X button under the Delete column

Click on the OK button
 */