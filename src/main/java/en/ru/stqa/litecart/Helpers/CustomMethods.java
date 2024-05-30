package en.ru.stqa.litecart.Helpers;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import java.io.File;
import java.time.Duration;
import java.util.Random;

import static com.codeborne.selenide.Condition.*;

public class CustomMethods {

    Utils utils = new Utils();

    /**
     * Кастомный метод для ввода
     * @param field - локатор поля ввода
     * @param value - вводимое значение
     */
    public void enterValueInField(SelenideElement field, String value) {
        field.shouldBe(enabled, Duration.ofSeconds(10));
        field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        field.setValue(value);
        assert field.getValue().equals(value) : "Поле ввода не содержит текст: " + value;
    }

    public void enterTextInField(SelenideElement field, String value) {
        field.shouldBe(enabled, Duration.ofSeconds(10));
        field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        field.setValue(value);
        assert field.getText().equals(value) : "Поле ввода не содержит текст: " + value;
    }

    /**
     * Кастомный метод для клика
     * @param element - локатор элемента, по которому необходимо кликнуть
     */
    public void customClick(SelenideElement element) {
        element.shouldBe(visible, Duration.ofSeconds(15));
        element.shouldBe(enabled, Duration.ofSeconds(15));
        element.click();
    }

    /**
     * Метод, проверяющий наличие элемента на странице
     * @param element - локатор элемента на странице, который должен быть видимым
     * @return - возвращает true в случае его видимости, false - в обратной ситуации
     */
    public boolean checkIfElementDisplayed(SelenideElement element) {
        return element.is(visible, Duration.ofSeconds(5));
    }

    /**
     * Метод, кликающий по случайному элементу на странице
     * @param elements - общий локатор для нескольких однотипных элементов на странице
     */
    public void clickRandomElementCollection(ElementsCollection elements) {
        if (!elements.isEmpty()) {
            int randomIndex = new Random().nextInt(elements.size());
            SelenideElement randomElement = elements.get(randomIndex);
            String selectElement = randomElement.getText();
            CustomLogger.loggerInfoYellow("Выбран элемент ", selectElement);
            randomElement.click();
        } else {
            CustomLogger.loggerInfoRed("Элементы  с XPath ", elements + " не найдены.");
        }
    }

    /**
     * @param element - локатор элемента на странице, с помощью которого загружается файл на сайт
     * @param imageFile - имя файла, указывается с форматом файла, например someDocument.pdf
     */
    public void uploadFile(SelenideElement element, String imageFile) {
        String filesDirectory = System.getProperty("user.dir");
        String filePath = filesDirectory + File.separator + "images" + File.separator + imageFile;
        element.uploadFile(new File(filePath));
    }

    /**
     * Метод для ожидания пока элемент не станет невидимым
     */
    public void waitUntilElementWillNotVisible(SelenideElement element) {
        element.shouldNotBe(visible, Duration.ofSeconds(10));
    }

    /**
     * @param element - локатор элемента на странице
     * @param nameOfElement - имя проверяемого элемента
     */
    public void checkIsFieldDisabled(SelenideElement element, String nameOfElement) {
        assert element.is(disabled, Duration.ofSeconds(10)) : "Неправильный статус поле, поле " + nameOfElement + " - активно";
    }

    public void valueEnterNumberFieldChecked(SelenideElement field, String value) {
        field.shouldBe(enabled, Duration.ofSeconds(10));
        field.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.BACK_SPACE);
        field.setValue(value);
        String actualValue = utils.clearStringOfInt(field.getValue());
        assert actualValue.equals(value) : "Поле ввода не содержит текст: \n Актуальное значение: " + actualValue + "\n Ожидаемое значение: " + value;
    }

}
