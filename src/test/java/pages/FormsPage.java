package pages;

import static com.codeborne.selenide.Selenide.$x;

public class FormsPage {

    public void clickFormsCard() {
        $x("//h5[contains(text(), 'Forms')]").click();
    }

    public void goToPracticeForm() {
        $x("//span[contains(text(), 'Practice Form')]").click();
    }

    public void fillName(String first, String last) {
        $x("//input[@id='firstName']").sendKeys(first);
        $x("//input[@id='lastName']").sendKeys(last);
    }

    public void chooseGender() {
        $x("//div[@class='custom-control custom-radio custom-control-inline']").click();
    }

    public void enterPhone(String phone) {
        $x("//input[@id='userNumber']").sendKeys(phone);
    }

    public void submitForm() {
        $x("//button[@id='submit']").scrollTo().click();
    }

    public void verifySuccess() {
        $x("//div[contains(text(), 'Thanks for submitting the form')]")
                .shouldHave(com.codeborne.selenide.Condition.text("Thanks for submitting the form"));
    }
}