package en.ru.stqa.litecart.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage extends BasePage {

    private static final SelenideElement CONFIRM_ORDER = $(By.cssSelector("button[value='Confirm Order']"));


    public void clickConfirmOrderButton() {
        customClick(CONFIRM_ORDER);
    }


}
