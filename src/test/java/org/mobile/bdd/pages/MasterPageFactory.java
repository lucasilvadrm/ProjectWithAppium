package org.mobile.bdd.pages;

import appium.connect.App;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.mobile.bdd.Hooks;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class MasterPageFactory {
    public static <T> T getPage(Class<T> cls) {
        T page;

        try {
            page = cls.newInstance();
            PageFactory.initElements(new AppiumFieldDecorator(Hooks.getDriver(), Duration.ofSeconds(12)), page);

        } catch (Exception e) {
            App.logger().error("Erro ao instanciar a página", e);
            throw new RuntimeException(e);
        }

        return page;
    }

}
