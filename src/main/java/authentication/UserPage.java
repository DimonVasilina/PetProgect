package authentication;

import static com.codeborne.selenide.WebDriverRunner.url;

public class UserPage {

    public String currentUrl(){
        String currentUrl = url();
        return currentUrl;
    }
}
