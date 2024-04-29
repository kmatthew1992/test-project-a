package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private final WebDriver driver;

    private final By BIKE_LIGHT_ADD_SELECTOR = By.xpath("//button[@data-test='add-to-cart-sauce-labs-backpack']");

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddBikeLightButton() {
        driver.findElement(BIKE_LIGHT_ADD_SELECTOR).click();
    }
}
