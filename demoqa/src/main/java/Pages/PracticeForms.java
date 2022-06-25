package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class PracticeForms {
    WebDriver driver;

    public PracticeForms(WebDriver driver){
        this.driver=driver;
    }

    @FindBy(xpath = "//li[@class='btn btn-light ']/span[text()='Practice Form']")
    public WebElement PracticeForms;
}
