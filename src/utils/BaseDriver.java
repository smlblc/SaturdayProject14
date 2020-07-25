package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseDriver {

    protected WebDriver driver;
    protected Actions builder;
    protected WebDriverWait wait;
    protected JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
    @Parameters({"browser"})
    protected void setup(@Optional("chrome") String browser) {
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        builder = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
        js = (JavascriptExecutor) driver;
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        WebElement signIn = driver.findElement(By.className("login"));
        signIn.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
        WebElement email_address = driver.findElement(By.id("email"));
        email_address.sendKeys("emailqwe@gmail.com");
        WebElement password = driver.findElement(By.id("passwd"));
        password.sendKeys("12345");
        WebElement signInButton = driver.findElement(By.cssSelector(".icon-lock.left"));
        signInButton.click();
    }

    @AfterClass(alwaysRun = true)
    protected void closeDriver() {
        driver.quit();
    }
}
