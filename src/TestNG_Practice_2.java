import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.BaseDriver;

import java.util.Random;

public class TestNG_Practice_2 extends BaseDriver {

    @Test
    void chooseDress(){

        ProjectObjectModel_2 pom = new ProjectObjectModel_2(driver);

        pom.dressButton.click();

        int size = pom.productList.size();
        int r = new Random().nextInt(size);
        builder.moveToElement(pom.productList.get(r)).perform();
        wait.until(ExpectedConditions.elementToBeClickable(pom.wishListButton.get(r)));
        pom.wishListButton.get(r).click();
        wait.until(ExpectedConditions.elementToBeClickable(pom.closeWishListAlertButton));
        pom.closeWishListAlertButton.click();


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
Click on the add to wishlist <OK>

Click on the user name on the top right  (Next to sign out button )

Click on "My WISHLIST" button

Verify Item is in the wishlist

Click on X button under the Item picture

Verify item is not in the wishlist anymore

Click on the X button under the Delete column

Click on the OK button
 */