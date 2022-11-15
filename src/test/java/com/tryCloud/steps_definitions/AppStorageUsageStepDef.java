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
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppStorageUsageStepDef {
    AppStorageUsagePage appStorageUsagePage = new AppStorageUsagePage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        System.out.println("storage = " + appStorageUsagePage.userChecksCurrentStorageUsage.getText());
    }
    @When("user  uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() throws InterruptedException {

    appStorageUsagePage.clickFileButton.click();
        Thread.sleep(3000);
    appStorageUsagePage.userUploadsFile.sendKeys("C:/Users/kylys/OneDrive/Desktop/GitToken.txt");
    }
    @When("user refresh the page")
    public void user_refresh_the_page() {
    Driver.getDriver().navigate().refresh();
    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {
        String act = appStorageUsagePage.userSeeStorageIncreased.getText();
        String exp = appStorageUsagePage.userChecksCurrentStorageUsage.getText();
        int actual = Integer.parseInt(String.valueOf(act.charAt(0)));
        int expected = Integer.parseInt(String.valueOf(exp.charAt(0)));

        Assert.assertTrue(actual <= expected);


    }
}
