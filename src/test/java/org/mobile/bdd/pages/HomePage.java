package org.mobile.bdd.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.mobile.bdd.support.BaseScreen;

@Getter
@NoArgsConstructor
public class HomePage extends BaseScreen {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lojas']")
    private MobileElement telaLojas;

    public void validatePage() {
        waitElement(this.telaLojas);
    }
}
