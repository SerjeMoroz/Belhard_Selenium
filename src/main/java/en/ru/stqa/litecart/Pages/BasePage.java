package en.ru.stqa.litecart.Pages;

import com.codeborne.selenide.SelenideElement;
import en.ru.stqa.litecart.Helpers.CustomMethods;
import io.cucumber.java.en_lol.BUT;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;


import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.Keys.ENTER;

public class BasePage extends CustomMethods {
    private static final SelenideElement INPUT_SEARCH_FIELD = $(By.cssSelector("input[placeholder='Search']"));
    private static final SelenideElement CUSTOMER_SERVICE_BUTTON = $(By.xpath("//div[@class='content']//a[contains(text(),'Customer Service')]"));
    private static final SelenideElement ORDER_HISTORY_BUTTON = $(By.xpath("//div[@class='content']//a[normalize-space()='Order History']"));
    private static final SelenideElement EDIT_ACCOUNT_BUTTON = $(By.xpath("//div[@class='content']//a[normalize-space()='Edit Account']"));
    private static final SelenideElement LOGOUT_BUTTON = $(By.xpath("//div[@class='content']//a[normalize-space()='Logout']"));
    private static final SelenideElement RUBBER_DUCKS_MENU_BUTTON = $(By.xpath("//td[@class='categories']//a[contains(text(),'Rubber Ducks')]"));
    private static final SelenideElement PURPLE_DUCK = $(By.xpath("(//a[@title='Purple Duck'])[1]"));
    private static final SelenideElement YELLOW_DUCK = $(By.xpath("(//a[@title='Yellow Duck'])[1]"));
    private static final SelenideElement GREEN_DUCK = $(By.xpath("(//a[@title='Green Duck'])[1]"));
    private static final SelenideElement RED_DUCK = $(By.xpath("(//a[@title='Red Duck'])[1]"));
    private static final SelenideElement BLUE_DUCK = $(By.xpath("(//a[@title='Blue Duck'])[1]"));
    private static final SelenideElement BUTTON_CHANGE_REGION_AND_COURSES = $(byCssSelector(".fancybox-region"));
    private static final SelenideElement CURRENCY_DROPDOWN_MENU = $(byCssSelector("select[name='currency_code']"));
    private static final SelenideElement COUNTRY_DROPDOWN_MENU = $ (byCssSelector("select[name='country_code']"));
    private static final SelenideElement BUTTON_SAVE = $(byCssSelector("button[value='Save']"));



    public void sendIntoInputField(String text) {
        enterTextInField(INPUT_SEARCH_FIELD.pressEnter(), text);
    }

    public void clickCustomerServiceButton() {
        customClick(CUSTOMER_SERVICE_BUTTON);
    }

    public void clickOrderHistoryButton() {
        customClick(ORDER_HISTORY_BUTTON);
    }

    public void clickEditAccountButton() {
        customClick(EDIT_ACCOUNT_BUTTON);
    }

    public void clickLogoutButton() {
        customClick(LOGOUT_BUTTON);
    }

    public void clickChangeButton() {
        customClick(BUTTON_CHANGE_REGION_AND_COURSES);
    }

    public void selectCurrencyEuro() {
        element(CURRENCY_DROPDOWN_MENU).selectOptionByValue("EUR");
    }

    public void selectCountry() {
        element(COUNTRY_DROPDOWN_MENU).selectOptionByValue("BY");
    }

    public void clickSaveChangeForm() {
        customClick(BUTTON_SAVE);
    }

    public void clickCategoriesRubberDucks() {
        customClick(RUBBER_DUCKS_MENU_BUTTON);
    }

    public void userClickPurpleDuck() {
        customClick(PURPLE_DUCK);
    }

    public void userClickYellowDuck() {
        customClick(YELLOW_DUCK);
    }

    public void userClickGreenDuck() {
        customClick(GREEN_DUCK);
    }

    public void userClickRedDuck() {
        customClick(RED_DUCK);
    }

    public void userClickBlueDuck() {
        customClick(BLUE_DUCK);
    }



}
