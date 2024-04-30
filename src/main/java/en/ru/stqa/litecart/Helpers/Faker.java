package en.ru.stqa.litecart.Helpers;

import java.util.List;
import java.util.Random;

@SuppressWarnings("ALL")
public class Faker {

    /**
     * при необходимости добавить еще генарицию необходимых данных
     */

    public static net.datafaker.Faker faker = new net.datafaker.Faker();

    public static String generateFirstName() {
        return "Test_" + faker.name().firstName();
    }

    public static String generateLastname() {
        return faker.name().lastName();
    }

    public static String generateEmail() {
        return faker.internet().emailAddress();
    }

    public static String generateText() {
        return faker.lorem().sentence();
    }

    public static String generatePhoneNumber() {
        Random random = new Random();
        return getRandomPhoneCode() + (random.nextInt(9000000) + 1000000);
    }

    public static String getRandomPhoneCode() {
        String[] codeList = {"25", "33", "29", "44"};
        String randomCode = selectRandomCode(codeList);
        return randomCode;
    }

    public static String selectRandomCode(String[] codeList) {
        Random random = new Random();
        int randomIndex = random.nextInt(codeList.length);
        return codeList[randomIndex];
    }


    public static String generateRandomLink() {
        return faker.internet().url();
    }

    public static String generateRandomQuantity() {
        double randomQuantity = faker.number().numberBetween(150000, 200000);
        String Number = String.valueOf(randomQuantity);
        return Number;
    }

}
