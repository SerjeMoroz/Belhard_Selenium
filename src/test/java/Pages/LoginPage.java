package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private By emailInputLocator = By.cssSelector("input[name='email']");
    private By passwordInputLocator = By.cssSelector("input[name='password']");
    private By loginButtonLocator = By.cssSelector("button[value='Login']");

    protected WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    public void attemptLogin (String username, String password) {
        driver.findElement(emailInputLocator).sendKeys(username);
        driver.findElement(passwordInputLocator).sendKeys(password);
        driver.findElement(loginButtonLocator).click();
    }

}
