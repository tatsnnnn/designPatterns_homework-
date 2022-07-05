import Steps.ForthStep;
import Steps.MainSteps;
import Steps.SecondStep;
import Steps.ThirdStep;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
@Epic("Regression tests")
@Feature("Fill students data")
public class Maintest {
    MainSteps mainPageSteps = new MainSteps();
    SecondStep formsSteps = new SecondStep();
    ThirdStep fillDataSteps = new ThirdStep();
    ForthStep resultStep = new ForthStep();

    @BeforeMethod
    public void before(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);
        open("https://demoqa.com/");
    }
    @Test(description = "Fill the student information and check it.")
    @Severity(SeverityLevel.BLOCKER)
    @Description("Successful filling scenario.")
    @Story("Successful tests")
    public void done(){

        mainPageSteps.clickOnForms();
        formsSteps.clickOnPracticeForms();
        fillDataSteps.setFirstname()
                .setLastname()
                .setGender()
                .setNumber()
                .clickSubmit();
    }
    @AfterMethod
    public void after(){
        WebDriverRunner.closeWebDriver();
    }

}