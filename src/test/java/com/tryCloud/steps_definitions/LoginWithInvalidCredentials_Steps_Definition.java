package com.tryCloud.steps_definitions;

import com.tryCloud.pages.InvalidLoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginWithInvalidCredentials_Steps_Definition {

    InvalidLoginPage invalidLoginPage = new InvalidLoginPage();

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String string, String string2) {
        invalidLoginPage.usernameInput.sendKeys(string);
        invalidLoginPage.passwordInput.sendKeys(string2);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        invalidLoginPage.loginBtn.click();
    }
    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String string) {
        String actualWrongMessage = invalidLoginPage.wrongMessage.getText();
        Assert.assertEquals(string, actualWrongMessage);

    }
}
