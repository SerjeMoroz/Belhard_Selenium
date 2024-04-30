package en.ru.stqa.litecart.steps.CheckoutSteps;

import en.ru.stqa.litecart.Pages.CheckoutPage;
import io.cucumber.java.ru.И;

public class CheckoutPagesSteps extends CheckoutPage {

    @И("кликает Confirm order")
    public void userClickConfirmButtonOrder() {
        clickConfirmOrderButton();
    }

}
