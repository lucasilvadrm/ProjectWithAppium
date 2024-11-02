package org.mobile.bdd.actions;

import org.mobile.bdd.pages.LoginPage;
import org.mobile.bdd.pages.MasterPageFactory;

public class LoginActions {

    public static LoginPage loginPage() {
        return MasterPageFactory.getPage(LoginPage.class);
    }

    public static void validatePage() {
        loginPage().validatePage();
    }

    public static void fillPage(String email, String password) {
        LoginPage loginPage = loginPage();
        loginPage.getInputEmail().sendKeys(email);
        loginPage.getInputPassword().sendKeys(password);
    }

    public static void performLogin(String email, String password) {
        validatePage();
        fillPage(email, password);
        submit();
    }

    public static void submit() {
        loginPage().getLoginButton().click();
    }
}
