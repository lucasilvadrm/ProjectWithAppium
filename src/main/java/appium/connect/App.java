package appium.connect;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import static appium.config.DefaultValue.*;

@Slf4j
public class App {
    private static final Logger log = LoggerFactory.getLogger(App.class);
    private static AppiumDriver<MobileElement> driver = null;

    public static DesiredCapabilities getCapabilities() {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        try {
            capabilities.setCapability(MobileCapabilityType.APP, new File(PATH_APP).getAbsolutePath());
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PLATFORM_ANDROID);
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, NAME_DEVICE);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return capabilities;
    }

    public static URL getURL() throws MalformedURLException {
        return new URL(PATH_URL_APPIUM);
    }

    public static AppiumDriver<MobileElement> getDriver() {
        try {
            driver = new AndroidDriver<>(getURL(), getCapabilities());
            driver.manage().timeouts().implicitlyWait(TIME_SERVER, TimeUnit.SECONDS);
        } catch (Exception e) {
            log.error("Erro ao criar o driver", e);
            throw new RuntimeException(e);
        }

        return driver;
    }

    public static Logger logger() {
        return log;
    }

    public static void relaunchApp() {
        driver.launchApp();
    }
}
