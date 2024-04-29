package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    private final WebDriver driver;

    private final By FIRST_NAME = By.xpath("//input[@data-test='firstName']");
    private final By LAST_NAME = By.xpath("//input[@data-test='lastName']");
    private final By ZIP = By.xpath("//input[@data-test='postalCode']");
    private final By CONTINUE = By.xpath("//input[@data-test='continue']");
    public CheckoutPage(WebDriver driver) { this.driver = driver; }
    public void writeFirstName() { driver.findElement(FIRST_NAME).sendKeys("Test");}
    public void writeLastName() {driver.findElement(LAST_NAME).sendKeys("Elek");}
    public void writeZip() {driver.findElement(ZIP).sendKeys("Kukutyin");}
    public void clickToContinue() {driver.findElement(CONTINUE).click();}
}
