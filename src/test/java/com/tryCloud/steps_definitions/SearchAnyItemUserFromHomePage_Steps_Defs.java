package com.tryCloud.steps_definitions;

import com.tryCloud.pages.SearchWindow_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchAnyItemUserFromHomePage_Steps_Defs {
SearchWindow_Page searchWindow_page = new SearchWindow_Page();
    //@Given("user on the dashboard page")
    //public void user_on_the_dashboard_page() {
// already implemented

    //}
    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
        searchWindow_page.magnifyBtn.click();


    }
    @When("users search any existing file or folder or user name")
    public void users_search_any_existing_file_folder_user_name() {
        searchWindow_page.searchBox.sendKeys("Talk");

    }
    @Then("verify the app displays the expected result option")
    public void verify_the_app_displays_the_expected_result_option() {
        searchWindow_page.fileAndFolderSearchVerification("Talk");

    }


}
