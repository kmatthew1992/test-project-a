package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testValidLogin() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@data-test='username']"));;
        WebElement passwordField = driver.findElement(By.xpath("//input[@data-test='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

    }
}
