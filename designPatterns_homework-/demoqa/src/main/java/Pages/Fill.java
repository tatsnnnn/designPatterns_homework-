package Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class Fill {
    public SelenideElement First_Name = $(By.id("firstName"));
    public SelenideElement Last_Name = $(By.id("lastName"));
    public SelenideElement Email = $(By.id("userEmail"));
    public SelenideElement Number = $(By.id("userNumber"));
    public SelenideElement Gender = $("#genterWrapper");
    public SelenideElement Submit;
}
