package en.ru.stqa.litecart.steps;



import com.codeborne.selenide.Screenshots;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static en.ru.stqa.litecart.Helpers.CustomLogger.*;


public class Hooks {

    @Before
    public void setup(Scenario scenario) {
        String featurePath = scenario.getUri().toString();
        String featureName = featurePath.substring(featurePath.lastIndexOf('/') + 1);
        loggerInfoYellow("Выполняется набор тестов - ", featureName);
        loggerInfoYellow("Выполняется сценарий - ", scenario.getName());
    }

    @After
    public void onTestFailure(Scenario scenario) {
        if (scenario.isFailed()) {
            try {
                File screenshot = Screenshots.takeScreenShotAsFile();
                InputStream targetStream = new FileInputStream(screenshot);
                Allure.addAttachment("Screenshot on fail", "image/png", targetStream, "png");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        getWebDriver().quit();
    }

    @After
    public void getScenarioInfo(Scenario scenario) {
        String featurePath = scenario.getUri().toString();
        String featureName = featurePath.substring(featurePath.lastIndexOf('/') + 1);
        loggerInfoYellow("Функциональность: ", featureName);
        loggerInfoYellow("Сценарий - ", scenario.getName());
        if (scenario.isFailed()) {
            loggerInfoRed("Статус прохождения - ", scenario.getStatus());
        } else {
            loggerInfoGreen("Статус прохождения - ", scenario.getStatus());
        }
        System.out.println("######################################################################################################");
    }
}
