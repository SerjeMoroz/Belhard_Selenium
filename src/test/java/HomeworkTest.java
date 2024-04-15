import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;


public class HomeworkTest {

    @Test
    public void MyTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url = ("https://litecart.stqa.ru/en/");
        driver.get(url);


        WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Rubber Ducks')])[2]"));
        element.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        WebElement subCategory = driver.findElement(By.xpath("//ul[@class='list-vertical']//a[contains(text(),'Subcategory')]"));
        subCategory.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

        WebElement duckTitle = driver.findElement(By.cssSelector("h1[class='title']"));

        if (duckTitle.isDisplayed()) {
            System.out.println("Есть контакт! ");
        }else {
            System.out.println(":( ");
        }

        driver.quit();
    }
}

