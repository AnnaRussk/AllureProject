package steps;

import io.qameta.allure.Step;
import pages.FormsPage;

public class FormsSteps {

    FormsPage page = new FormsPage();

    @Step("Открыть блок Forms и перейти в Practice Form")
    public void openPracticeForm() {
        page.clickFormsCard();
        page.goToPracticeForm();
    }

    @Step("Заполнить форму: имя={0}, фамилия={1}, телефон={2}")
    public void fillForm(String first, String last, String phone) {
        page.fillName(first, last);
        page.chooseGender();
        page.enterPhone(phone);
    }

    @Step("Отправить форму и проверить успешную отправку")
    public void submitAndCheck() {
        page.submitForm();
        page.verifySuccess();
    }
}