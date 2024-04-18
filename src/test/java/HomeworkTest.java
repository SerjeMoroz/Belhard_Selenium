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
import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class HomeworkTest {

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String url = "https://litecart.stqa.ru/en/";
        driver.get(url);
    }

    @Test
    public void testLogin() {

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sergei.moroz94test@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123123");
        driver.findElement(By.cssSelector("button[value='Login']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".notice.success")));

        Assert.assertTrue(successMessage.isDisplayed(), "Welcome!");
    }

    @Test
    public void logOutTest() throws InterruptedException {

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sergei.moroz94test@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123123");
        driver.findElement(By.cssSelector("button[value='Login']")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".notice.success")));

        Assert.assertTrue(successMessage.isDisplayed(), "Welcome!");

        WebElement logOutButton = driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]"));
        logOutButton.click();

        WebElement sucessMessageOut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='notice success']")));
        Assert.assertTrue(sucessMessageOut.isDisplayed(), "You are now logged out.");

    }



    @Test
    public void thirdTest() throws InterruptedException {

        WebDriverWait waiting = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement yellowDuck = waiting.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@title='Yellow Duck'])[1]")));
        yellowDuck.click();

        WebElement selectElement = driver.findElement(By.cssSelector("select[name='options[Size]']"));
        Select select = new Select(selectElement);

        select.selectByValue("Medium");

        driver.findElement(By.cssSelector("button[value='Add To Cart']")).click();

        Thread.sleep(500);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkoutLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Checkout »']")));

        checkoutLink.click();

        driver.findElement(By.cssSelector("button[value='Confirm Order']")).click();

    }


    @Test
    public void fourthTest() throws InterruptedException {

        WebElement customerService = driver.findElement(By.xpath("//a[normalize-space()='Customer Service']"));
        customerService.click();

        WebElement aboutUs = driver.findElement(By.xpath("(//a[contains(text(),'About Us')])[1]"));
        aboutUs.click();

        WebElement change = driver.findElement(By.cssSelector(".fancybox-region"));
        change.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement waitingChange = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("select[name='language_code']")));
        waitingChange.click();

        WebElement selectElement = driver.findElement(By.cssSelector("select[name='currency_code']"));
        Select select = new Select(selectElement);

        select.selectByValue("EUR");

        WebElement inputType = driver.findElement(By.cssSelector("input[value='0']"));
        inputType.click();

        WebElement buttonSave = driver.findElement(By.cssSelector("button[value='Save']"));
        buttonSave.click();

        Thread.sleep(4000);

    }



    @Test
    public void fiveTest() throws InterruptedException {

        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("sergei.moroz94test@gmail.com");
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys("123123");
        driver.findElement(By.cssSelector("button[value='Login']")).click();

        WebElement customerServices = driver.findElement(By.xpath("//div[@class='content']//a[contains(text(),'Customer Service')]"));
        customerServices.click();

        driver.findElement(By.cssSelector("input[name='name']")).sendKeys("AAAAAAA");
        driver.findElement(By.cssSelector("input[name='subject']")).sendKeys("AAAABBBBWWWW");
        driver.findElement(By.cssSelector("textarea[name='message']")).sendKeys("Hey!");
        driver.findElement(By.cssSelector("button[value='Send']")).click();

        WebElement logOutButton = driver.findElement(By.xpath("(//a[normalize-space()='Logout'])[1]"));
        logOutButton.click();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement sucesssMessageOut = driver.wait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='notice success']")));
        Assert.assertTrue(sucesssMessageOut.isDisplayed(), "You are now logged out.");



    }


    @AfterMethod
    public void tearDown() {
        // Закрытие браузера после выполнения теста
        if (driver != null) {
            driver.quit();
        }
    }
}
//        if (duckTitle.isDisplayed()) {
//            System.out.println("Есть контакт! ");
//        }else {
//            System.out.println(":( ");
//        }



