package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class Fill {
    WebDriver driver;

    @FindBy(id = "firstName")
    public WebElement First_Name;
    @FindBy(id = "lastName")
    public WebElement Last_Name;
    @FindBy(id = "userNumber")
    public WebElement Number;
    @FindBys({
            @FindBy(id = "genterWrapper"),
            @FindBy(className = "custom-control-label")
    })
    public List<WebElement> Gender;
    @FindBy(id = "submit")
    public WebElement Submit;
    public Forms(WebDriver driver) {

        this.driver = driver;
    }
}




