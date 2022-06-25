package Steps;

import Pages.Forms;
import io.qameta.allure.Step;

public class MainSteps {
    Forms mainPage = new Forms();
    @Step
    public void clickOnForms(){
        mainPage.Forms.scrollTo().click();
    }
}
