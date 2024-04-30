package en.ru.stqa.litecart.steps;

import com.codeborne.selenide.SelenideElement;
import en.ru.stqa.litecart.Helpers.PropertiesManager;
import en.ru.stqa.litecart.Helpers.Utils;
import en.ru.stqa.litecart.Pages.BasePage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class BasePageSteps extends BasePage {

    Utils utils = new Utils();
    PropertiesManager propertiesManager = new PropertiesManager();

    @Дано("пользователь авторизован на сайте через куки")
    public void userAutorizatedOnLite() {
        open("", propertiesManager.getDomain(), propertiesManager.getDevLogin(), propertiesManager.getDevPassword());
        utils.authorizationWithCookies();
    }

    @Дано("пользователь перешёл в раздел Rubber ducks")
    public void userGoIntoRubberDucksChapter() {
        clickCategoriesRubberDucks();
    }


    @И("кликает checkout")
    public void clickCheckout() {
        clickOnTheBasketCheckout();
    }
}
