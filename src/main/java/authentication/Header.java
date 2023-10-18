package authentication;

import static com.codeborne.selenide.Selenide.page;

public class Header extends Locators {

    public SignInPage goToSigninForm(){
        signInHeader.click();
        return page(SignInPage.class);

    }
}
