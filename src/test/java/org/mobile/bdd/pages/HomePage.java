package org.mobile.bdd.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class HomePage {
    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Lojas']")
    private MobileElement telaLojas;

    @AndroidFindBy(accessibility = "search-field")
    private MobileElement searchField;

    @AndroidFindBy(accessibility = "store-list-item")
    private List<MobileElement> items;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Selecione seu endereço...']")
    private MobileElement selectAddress;

    @AndroidFindBy(id = "android:id/message")
    private MobileElement locationModalMessage;

    @AndroidFindBy(id = "android:id/button1")
    private MobileElement locationModalAllowButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Av. Governador A. Konder, 20\"]")
    private MobileElement addressAdded;

    public MobileElement getTelaLojas() {
        return telaLojas;
    }

    public MobileElement getAddressAdded() {
        return addressAdded;
    }

    public MobileElement getLocationModalAllowButton() {
        return locationModalAllowButton;
    }

    public MobileElement getSelectAddress() {
        return selectAddress;
    }

    public MobileElement getLocationModalMessage() {
        return locationModalMessage;
    }

    public MobileElement getSearchField() {
        return searchField;
    }

    public List<MobileElement> getItems() {
        return items;
    }

}
