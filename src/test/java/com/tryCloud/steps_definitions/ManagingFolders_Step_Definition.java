package com.tryCloud.steps_definitions;

import com.tryCloud.pages.FoldersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;

public class ManagingFolders_Step_Definition {
FoldersPage foldersPage = new FoldersPage();

    @When("user clicks files")
    public void user_clicks_files() {
        foldersPage.filesBox.click();






    }

    @Then("user  creates  a new folder")
    public void userCreatesANewFolder() {
        foldersPage.addFileBtn.click();
        foldersPage.newFolderInput.sendKeys("New Folder Uploaded"+Keys.ENTER);
    }
}

    

