package paylink.cukes;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/Regression/Support.feature"},
        monochrome = true,
        tags = "@SUPPORT",
        glue = {"paylink"},
        plugin = {
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "html:reports/webapp/index.html",
                "json:reports/webapp/cucumber.json",
//                "cap.utilities.CustomGherkinStepListener"
        })

public class DemoWebCukes extends AbstractTestNGCucumberTests {

}
