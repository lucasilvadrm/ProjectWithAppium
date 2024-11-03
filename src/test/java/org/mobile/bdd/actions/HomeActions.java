package org.mobile.bdd.actions;

import org.junit.jupiter.api.Assertions;
import org.mobile.bdd.pages.HomePage;
import org.mobile.bdd.pages.MasterPageFactory;
import org.mobile.bdd.support.BaseScreen;

public class HomeActions extends BaseScreen {
    public static HomePage homePage() {
        return MasterPageFactory.getPage(HomePage.class);
    }

    public static void validatePage() {
        waitElement(homePage().getTelaLojas());
    }

    public static void fillSearchField(String search) {
        HomePage homePage = homePage();
        homePage.getSearchField().sendKeys(search);
    }

    public static void validateResultAfterSearch() {
        waitForCertainTime(3000);
        Assertions.assertEquals(1, homePage().getItems().size(), "Nenhum ou mais de um item encontrado");
    }

    public static void clickOnSelectAddress() {
        homePage().getSelectAddress().click();
    }

    public static void validateLocationModalMessage() {
        waitElement(homePage().getLocationModalMessage());
    }

    public static void validateMessage(String message) {
        String text = homePage().getLocationModalMessage().getText();
        Assertions.assertEquals(message, text, "Mensagem não encontrada");
    }

    public static void clickOnLocationModalAllowButton() {
        homePage().getLocationModalAllowButton().click();
    }

    public static void validateAddressAdded() {
        waitElement(homePage().getAddressAdded());
        System.out.println(homePage().getAddressAdded().getText());
    }
}
