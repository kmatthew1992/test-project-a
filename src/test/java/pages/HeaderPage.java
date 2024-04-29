package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderPage {

    private final WebDriver driver;
    private final By CART_ICON_SELECTOR = By.xpath("//a[@data-test='shopping-cart-link']");

    public HeaderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCartIcon() {
        driver.findElement(CART_ICON_SELECTOR).click();
    }
}
