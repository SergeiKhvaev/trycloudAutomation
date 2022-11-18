package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoldersPage {
    public FoldersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css ="ul[id='appmenu'] a[aria-label='Files']")
    public WebElement filesBox;

    @FindBy(xpath ="//span[@class='icon icon-add']")
    public WebElement addFileBtn;


@FindBy(xpath = "//a[.='New folder'] ")
    public WebElement newFolderInput;

    }

