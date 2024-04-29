package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TextSearchTest {

    ChromeDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(5000), Duration.ofMillis(100));

    @Test
    public void testValidLogin() {
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("//input[@data-test='username']")).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@data-test='password']")).sendKeys("secret_sauce");
        driver.findElement(By.xpath("//input[@data-test='login-button']")).click();
        driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']")).click();
        driver.findElement(By.xpath("//a[@data-test= 'shopping-cart-link']")).click();
        driver.findElement(By.xpath("//button[@data-test='checkout']")).click();
        driver.findElement(By.xpath("//input[@data-test='firstName']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@data-test='lastName']")).sendKeys("Elek");
        driver.findElement(By.xpath("//input[@data-test='postalCode']")).sendKeys("1234");
        driver.findElement(By.xpath("//input[@data-test='continue']")).click();
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath
                ("//div[@data-test='total-label']"), "Total: $10.79"));
    }
}
