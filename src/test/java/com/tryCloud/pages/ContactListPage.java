package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactListPage {

    public ContactListPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath ="(//li[@data-id='contacts'])[1]")
    public WebElement contactModule;


    @FindBy(css = "div[class='app-content-list-item-line-one']")
    public List<WebElement> listOfContact;




}
