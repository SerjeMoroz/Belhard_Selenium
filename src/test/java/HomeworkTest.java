import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class HomeworkTest {

    @Test
    public void MyTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);


        List<WebElement> Url = driver.findElements(By.xpath("//div[@id='content']//a"));

        System.out.println("Количество найденных ссылок: " + Url.size());

        if (Url.size() > 9) {
            WebElement UrlLink = Url.get(9);
            UrlLink.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement element = wait.until(ExpectedConditions.visibilityOf((WebElement) Url));

        }

        driver.quit();
    }
}

