package com.tryCloud.steps_definitions;

import com.tryCloud.pages.AccessToContactsModulePage;
import com.tryCloud.pages.BasePageLogin;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Access_To_Contact_Module_Steps_Definitions  {

    AccessToContactsModulePage accessToContactsModulePage=new AccessToContactsModulePage();
    @Given("user is already login to the page")
    public void userIsAlreadyLoginToThePage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("When user use enter {string} and enter {string}")
    public void whenUserUseEnterAndEnter(String username, String password) {
        accessToContactsModulePage.login(username,password);

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String contacts) {

      accessToContactsModulePage.click(accessToContactsModulePage.navBar,contacts);

    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {
        BrowserUtils.verifyTitle(expectedTitle);

    }



}
