package en.ru.stqa.litecart.steps.CheckoutSteps;

import en.ru.stqa.litecart.Helpers.Faker;
import en.ru.stqa.litecart.Pages.CheckoutPage;
import io.cucumber.java.ru.И;
import lombok.Getter;

public class CheckoutPagesSteps extends CheckoutPage {

    Faker faker = new Faker();

    @Getter
    private String email = Faker.generateEmail();

    @Getter
    private String name = Faker.generateFirstName();

    @Getter
    private String lastname = Faker.generateLastname();

    @Getter
    private String text = Faker.generateText();

    @Getter
    private String number = Faker.generatePhoneNumber();


    @И("заполняет поле First name")
    public void enterTextFirstNameField() {
        sendTextFirstNameArea(getName());
    }

    @И("заполняет форму Last name")
    public void enterTextLastNameField() {
        sendTextLastNameArea(getLastname());
    }

    @И("заполняет форму Address")
    public void enterAddressField() {
        sendAddressArea(getText());
    }

    @И("заполняет форму Postcode")
    public void enterPostcodeField() {
        sendPostcodeArea(getNumber());
    }

    @И("заполняет форму City")
    public void enterCityField() {
        sendCityArea(getText());
    }

    @И("выбирает Страну")
    public void choiceCountry() {
        clickBelarusDropdownMenu();
    }

    @И("заполнет поле Email")
    public void enterEmailField() {
        sendEmailArea(getEmail());
    }

    @И("Заполняет поле Phone")
    public void enterPhoneField() {
        sendPhoneNumberArea(getNumber());
    }

    @И("пишет комментарии")
    public void sendComments() {
        sensTextCommentsArea(getText());
    }

    @И("кликает Confirm order")
    public void userClickConfirmButtonOrder() {
        clickConfirmOrderButton();
    }

}
