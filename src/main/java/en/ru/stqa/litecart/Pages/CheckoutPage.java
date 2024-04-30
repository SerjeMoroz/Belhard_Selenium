package en.ru.stqa.litecart.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;

import static com.codeborne.selenide.Selenide.*;

public class CheckoutPage extends BasePage {


    private static final SelenideElement FIRST_NAME_AREA = $(By.cssSelector("input[name='firstname']"));
    private static final SelenideElement LAST_NAME_AREA = $(By.cssSelector("input[name='lastname']"));
    private static final SelenideElement ADDRESS_1_AREA = $(By.cssSelector("input[name='address1']"));
    private static final SelenideElement POSTCODE_AREA = $(By.cssSelector("input[name='postcode']"));
    private static final SelenideElement CITY_AREA = $(By.cssSelector("input[name='city']"));
    private static final SelenideElement COUNTRY = $(By.cssSelector("select[name='country_code']"));
    private static final SelenideElement EMAIL_AREA = $(By.xpath("//input[@name='email']"));
    private static final SelenideElement PHONE_NUMBER_AREA = $(By.xpath("//*[@id=\"box-checkout-customer\"]/div/form/div[1]/table/tbody/tr[6]/td[2]/input"));
    private static final SelenideElement CONFIRM_ORDER = $(By.cssSelector("button[value='Confirm Order']"));


    public void sendTextFirstNameArea(String name) {
        enterTextInField(FIRST_NAME_AREA, name);
    }

    public void sendTextLastNameArea(String Lastname) {
        enterTextInField(LAST_NAME_AREA, Lastname);
    }

    public void sendAddressArea(String text) {
        enterTextInField(ADDRESS_1_AREA, text);
    }

    public void sendPostcodeArea(String randomNumber) {
        enterValueInField(POSTCODE_AREA, randomNumber);
    }

    public void sendCityArea(String text) {
        enterTextInField(CITY_AREA, text);
    }

    public void clickCountryDropDownMenu() {
        element(COUNTRY).selectOptionByValue("BY");
    }

    public void sendEmailArea(String email) {
        enterTextInField(EMAIL_AREA, email);
    }

    public void sendPhoneNumberArea(String number) {
        enterValueInField(PHONE_NUMBER_AREA, number);
    }

    public void clickConfirmOrderButton() {
        customClick(CONFIRM_ORDER);
    }

}
