package com.tryCloud.pages;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccessToContactsModulePage extends BasePageLogin{



    @FindBy(xpath = "//ul[@id='appmenu']/li")
    public List<WebElement> navBar;




    public void click(List<WebElement>list,String str){
       for (WebElement each:list){
           BrowserUtils.hover(each);
           BrowserUtils.waitForClickability(each,3);
           if (each.getText().equals(str)){
               each.click();
              break;
           }
       }
   }

}
