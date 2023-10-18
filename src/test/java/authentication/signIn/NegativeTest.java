package authentication.signIn;
import static com.codeborne.selenide.Selenide.open;

import authentication.Header;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
    @Test
    @Owner("Dmytro")
    @Lead("Ivan")
    @Description("Check alert Empty email field in Sign in form")
    @Severity(SeverityLevel.NORMAL)
    @Epic("Registration")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void checkAlertEmptyEmail(){
        Configuration.browser = "chrome";
        open ("https://www.amazon.com/");
        String alertEmtyEmail = new Header().goToSigninForm()
                .clickContinue().getAlertEmptyEmail();
        Assert.assertEquals("Enter your email or mobile phone number", alertEmtyEmail,
                "Alert message isn`t correct ");

    }
}
