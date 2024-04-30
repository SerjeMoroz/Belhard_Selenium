package en.ru.stqa.litecart.Helpers;

import com.codeborne.selenide.WebDriverProvider;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.annotation.CheckReturnValue;
import javax.annotation.Nonnull;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;

public class CustomDriverProvider implements WebDriverProvider {

    String ip = System.getProperty("ip");

    PropertiesManager propertiesManager = new PropertiesManager();

    @Override
    @CheckReturnValue
    @Nonnull
    public WebDriver createDriver(@Nonnull Capabilities capabilities) {
        System.out.println("Try to catch driver");

        String browserName = System.getProperty("browser");
        if ("chrome".equalsIgnoreCase(browserName)) {
            return createChromeDriver();
        } else if ("firefox".equalsIgnoreCase(browserName)) {
            return createFirefoxDriver();
        } else {
            throw new IllegalArgumentException("Unsupported browser: " + browserName);
        }
    }

    private WebDriver createChromeDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        if (Objects.equals(propertiesManager.getHeadless(), "true")) {
            chromeOptions.addArguments("--headless");
        }

        if (Objects.equals(propertiesManager.getRemote(), "true")) {
            chromeOptions.addArguments("--window-size=1920,1080");
            try {
                RemoteWebDriver driver = new RemoteWebDriver(new URL("http://" + ip + ":4444/wd/hub"), chromeOptions);
                driver.setFileDetector(new LocalFileDetector());
                return driver;
            } catch (MalformedURLException e) {
                throw new RuntimeException("Unable to create a remote driver", e);
            }
        } else {
            ChromeDriver chromeDriver = new ChromeDriver(chromeOptions);
            chromeDriver.manage().window().setSize(new Dimension(1920, 1080));
            return chromeDriver;
        }
    }

    private WebDriver createFirefoxDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setAcceptInsecureCerts(true);
        if (Objects.equals(propertiesManager.getHeadless(), "true")) {
            firefoxOptions.addArguments("--headless");
        }

        if (Objects.equals(propertiesManager.getRemote(), "true")) {
            firefoxOptions.addArguments("--window-size=1920,1080");
            try {
                RemoteWebDriver driver = new RemoteWebDriver(new URL("http://" + ip + ":4444/wd/hub"), firefoxOptions);
                driver.setFileDetector(new LocalFileDetector());
                return driver;
            } catch (MalformedURLException e) {
                throw new RuntimeException("Unable to create a remote driver", e);
            }
        } else {
            FirefoxDriver firefoxDriver = new FirefoxDriver(firefoxOptions);
            firefoxDriver.manage().window().setSize(new Dimension(1920, 1080));
            return firefoxDriver;
        }
    }
}

