package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFileFolder_Page extends BasePageLogin {

   public DeleteFileFolder_Page(){
       PageFactory.initElements(Driver.getDriver(), this);
   }

   @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]/a")
    public WebElement filesIcon;


   @FindBy (xpath = "//span[.='Delete folder']/..")
    public WebElement deleteFolder;

   @FindBy (linkText = "Deleted files")
    public WebElement deletedFilesIcon;



   public WebElement threeDots(String keyName){
       return Driver.getDriver().findElement(By.xpath("//span[.='"+keyName+"']/..//a[@class='action action-menu permanent']"));
   }

   public WebElement deletedFile(String keyName){
       return Driver.getDriver().findElement(By.xpath("//span[.='"+keyName+"']/../..//span[.=' Restore']"));
   }
}
