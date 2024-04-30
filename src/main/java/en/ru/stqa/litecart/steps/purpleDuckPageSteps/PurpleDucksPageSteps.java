package en.ru.stqa.litecart.steps.purpleDuckPageSteps;

import en.ru.stqa.litecart.Helpers.Faker;
import en.ru.stqa.litecart.Pages.BasePage;
import en.ru.stqa.litecart.Pages.PurpleDuckPage;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;
import lombok.Getter;

public class PurpleDucksPageSteps extends PurpleDuckPage {

    @Getter
    private String randomQuantity = Faker.generateRandomNumber();


    @Когда("пользователь кликнул по розовой уточке и перешёл на её страницу")
    public void userClickDuckPurple() {
        userClickPurpleDuck();
    }

    @И("ввёл нужное ему количество в поле ввода")
    public void enterRandomQuantityDucks() {
        enterInputQuantityField(getRandomQuantity());
    }


    @И("кликнул Добавить в корзину")
    public void clickButtonAddCard() {
        clickToAddCardButton();
    }


    @И("это количество отображается в корзине")
    public void verifyQuantityDucksInCart() {
    }

}

