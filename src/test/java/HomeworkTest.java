import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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

        if (Url.size() > 43) {
            WebElement UrlLink = Url.get(9);
            UrlLink.click();
        }

        Thread.sleep(2000);

        driver.quit();
    }
}

