package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By userField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("Login");
    By errorMessage = By.cssSelector("[data-test=error]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("https://tms9-dev-ed.develop.my.salesforce.com/");
    }

    public void login(String user, String password) {
        driver.findElement(userField).sendKeys(user);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessage).getText();
    }
}
