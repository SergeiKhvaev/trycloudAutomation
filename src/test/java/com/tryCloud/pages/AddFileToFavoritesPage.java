package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddFileToFavoritesPage extends BasePageLogin {

    public AddFileToFavoritesPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

 //   @FindBy (linkText = "//*[@id= 'appmenu']/li[2]/a")
    @FindBy (xpath = "//*[@id='fileList']/tr/td[1]/a/span[1]")
    public WebElement chosenFile;


    @FindBy (xpath = "//span[.= 'Talk']/..//span[@class='icon icon-more']/../../../../div//a[@class='menuitem action action-favorite permanent']/span[2]")
    public  WebElement addToFavoritesBtn;

    @FindBy(xpath = "//span[@class='nametext']/span[.='Talk']/../..//span[@class='icon icon-starred'] ")
    public WebElement starSigh;

    public WebElement threeDots(String keyName) {
        return Driver.getDriver().findElement(By.xpath("//span[.= '"+keyName+"']/..//span[@class='icon icon-more']"));
    }

    public WebElement RemoveFromFavorite(String keyName) {
        return Driver.getDriver().findElement(By.xpath("//span[.= 'Talk']/..//span[@class='icon icon-more']"));
        }


    }


