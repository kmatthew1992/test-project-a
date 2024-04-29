package org.example;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest {

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

        WebElement addToCartButton = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']"));
        addToCartButton.click();

        WebElement cartButton = driver.findElement(By.xpath("//a[@data-test='shopping-cart-link']"));
        cartButton.click();

        Assertions.assertDoesNotThrow(() -> driver.findElement(By.xpath("//span[text()='Your Cart']")),
                "A kosár oldal nem nyílt meg.");
        Assertions.assertDoesNotThrow(() -> driver.findElement(By.xpath("//button[@data-test= 'remove-sauce-labs-backpack']")),
                "A termék nincs a kosárban");
    }
}
