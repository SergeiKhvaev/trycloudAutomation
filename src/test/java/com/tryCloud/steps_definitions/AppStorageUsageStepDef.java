package com.tryCloud.steps_definitions;

import com.tryCloud.pages.AppStorageUsagePage;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AppStorageUsageStepDef {
    AppStorageUsagePage appStorageUsagePage = new AppStorageUsagePage();

    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        System.out.println("storage" + appStorageUsagePage.userChecksCurrentStorageUsage.getText());
    }
    @When("user  uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {

    appStorageUsagePage.userUploadsFile.sendKeys("C:/Users/kylys/OneDrive/Desktop/GitToken.txt");
    }
    @When("user refresh the page")
    public void user_refresh_the_page() {
    Driver.getDriver().navigate().refresh();
    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {
        System.out.println("appStorageUsagePage.userSeeStorageIncreased.getText() = " + appStorageUsagePage.userSeeStorageIncreased.getText());
    }
}
