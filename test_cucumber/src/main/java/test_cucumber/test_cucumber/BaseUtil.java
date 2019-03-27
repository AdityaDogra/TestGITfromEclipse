package test_cucumber.test_cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.runner.JUnitCore;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;

public class BaseUtil {

	public void launchbrowser() {
		
		System.out.println("the browser is launched and navigatred to URL");
		
		
	}
	/*public static void takescreen(Scenario sc) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		File screenshot_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_file,
				new File("G:\\Selenium Projects\\Git Repos\\test_cucumber\\target\\Screenshot\\snipname.png"));
		
		if(sc.isFailed()) {
			System.out.println("the screenshot is taken on failure from step defi");
		}
			else {
				System.out.println("All cleanup is done and this will trigger after each scenario");
				
			}
	
	}*/
}
