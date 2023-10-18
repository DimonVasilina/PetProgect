package authentication;

import static com.codeborne.selenide.Selenide.page;

public class SignInPage extends Locators {

    public SignInPage fillEmail(UsersCredentials user) {
        emailInput.setValue(user.getEmail());
        return page(SignInPage.class);
    }

    public SignInPage clickContinue() {
        continueButton.click();
        return page(SignInPage.class);
    }

    public SignInPage fillPassword(UsersCredentials user) {
        passInput.setValue(user.getPassword());
        return page(SignInPage.class);
    }

    public UserPage clickSigInButton() {
        signInSubmit.click();
        return page(UserPage.class);
    }

    public String getAlertEmptyEmail() {
        String alert = alertByEmail.getText().trim();
        return alert;
    }
}
