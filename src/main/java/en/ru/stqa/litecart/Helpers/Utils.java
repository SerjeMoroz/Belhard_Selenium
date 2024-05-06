package en.ru.stqa.litecart.Helpers;

import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.openqa.selenium.Cookie;

import java.util.Random;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Utils {

    PropertiesManager propertiesManager = new PropertiesManager();

    @Step("Авторизация через куки")
    public void authorizationWithCookies() {

        String cookie = propertiesManager.getCookiesValue();

        Cookie sessionCookie = new Cookie(
                propertiesManager.getCookiesName(), cookie, propertiesManager.getDomain(), "/",
                null, false, false);

        getWebDriver().manage().addCookie(sessionCookie);
        Selenide.refresh();
    }

    public void assertRandomCartItemCount() {
        Faker faker = new Faker();
        Random random = new Random();
        int expectedItemCount = random.nextInt(10) + 1;

        $("").shouldHave(exactText(String.valueOf(expectedItemCount)));
    }

}
