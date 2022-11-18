package com.tryCloud.steps_definitions;

import com.tryCloud.pages.DeleteFileFolder_Page;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DeleteFileFolder_Step_Defs {

    DeleteFileFolder_Page deleteFileFolderPage = new DeleteFileFolder_Page();

    @Given("user logins with valid {string} and {string}")
    public void userLoginsWithValidAnd(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        deleteFileFolderPage.login(username, password);

    }

    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String files) {

        deleteFileFolderPage.filesIcon.click();

    }

    @When("user click action-icon  from any file on the page")
    public void user_click_action_icon_from_any_file_on_the_page() {
        deleteFileFolderPage.threeDots("Talk").click();
    }

    @When("user choose the {string} option")
    public void user_choose_the_option(String deleteFile) {
        deleteFileFolderPage.deleteFolder.click();
    }

    @When("the user clicks the {string} sub-module on the left side")
    public void the_user_clicks_the_sub_module_on_the_left_side(String deletedFiles) {
        deleteFileFolderPage.deletedFilesIcon.click();
    }

    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        Assert.assertTrue(deleteFileFolderPage.deletedFile("Talk").isDisplayed());
    }


}
