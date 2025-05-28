package steps;

import io.qameta.allure.Step;
import pages.ElementsPage;

public class ElementsSteps {

    ElementsPage page = new ElementsPage();

    @Step("Открыть блок Elements и перейти в Text Box")
    public void openTextBoxSection() {
        page.clickElementsCard();
        page.goToTextBox();
    }

    @Step("Заполнить поле имени и отправить")
    public void fillAndSubmitTextBox(String name) {
        page.fillUserName(name);
        page.submitTextBox();
        page.checkNameOutput(name);
    }

    @Step("Открыть блок Check Box")
    public void openCheckBoxSection() {
        page.clickElementsCard();
        page.goToCheckBox();
    }

    @Step("Выбрать чекбокс и проверить результат")
    public void checkTheBox() {
        page.clickCheckBox();
        page.checkCheckBoxMessage();
    }
}