package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateChangesPage {


    public UpdateChangesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/index.php/apps/files/'])[1]")
    public WebElement userClicksModule;

    @FindBy(className = "settings-button")
    public WebElement userClicksSetting;

    @FindBy(xpath = "//label[@for='showRichWorkspacesToggle']")
    public WebElement userClicksAnyButton;
}
