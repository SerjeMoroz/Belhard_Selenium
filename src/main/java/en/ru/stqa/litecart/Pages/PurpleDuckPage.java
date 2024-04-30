package en.ru.stqa.litecart.Pages;

import com.codeborne.selenide.SelenideElement;
import en.ru.stqa.litecart.Helpers.Utils;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class PurpleDuckPage extends BasePage {

    Utils utils = new Utils();

    private static final SelenideElement INPUT_QUANTITY_FIELD = $(By.cssSelector("input[value='1']"));
    private static final SelenideElement ADD_TO_CARD_BUTTON = $(By.cssSelector("button[value='Add To Cart']"));
    private static final SelenideElement CHECKED_QUANTITY_CART = $(By.cssSelector("span[class='quantity']"));

    public void enterInputQuantityField(String value) {
        enterValueInField(INPUT_QUANTITY_FIELD, value);
    }

    public void clickToAddCardButton() {
        customClick(ADD_TO_CARD_BUTTON);
    }

    public void getDisplayedDucksInCart() {
        checkIfElementDisplayed(CHECKED_QUANTITY_CART);
    }

}
