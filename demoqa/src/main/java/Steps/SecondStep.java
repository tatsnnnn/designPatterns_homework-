package Steps;

import Pages.PracticeForms;

public class SecondStep {
    PracticeForms mainPage = new PracticeForms();

    @Step
    public SecondStep clickOnPracticeForms() {
        mainPage.PracticeForms.scrollTo().click();
        return this;
    }
}
