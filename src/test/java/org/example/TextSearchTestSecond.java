package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import pages.HeaderPage;
import pages.LoginPage;
import pages.ProductsPage;

import java.sql.DriverManager;
import java.time.Duration;

public class TextSearchTestSecond {
    private DriverManager DriverFactory;
    private final WebDriver driver = DriverFactory.getDriver();
    private final HeaderPage headerPage = new HeaderPage(driver);
    private final LoginPage loginPage = new LoginPage(driver);
    private final ProductsPage productsPage = new ProductsPage(driver);

    @Test
    public void testProductOrder() {
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        loginPage.login("standard_user", "secret_sauce");
        productsPage.clickAddBikeLightButton();
        headerPage.clickCartIcon();

    }
}
