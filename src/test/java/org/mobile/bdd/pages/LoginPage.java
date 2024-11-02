package org.mobile.bdd.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.mobile.bdd.support.BaseScreen;

@Getter
@NoArgsConstructor
public class LoginPage extends BaseScreen {

    @AndroidFindBy(accessibility = "email")
    private MobileElement inputEmail;

    @AndroidFindBy(accessibility = "password")
    private MobileElement inputPassword;

    @AndroidFindBy(accessibility = "login-button")
    private MobileElement loginButton;

    public MobileElement getInputEmail() {
        return inputEmail;
    }

    public MobileElement getInputPassword() {
        return inputPassword;
    }

    public MobileElement getLoginButton() {
        return loginButton;
    }

    public void validatePage() {
        waitElement(this.inputEmail);
        waitElement(this.inputPassword);
        waitElement(this.loginButton);
    }
}
