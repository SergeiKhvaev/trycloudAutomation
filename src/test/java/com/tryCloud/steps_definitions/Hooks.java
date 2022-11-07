package com.tryCloud.steps_definitions;

import com.tryCloud.utilities.BrowserUtils;
import com.tryCloud.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @After
// use @After from io cucumber, not from junit (because we do not have any code or test method in running class), need here only controlling after (post-condition) scenario
    public void tearDownScenario(Scenario scenario) {
        // we will implement taking screenshot in this method


        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES); // make downcasting of our driver to TakeScreenshot intarface to reach getScreenshotAs(OutputType.BYTES)
            scenario.attach(screenshot, "image/png", scenario.getName());

        }
        BrowserUtils.sleep(1);
        Driver.closeDriver();


    }

}
