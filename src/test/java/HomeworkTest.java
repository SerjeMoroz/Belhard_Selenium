import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class HomeworkTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Инициализация WebDriver и открытие страницы
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://litecart.stqa.ru/en/");
    }

    @Test
    public void myTest() throws InterruptedException {

        WebElement rubberDucksLink = driver.findElement(By.partialLinkText("Rubber Ducks"));
        rubberDucksLink.click();

        WebElement subCategoryLink = driver.findElement(By.xpath("//ul[@class='list-vertical']//a[contains(text(),'Subcategory')]"));
        subCategoryLink.click();

        WebElement litecartMainLink = driver.findElement(By.cssSelector("i[title='Home']"));
        litecartMainLink.click();


        WebElement acmeCorpImg = driver.findElement(By.cssSelector("img[title='ACME Corp.']"));
        String titleAttributeValue = acmeCorpImg.getAttribute("title");
        Assert.assertEquals(titleAttributeValue, "ACME Corp.", "Значение атрибута 'title' не соответствует ожидаемому");

        driver.quit();
    }
}
//        if (duckTitle.isDisplayed()) {
//            System.out.println("Есть контакт! ");
//        }else {
//            System.out.println(":( ");
//        }



