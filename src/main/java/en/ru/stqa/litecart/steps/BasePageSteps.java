package en.ru.stqa.litecart.steps;

import com.codeborne.selenide.SelenideElement;
import en.ru.stqa.litecart.Helpers.PropertiesManager;
import en.ru.stqa.litecart.Helpers.Utils;
import en.ru.stqa.litecart.Pages.BasePage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class BasePageSteps extends BasePage {

    Utils utils = new Utils();
    PropertiesManager propertiesManager = new PropertiesManager();

    @Дано("пользователь авторизовался через куки")
    public void userAutorizatedOnLite() {
        open("", propertiesManager.getDomain(), propertiesManager.getDevLogin(), propertiesManager.getDevPassword());
        utils.authorizationWithCookies();
    }

    @Когда("пользователь кликнул на кнопку Change")
    public void пользовательКликнулНаКнопкуChange() {
        clickChangeButton();
    }

    @И("выбрал отображение валюты в выпадающем меню на евро")
    public void выбралОтображениеВалютыВВыпадающемМенюНаЕвро() {
        selectCurrencyEuro();
    }

    @И("выбрал страну")
    public void выбралСтрану() {
        selectCountry();
    }

    @И("кликнул Сохранить")
    public void кликнулСохранить() {
        clickSaveChangeForm();
    }


    @Дано("пользователь перешёл в раздел Rubber ducks")
    public void userGoIntoRubberDucksChapter() {
        clickCategoriesRubberDucks();
    }

}
