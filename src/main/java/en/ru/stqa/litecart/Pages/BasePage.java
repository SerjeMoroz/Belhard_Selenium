package en.ru.stqa.litecart.Pages;

import com.codeborne.selenide.SelenideElement;
import en.ru.stqa.litecart.Helpers.CustomMethods;
import en.ru.stqa.litecart.Helpers.PropertiesManager;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byXpath;

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
    private static final SelenideElement INPUT_EMAIL_FIELD = $(byXpath("//input[@name='email']"));
    private static final SelenideElement INPUT_PASSWORD_FIELD = $(byXpath("//input[@name='password']"));
    private static final SelenideElement LOGIN_BUTTON = $(byCssSelector("button[value='Login']"));


    public void enterEmailField(String login) {
        enterValueInField(INPUT_EMAIL_FIELD, login);
    }

    public void enterPasswordField(String password) {
        enterValueInField(INPUT_PASSWORD_FIELD, password);
    }

    public void clickLoginButton() {
        customClick(LOGIN_BUTTON);
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
