package Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private By errorMessageLocator = By.cssSelector(".notice.success");

    private By successMessageLocator = By.cssSelector(".notice.success");

    protected WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = this.driver;
    }


    public String getErrorMessageText() {
        return driver.findElement(errorMessageLocator).getText();
    }

    public boolean isErrorMessageIsVisible() {
        return driver.findElement(errorMessageLocator).isDisplayed();
    }

}
