package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppStorageUsagePage {

    public AppStorageUsagePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='icon-quota svg']")
    public WebElement userChecksCurrentStorageUsage;

    @FindBy(xpath = "//span[@class='icon icon-add']")
    public WebElement clickFileButton;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement userUploadsFile;

    @FindBy (id = "uploadprogressbar")
    public WebElement waitTillLoaded;

    @FindBy(xpath = "//a[@class='icon-quota svg']")
    public WebElement userSeeStorageIncreased;
    @FindBy (xpath = "//div[@id='app-navigation']//li//a")
    public List<WebElement> leftSideMenuOptions;
}
