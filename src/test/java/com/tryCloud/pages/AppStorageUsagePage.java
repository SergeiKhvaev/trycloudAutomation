package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppStorageUsagePage {

    public AppStorageUsagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='icon-quota svg']")
    public WebElement userChecksCurrentStorageUsage;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement clickFileButton;

    @FindBy(xpath = "(//span[@class='displayname'])[1]")
    public WebElement userUploadsFile;

    @FindBy (xpath = "//span[@class='icon icon-add']")
    public WebElement userRefreshPage;

    @FindBy(xpath = "//a[@class='icon-quota svg']")
    public WebElement userSeeStorageIncreased;
}
