package org.mobile.bdd.actions;

import org.mobile.bdd.pages.HomePage;
import org.mobile.bdd.pages.MasterPageFactory;

public class HomeActions {
    public static HomePage homePage() {
        return MasterPageFactory.getPage(HomePage.class);
    }

    public static void validatePage() {
        homePage().validatePage();
    }
}
