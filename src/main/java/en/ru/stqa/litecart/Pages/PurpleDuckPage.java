package en.ru.stqa.litecart.Pages;

import com.codeborne.selenide.SelenideElement;
import en.ru.stqa.litecart.Helpers.Utils;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.sleep;



import static com.codeborne.selenide.Selenide.$;

public class PurpleDuckPage extends BasePage {

    private static final SelenideElement ADD_TO_CARD_BUTTON = $(By.xpath("//button[normalize-space()='Add To Cart']"));
    private static final SelenideElement CHECKOUT_CART_BUTTON = $(By.xpath("(//a[normalize-space()='Checkout »'])[1]"));

    public void clickToAddCardButton() {
        customClick(ADD_TO_CARD_BUTTON);
    }

    public void clickCheckoutButton() {
        sleep(2000);
        customClick(CHECKOUT_CART_BUTTON);
    }



}
