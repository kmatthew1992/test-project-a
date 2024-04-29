package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final By UN_BY = By.xpath("//input[@data-test='username']");
    private final By PW_BY = By.xpath("//input[@data-test='password']");
    private final By LOGIN_BY = By.xpath("//input[@data-test='login-button']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        fillUsernameField(username);
        fillPasswordField(password);
        clickLoginButton();
    }

    private void fillUsernameField(String input) {
        driver.findElement(UN_BY).sendKeys(input);
    }

    private void fillPasswordField(String input) {
        driver.findElement(PW_BY).sendKeys(input);
    }

    private void clickLoginButton() {
        driver.findElement(LOGIN_BY).click();
    }
}
