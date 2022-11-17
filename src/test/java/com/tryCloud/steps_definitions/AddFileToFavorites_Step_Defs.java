package com.tryCloud.steps_definitions;

import com.tryCloud.pages.AddFileToFavoritesPage;
import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddFileToFavorites_Step_Defs {

    AddFileToFavoritesPage addFileToFavoritesPage = new AddFileToFavoritesPage();


    @When("the user clicks action-icon from any file on te page")
    public void the_user_clicks_action_icon_from_any_file_on_te_page() {
        // addFileToFavoritesPage.chosenFile.click();
        BrowserUtils.sleep(5);

        addFileToFavoritesPage.threeDots("Talk").click();
    }

    @And("user click the Favorites sub-module on the left side")
    public void userClickTheFavoritesSubModuleOnTheLeftSide() {
        addFileToFavoritesPage.addToFavoritesBtn.click();

    }



    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        Assert.assertEquals(addFileToFavoritesPage.starSigh.getAttribute("class"), "icon icon-starred");

    }
}