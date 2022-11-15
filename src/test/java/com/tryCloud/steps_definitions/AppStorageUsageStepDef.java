package com.tryCloud.steps_definitions;

import com.tryCloud.pages.AppStorageUsagePage;
import com.tryCloud.pages.BasePageLogin;
import com.tryCloud.utilities.ConfigurationReader;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;

public class AppStorageUsageStepDef {
    AppStorageUsagePage appStorageUsagePage = new AppStorageUsagePage();
WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
WebElement element;
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {

        System.out.println("storage = " + appStorageUsagePage.userChecksCurrentStorageUsage.getText());
    }
    @When("user  uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() throws InterruptedException {
    appStorageUsagePage.clickFileButton.click();
    appStorageUsagePage.userUploadsFile.sendKeys("C:/Users/kylys/OneDrive/Desktop/1._SDLC__Agile__STLC.pdf");
        wait.until(ExpectedConditions.visibilityOfAllElements(appStorageUsagePage.waitTillLoaded));
    }
    @When("user refresh the page")
    public void user_refresh_the_page() throws InterruptedException {
        Thread.sleep(3000);
    Driver.getDriver().navigate().refresh();
    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {
        String act = appStorageUsagePage.userSeeStorageIncreased.getText();
        String exp = appStorageUsagePage.userChecksCurrentStorageUsage.getText();
        int actual = Integer.parseInt(String.valueOf(act.charAt(0)));
        int expected = Integer.parseInt(String.valueOf(exp.charAt(0)));
        System.out.println("actual = " + actual);
        System.out.println("expected = " + expected);
        Assert.assertTrue(actual > expected);
    }
}
