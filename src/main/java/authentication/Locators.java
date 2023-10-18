package authentication;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Locators {
    SelenideElement signInHeader = $(By.id("nav-link-accountList"));
    SelenideElement emailInput = $(By.xpath("//*[@id='ap_email']"));
    SelenideElement continueButton = $(By.id("continue"));
    SelenideElement alertByEmail = $(By
            .xpath("//div[@id='auth-email-missing-alert']//div[@class='a-alert-content']"));
    //Декілька елементів, не хочу обирати за номером. Так вважаю, буде стабільніший Xpath
    SelenideElement passInput = $(By.id("ap_password"));
    SelenideElement signInSubmit = $(By.id("signInSubmit"));
}
