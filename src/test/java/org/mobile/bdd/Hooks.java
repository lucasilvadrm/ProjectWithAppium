package org.mobile.bdd;

import appium.connect.App;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
public class Hooks {
    private static final Logger log = LoggerFactory.getLogger(Hooks.class);
    private static AppiumDriver driver;

    // rodar para cada cenário
    @Before
    public void setUpDriver() {
        log.info("Iniciando o driver");
        driver = App.getDriver();
    }

    @After
    public void tearDownDriver() {
        log.info("Finalizando o driver");
        if (driver != null) driver.quit();
        driver = null;
    }

    public static AppiumDriver getDriver() {
        return driver;
    }
}
