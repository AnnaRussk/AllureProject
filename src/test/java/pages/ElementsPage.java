package pages;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsPage {

    public void clickElementsCard() {
        $x("//h5[contains(text(), 'Elements')]").scrollTo().click();
    }

    public void goToTextBox() {
        $x("//span[contains(text(), 'Text Box')]").click();
    }

    public void goToCheckBox() {
        $x("//span[contains(text(), 'Check Box')]").click();
    }

    public void fillUserName(String name) {
        $x("//input[@id='userName']").scrollTo().setValue(name);
    }

    public void submitTextBox() {
        $x("//button[@id='submit']").click();
    }

    public void checkNameOutput(String name) {
        $x("//p[@id='name']").shouldHave(com.codeborne.selenide.Condition.text("Name:" + name));
    }

    public void clickCheckBox() {
        $x("//span[@class='rct-checkbox']").click();
    }

    public void checkCheckBoxMessage() {
        $x("//span[contains(text(), 'You have selected')]")
                .shouldHave(com.codeborne.selenide.Condition.text("You have selected :"));
    }
}
