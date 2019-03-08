package test_cucumber.test_cucumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.runner.JUnitCore;

public class BaseUtil {

	public void launchbrowser() {
		
		System.out.println("the browser is launched and navigatred to URL");
		
		
	}
	public void readfailedfile() throws IOException {
		
		File fs= new File("G:\\Selenium Projects\\test_cucumber\\target\\rerun.txt");
		String sa = FileUtils.readFileToString(fs);
		
	
	}
}
