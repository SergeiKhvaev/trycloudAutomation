package com.tryCloud.steps_definitions;

import com.tryCloud.pages.BasePageLogin;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateSettingsStepDef {
    BasePageLogin basePageLogin = new BasePageLogin();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
       basePageLogin.login("User23","Userpass123");

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

    }
    @When("user clicks Settings on the left bottom corner")
    public void user_clicks_settings_on_the_left_bottom_corner() {

    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {

    }

}
