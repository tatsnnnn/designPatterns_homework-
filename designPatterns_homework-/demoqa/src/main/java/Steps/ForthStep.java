package Steps;

import Pages.DashboardPage;
import com.codeborne.selenide.Condition;

public class ForthStep {
    DashboardPage dashboardPage = new DashboardPage();


    public ForthStep validateWelcomeText(){
        dashboardPage.welcomeMessage.shouldHave(Condition.text("123"));
        return this;
}
