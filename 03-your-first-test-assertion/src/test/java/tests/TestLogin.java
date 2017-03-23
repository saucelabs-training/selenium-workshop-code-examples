package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class TestLogin {

    private WebDriver driver;

    @Before
    public void setUp() {
        // Windows
        //System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");
        // Mac
        //System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");

        driver = new ChromeDriver();
    }

    @Test
    public void succeeded() {
        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button")).click();

        assertTrue("success message not present",
                driver.findElement(By.cssSelector(".flash.success")).isDisplayed());
        //assertTrue("success message not present",
        //        driver.findElement(By.cssSelector(".flash.successasdf")).isDisplayed());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
