package test_cucumber.test_cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="G:/Selenium Projects/test_cucumber/src/test/java/test_cucumber/test_cucumber/testcoca.feature:16:36",
		glue= {"test_cucumber.test_cucumber"}
		,format = { "pretty", "html:test-output", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml","rerun:target/rerun.txt" }, 
				monochrome=true,
		strict = true,
		dryRun = false )
public class failedrunner {

}
