package authentication;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class PositiveTest {

    @Test
    @Owner("Dmytro")
    @Lead("Ivan")
    @Description("Check opening user`s page after Sign in")
    @Severity(SeverityLevel.NORMAL)
    @Epic("New user`s page")
    @Link(name = "requirements", url = "https://www.somerequire.com", type = "Trello")
    public void signInExistUser() throws IOException {
        Properties properties = new Properties();
        FileInputStream input = new FileInputStream("src/main/resources/user_credentials.properties");
        properties.load(input);
        UsersCredentials user1 =
                new UsersCredentials(properties.getProperty("user1.email"), properties.getProperty("user1.password"));
        open("https://www.amazon.com/");
        String getPageAfterSigIn = new Header().goToSigninForm()
                .fillEmail(user1).clickContinue()
                .fillPassword(user1).clickSigInButton()
                .currentUrl();
        Assert.assertEquals("https://www.amazon.com/?ref_=nav_ya_signin", getPageAfterSigIn,
                "Current page isn`t account page");
    }
}
