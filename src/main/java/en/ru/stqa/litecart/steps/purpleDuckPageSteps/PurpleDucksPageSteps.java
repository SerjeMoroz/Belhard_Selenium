package en.ru.stqa.litecart.steps.purpleDuckPageSteps;

import en.ru.stqa.litecart.Helpers.Faker;
import en.ru.stqa.litecart.Pages.BasePage;
import en.ru.stqa.litecart.Pages.PurpleDuckPage;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import lombok.Getter;

public class PurpleDucksPageSteps extends PurpleDuckPage {

    @Getter
    private String randomQuantity = Faker.generatePhoneNumber();


    @Когда("пользователь кликнул по розовой уточке и перешёл на её страницу")
    public void userClickDuckPurple() {
        userClickPurpleDuck();
    }

    @И("кликнул Добавить в корзину")
    public void clickButtonAddCard() {
        clickToAddCardButton();

    }

    @И("кликает checkout")
    public void buttonCheckoutClick() {
        clickCheckoutButton();
    }

    @Дано("пользователь авторизовался")
    public void пользовательАвторизовался() {

    }
}

