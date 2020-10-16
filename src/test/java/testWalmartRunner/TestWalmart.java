package testWalmartRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class TestWalmart {

    public WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        driver = new SafariDriver();
        driver.get("https://www.walmart.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.getTitle();
        //driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        System.out.println("Sajad wants to get the Title:"+driver.getTitle());
        System.out.println("Abdul wants the get the current Title:  "+ driver.getCurrentUrl());
    }
    @Test
    public void testSearchBread(){
        driver.findElement(By.cssSelector("#global-search-input")).sendKeys("Bread"+ Keys.ENTER);

        //driver.findElement(By.cssSelector("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[3]/div[2]/div[1]/form[1]/button[3]/span[1]/img[1]")).click();
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
}
