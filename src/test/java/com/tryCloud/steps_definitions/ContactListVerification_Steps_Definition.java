package com.tryCloud.steps_definitions;

import com.tryCloud.pages.ContactListPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.bouncycastle.cert.ocsp.jcajce.JcaBasicOCSPRespBuilder;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactListVerification_Steps_Definition {
    ContactListPage contactListPage = new ContactListPage();

    @When("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        // no actions

    }
    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        contactListPage.contactModule.click();

    }
    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list(List<String> listOfExpectedNames) {

        List<String> listOfActualNames = new ArrayList<>();

        for (WebElement eachElement : contactListPage.listOfContact){
            listOfActualNames.add(eachElement.getText());

        }

        Assert.assertEquals("Not MATCHED",listOfExpectedNames,listOfActualNames);

    }





}
