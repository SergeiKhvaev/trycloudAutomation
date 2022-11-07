package com.tryCloud.pages;

import com.tryCloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageLogin {

    public BasePageLogin(){
      PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(css = "input[name='user']")
    public WebElement usernameInput;

    @FindBy(id = "password")
    public WebElement passwordInput;


    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginBtn;


    // method to login, guys
    public void login (String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();




    }

}
