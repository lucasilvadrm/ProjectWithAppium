package org.mobile.bdd.support;

import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Assertions;
import org.mobile.bdd.Hooks;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static appium.config.DefaultValue.TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS;

public class BaseScreen {

    public static void waitElement(MobileElement element) {
        try {
            new WebDriverWait(Hooks.getDriver(), TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS)
                    .until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            Assertions.fail("Elemento não encontrado: " + element);
        }

    }

    public static void waitForCertainTime(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
