package en.ru.stqa.litecart.steps;

import com.codeborne.selenide.SelenideElement;
import en.ru.stqa.litecart.Helpers.PropertiesManager;
import en.ru.stqa.litecart.Helpers.Utils;
import en.ru.stqa.litecart.Pages.BasePage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.element;
import static com.codeborne.selenide.Selenide.open;

public class BasePageSteps extends BasePage {

    Utils utils = new Utils();
    PropertiesManager propertiesManager = new PropertiesManager();


    @Когда("переходит на сайт с уточками")
    public void переходитНаСайтСУточками() {
        open("");
    }

    @И("вводит email")
    public void вводитEmail() {
        enterEmailField(propertiesManager.login());
    }


    @И("вводит пароль")
    public void вводитПароль() {
        enterPasswordField(propertiesManager.password());
    }

    @И("кликает кнопку Login")
    public void кликаетКнопкуLogin() {
        clickLoginButton();
    }


    @Дано("пользователь перешёл в раздел Rubber ducks")
    public void userGoIntoRubberDucksChapter() {
        clickCategoriesRubberDucks();
    }


}
