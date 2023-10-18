package authentication;
import static com.codeborne.selenide.Selenide.open;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NegativeTest {
    @Test
    public void checkAlertEmptyEmail(){
        open ("https://www.amazon.com/");
        String alertEmtyEmail = new Header().goToSigninForm()
                .clickContinue().getAlertEmptyEmail();
        Assert.assertEquals("Enter your email or mobile phone number", alertEmtyEmail,
                "Alert message isn`t correct ");

    }
}
