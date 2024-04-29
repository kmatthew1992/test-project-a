package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondCartTest {
    ChromeDriver driver = new ChromeDriver();

    @AfterEach
    public void afterMethodHook() {
        driver.quit();
    }

    @Test
    public void testValidLogin() {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@data-test='username']"));;
        WebElement passwordField = driver.findElement(By.xpath("//input[@data-test='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@data-test='login-button']"));

        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

        WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        addToCartButton.click();

        WebElement removeToCartButton = driver.findElement(By.xpath("//button[@data-test='remove-sauce-labs-backpack']"));
        removeToCartButton.click();

        WebElement cartButton = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        cartButton.click();

        WebElement continueShoppingButton = driver.findElement(By.xpath("//button[@data-test= 'continue-shopping']"));
        continueShoppingButton.click();

        addToCartButton = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        addToCartButton.click();

        cartButton = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        cartButton.click();

    }
}
