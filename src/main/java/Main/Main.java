import com.sun.jdi.event.ThreadDeathEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.TableHeaderUI;
//import java.time.Duration;
//
//import static org.testng.Assert.assertEquals;
//
//public class Main {
//
//    private WebDriver driver;
//
//    @BeforeMethod
//    public void setUp() {
//
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//        String url = "https://litecart.stqa.ru/en/";
//        driver.get(url);
//    }
//
//    @Test
//    public void testLogin() {
//
//        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sergei.moroz94test@gmail.com");
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123123");
//        driver.findElement(By.cssSelector("button[value='Login']")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".notice.success")));
//
//        Assert.assertTrue(successMessage.isDisplayed(), "Welcome!");
//    }
//
//    @Test
//    public void logOutTest() throws InterruptedException {
//
//        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sergei.moroz94test@gmail.com");
//        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123123");
//        driver.findElement(By.cssSelector("button[value='Login']")).click();
//
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".notice.success")));
//
//        Assert.assertTrue(successMessage.isDisplayed(), "Welcome!");
//
//        WebElement logOutButton = driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]"));
//        logOutButton.click();
//
//        WebElement sucessMessageOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='notice success']")));
//        Assert.assertTrue(sucessMessageOut.isDisplayed(), "You are now logged out.");
//
//    }
//
//    @AfterMethod
//    public void tearDown() {
//        // Закрытие браузера после выполнения теста
//        if (driver != null) {
//            driver.quit();
//        }
//    }
//}