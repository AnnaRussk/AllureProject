package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import steps.ElementsSteps;
import steps.FormsSteps;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static io.qameta.allure.Allure.step;

public class Tests {

    private final String url = "https://demoqa.com/";

    ElementsSteps elements = new ElementsSteps();
    FormsSteps forms = new FormsSteps();

    @BeforeAll
    public static void setup() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    public void textBoxTest_withListener() {
        addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
        open(url);
        elements.openTextBoxSection();
        elements.fillAndSubmitTextBox("Какое-то Имя");
    }

    @Test
    public void checkBoxTest_withLambdaSteps() {
        step("Открыть сайт", () -> open(url));
        step("Перейти в Check Box", () -> {
            elements.openCheckBoxSection();
            elements.checkTheBox();
        });
    }

    @Test
    public void practiceForm_withStepsAnnotations() {
        open(url);
        forms.openPracticeForm();
        forms.fillForm("Имя", "Фамилия", "1234567890");
        forms.submitAndCheck();
    }
}