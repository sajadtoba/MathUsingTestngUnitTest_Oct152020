package testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AmazonTest {
    public WebDriver driver = null;

    @BeforeMethod
    public void seUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/abc/IdeaProject/MathAetna/drivers/chromedriver");
        driver = new ChromeDriver();
//        System.setProperty("webdriver.gecko.driver","/Users/abc/IdeaProject/MathAetna/drivers/geckodriver");
//        WebDriver driver= new FirefoxDriver();
        //*******************************************************************************************************
        //  driver = new SafariDriver();

        driver.get("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void testSearchItem() {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("laptops");
        driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
    }

    @AfterMethod
    public void cleanUp() {
        driver.close();
    }
}

// if we want to use the driver again and again then we need to declare it outside the method or constructor
// To run the test we need to have the @Test annotation
// We used the 3 annotations
