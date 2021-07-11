package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/features" }, // feature folder path
		glue = { "steps", "hooks" }, // step definition, hooks folder name
		tags = { "@PlaceValidationE2E" },
//		tags = {"@TestFile1 or @TestFile2 or @TestFile3"}, // to run multiple feature files with different tags
		strict = true,
		// dryRun = true,//to check feature vs step definition mapping is correct
		monochrome = true, // to see console output in a clean manner
		plugin = { "pretty", "html:target/cucumberReports", "json:target/cucumberReports.json",
				"de.monochromata.cucumber.report.PrettyReports:target",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				})

public class TestRunner extends AbstractTestNGCucumberTests {

}
