package appium.config;

public class DefaultValue {
    // Nomes do APP
    public static final String NAME_APK = "qafood.apk";

    // Nomes device
    public static final String NAME_DEVICE = "emulator-5554";

    // Config Path
    public static final String PATH_APP = "src/main/java/appium/apk/" + NAME_APK;
    public static final String PATH_URL_APPIUM = "http://localhost:4724/";

    // Config Plataforma
    public static final String PLATFORM_ANDROID = "Android";

    // Config Time
    public static final int TIME_SERVER = 30;
    public static final int TIME_DEFAULT = 5;

    public static final int TIMEOUT_PRESENCE_OF_ELEMENT_LOCATED_SECONDS = 30;
}
