import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProjectObjectModel_2 {

    public ProjectObjectModel_2(WebDriver driver){
        PageFactory.initElements(driver, this); //initElements(driver,this);
    }

    @FindBy(css = "#block_top_menu>ul>li:nth-child(2)")
    public WebElement dressButton;

    @FindBy(css = "div[class='product-container']")
    public List<WebElement> productList;

    @FindBy(css = ".wishlist>a")
    public List<WebElement> wishListButton;

    @FindBy(css = "a[class='fancybox-item fancybox-close']")
    public WebElement closeWishListAlertButton;

    //account
    @FindBy(xpath = "(//div[@class='header_user_info'])[1]")
    public WebElement username;
    //icon-heart
    @FindBy(className = "icon-heart")
    public WebElement myWishlistButton;

    @FindBy(css = "tr[id*='wishlist']>td:nth-child(5)>a")
    public WebElement viewWishList;

    @FindBy(css = ".row .lnkdel")
    public WebElement removefromWishList;

    @FindBy(className = "icon-remove")
    public WebElement deleteItem;





}
