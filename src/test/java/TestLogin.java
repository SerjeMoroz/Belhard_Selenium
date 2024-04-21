import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestLogin {

    ChromeDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://litecart.stqa.ru/en/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }


    @Test
    public void ducksCorrectLoginTest() {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.attemptLogin("sergei.moroz94test@gmail.com", "123123");

        HomePage homePage = new HomePage();

    }

}
