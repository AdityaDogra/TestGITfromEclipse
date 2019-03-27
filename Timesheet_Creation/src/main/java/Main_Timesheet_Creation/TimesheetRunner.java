package Main_Timesheet_Creation;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "G:\\Selenium Projects\\Timesheet_Creation\\src\\test\\java\\Feature\\FillTime.feature", 
		glue = {"stepdefinition"}, 
		plugin = { "pretty", "html:test-output", "json:json_output/cucumber.json",
				"junit:junit_xml/cucumber.xml","rerun:target/rerun.txt" ,"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"}, 
		strict = true,
		dryRun = false )

public class TimesheetRunner {
	 @AfterClass
	 public static void writeExtentReport() throws IOException {
	 Reporter.loadXMLConfig(new File("G:\\Selenium Projects\\Git Repos\\test_cucumber\\src\\main\\java\\test_cucumber\\test_cucumber\\Extent-config.xml") );
	 Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
     Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
     Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
     Reporter.setSystemInfo("Selenium", "3.7.0");
     Reporter.setSystemInfo("Maven", "3.5.2");
     Reporter.setSystemInfo("Java Version", "1.8.0_151");
	 
	 }
}
