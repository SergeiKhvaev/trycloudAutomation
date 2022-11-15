package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilesModulePage extends BasePageLogin{
    public FilesModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

   @FindBy(xpath = "(//li[@data-id='files'])[1]")
    public WebElement filesIcon;

}
