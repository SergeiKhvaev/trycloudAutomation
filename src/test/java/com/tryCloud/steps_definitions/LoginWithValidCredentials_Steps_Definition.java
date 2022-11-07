package com.tryCloud.steps_definitions;

import com.tryCloud.pages.BasePageLogin;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithValidCredentials_Steps_Definition {

   BasePageLogin BasePageLogin = new BasePageLogin();

    @Given("user on the login page")
    public void user_on_the_login_page_http_qa3_trycloud_net() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }

    @When("user use enter {string} and enter {string}")
    public void user_use_enter_and_enter(String username, String password) {
       // loginPage.usernameInput.sendKeys(username);
       // loginPage.passwordInput.sendKeys(password);

        BasePageLogin.login(username, password);

    }

    @When("user click login button")
    public void user_click_login_button() {
      //  loginPage.loginBtn.click();
    }

    @Then("verify the user should be at dashboard page")
    public void verify_the_user_should_be_at_dashboard_page() {
        String actual = Driver.getDriver().getTitle();
        String expected = "dashboard";

       BrowserUtils.verifyURLContains(expected);


    }

    @When("user use enter username and enter password")
    public void userUseEnterUsernameAndEnterPassword() {

        BasePageLogin.login("User23", "Userpass123");
    }
}
