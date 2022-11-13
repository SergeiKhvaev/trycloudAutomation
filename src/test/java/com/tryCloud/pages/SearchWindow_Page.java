package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchWindow_Page extends BasePageLogin {

    public SearchWindow_Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(css = "input[type='search']")
    public WebElement searchBox;

    public void fileAndFolderSearchVerification(String item) {
        Assert.assertEquals("Not matched", Driver.getDriver().findElement(By.xpath("//a[@href='http://qa3.trycloud.net/index.php/apps/files/?dir=/&scrollto=" + item + "']//strong[.='" + item + "']")).getText(), item);


    }

    public void nameVerification(String name) {
        Assert.assertEquals("Not matched", Driver.getDriver().findElement(By.xpath("///a[contains(@href, '~contacts')]//strong[.='" +name+"']//strong[.='" + name + "']")).getText(), name);


    }

}
