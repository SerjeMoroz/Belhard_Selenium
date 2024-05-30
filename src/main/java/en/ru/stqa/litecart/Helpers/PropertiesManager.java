package en.ru.stqa.litecart.Helpers;

import java.io.*;
import java.util.Properties;

import static en.ru.stqa.litecart.Helpers.CustomLogger.loggerInfoYellow;


public class PropertiesManager {

    private static Properties properties;

    String env = System.getProperty("env");

    private String filePath = "configs/config-" + env + ".properties";

    public PropertiesManager() {

        properties = new Properties();

        try {
            FileInputStream inputStream = new FileInputStream(filePath);
            properties.load(inputStream);
            inputStream.close();
            loggerInfoYellow("Выбран файл настроек для ", env);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeValueInPropertyFile(String nameOfVariable, String valueOfVariable) {

        Properties properties = new Properties();

        try (InputStream inputStream = new FileInputStream(filePath)) {
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        properties.setProperty(nameOfVariable, valueOfVariable);

        try (OutputStream outputStream = new FileOutputStream(filePath)) {
            properties.store(outputStream, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getCookiesName() {
        return properties.getProperty("cookiesName");
    }

    public String getCookiesValue() {
        return properties.getProperty("cookiesValue");
    }

    public static String getUrl() {
        return properties.getProperty("BaseUrl");
    }

    public static String getDomain() {
        return properties.getProperty("domain");
    }

    public static String getHeadless() {
        return properties.getProperty("headless");
    }

    public static String getRemote() {
        return properties.getProperty("remote");
    }

    public static String getBrowser() {
        return properties.getProperty("browser");
    }

    public static String login() {
        System.out.println(properties.getProperty("UserLogin"));
        return properties.getProperty("UserLogin");
    }

    public static String password() {
        System.out.println(properties.getProperty("UserPassword"));
        return properties.getProperty("UserPassword");
    }

}
