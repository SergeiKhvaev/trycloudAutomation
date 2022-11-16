package com.tryCloud.steps_definitions;

import com.tryCloud.pages.AppStorageUsagePage;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppStorageUsageStepDef {
    AppStorageUsagePage appStorageUsagePage = new AppStorageUsagePage();
    String amountOfMemoryUsedBeforeUploading;
    String amountOfMemoryUsedAfterUploading;
    int newValue;
    int oldValue;
WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
WebElement element;
    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {
        for (WebElement each : appStorageUsagePage.leftSideMenuOptions) {
            if (each.getText().contains("B used")) {
                amountOfMemoryUsedBeforeUploading = each.getText();
                System.out.println(amountOfMemoryUsedBeforeUploading);
                if(amountOfMemoryUsedBeforeUploading.contains(" KB ")){
                    oldValue = (int)Double.parseDouble(amountOfMemoryUsedBeforeUploading.substring(0, amountOfMemoryUsedBeforeUploading.indexOf(" "))) * 1000;
                }else if(amountOfMemoryUsedBeforeUploading.contains(" MB ")){
                    oldValue = (int)Double.parseDouble(amountOfMemoryUsedBeforeUploading.substring(0, amountOfMemoryUsedBeforeUploading.indexOf(" "))) * 1_000_000;
                }else if (amountOfMemoryUsedBeforeUploading.contains(" GB ")){
                    oldValue = (int)Double.parseDouble(amountOfMemoryUsedBeforeUploading.substring(0, amountOfMemoryUsedBeforeUploading.indexOf(" "))) * 1_000_000_000;
                }
            }
        }
        System.out.println("oldValue = " + oldValue);
    }
    @When("user  uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() throws InterruptedException {
        String path = "C:/Users/kylys/OneDrive/Desktop/loginpage.txt";
        //appStorageUsagePage.clickFileButton.click();
        Thread.sleep(5000);
    appStorageUsagePage.userUploadsFile.sendKeys(path);
        wait.until(ExpectedConditions.visibilityOf(appStorageUsagePage.waitTillLoaded));

       // Driver.getDriver().manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    }
    @When("user refresh the page")
    public void user_refresh_the_page()  {
    Driver.getDriver().navigate().refresh();
    }
    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {

        for (WebElement each : appStorageUsagePage.leftSideMenuOptions) {
            if (each.getText().contains("B used")) {
                amountOfMemoryUsedAfterUploading = each.getText();
                System.out.println(amountOfMemoryUsedAfterUploading);
                if(amountOfMemoryUsedAfterUploading.contains(" KB ")){
                    newValue = (int)Double.parseDouble(amountOfMemoryUsedAfterUploading.substring(0, amountOfMemoryUsedAfterUploading.indexOf(" "))) * 1000;
                }else if(amountOfMemoryUsedAfterUploading.contains(" MB ")){
                    newValue = (int)Double.parseDouble(amountOfMemoryUsedAfterUploading.substring(0, amountOfMemoryUsedAfterUploading.indexOf(" "))) * 1_000_000;
                }else if (amountOfMemoryUsedAfterUploading.contains(" GB ")){
                    newValue = (int)Double.parseDouble(amountOfMemoryUsedAfterUploading.substring(0, amountOfMemoryUsedAfterUploading.indexOf(" "))) * 1_000_000_000;
                }
            }
        }
        System.out.println("newValue = " + newValue);
        Assert.assertTrue(oldValue < newValue);
    }
}
