package com.tryCloud.steps_definitions;

import com.tryCloud.pages.BasePageLogin;
import com.tryCloud.pages.FilesModulePage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilesModule_step_definition {

    BasePageLogin basePageLogin=new BasePageLogin();
    FilesModulePage filesModulePage=new FilesModulePage();
    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("user will enter {string} and enter {string}")
    public void user_will_enter_and_enter(String username, String password) {
       basePageLogin.login(username,password);
    }
    @Then("user click on {string} module element")
    public void user_click_on_files_module_element(String files) {
        filesModulePage.filesIcon.click();


    }
    @Then("user verify title of files module.")
    public void user_verify_title_of_files_module() {
        String actual = Driver.getDriver().getTitle();
      //  System.out.println("actual = " + actual);
         String expected = "Files - Trycloud QA";

       BrowserUtils.verifyTitle(expected);

    }


}
