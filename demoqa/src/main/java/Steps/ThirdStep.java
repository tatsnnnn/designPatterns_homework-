package Steps;

import Pages.Fill;
import Data.Info;
import Pages.Submit;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selectors.byText;

public class ThirdStep {
    Fill mainPage = new Fill();
    @Step
    public ThirdStep setFirstname(){
        mainPage.First_Name.setValue(Info.First_Name);
        return this;
    }
    @Step
    public ThirdStep setLastname(){
        mainPage.Last_Name.setValue(Info.Last_Name);
        return this;

    }
    @Step
    public ThirdStep setEmail() {
        mainPage.Email.setValue(Info.Mail);
        return this;
    }
    @Step
    public ThirdStep setNumber() {
        mainPage.Number.setValue(Info.Number);
        return this;
    }
    @Step
    public ThirdStep setGender() {
        mainPage.Gender.$(byText(Info.Gender)).click();
        return this;
    }
    @Step
    public ThirdStep clickSubmit() {
        mainPage.Submit.click();
        return this;
    }

}
