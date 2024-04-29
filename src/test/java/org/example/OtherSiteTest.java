package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OtherSiteTest {

    ChromeDriver driver = new ChromeDriver();

    /*@AfterEach
    public void afterMethodHook() {
        driver.quit();
    }*/

    @BeforeEach
    public void setUp(){
        /*driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));*/
    }

    @Test
    public void testValidLogin() {
        driver.get("https://practicetestautomation.com/practice-test-exceptions/");

        WebElement addButton = driver.findElement(By.xpath("//button[@id='add_btn']"));
        addButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000), Duration.ofMillis(1000));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='row2']/input")));

        WebElement inputButton = driver.findElement(By.xpath("//div[@id='row2']/input"));
        inputButton.sendKeys("Hello World!");
    }
}
