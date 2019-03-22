package main_package;

import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Utils {

	public static Properties prop;

	public static WebDriver driver;

	public Base_Utils() throws IOException {
		prop = new Properties();
		FileInputStream fs = new FileInputStream(
				"G:\\Selenium Projects\\qa.globalsqa\\src\\main\\java\\main_package\\Config.properties");
		prop.load(fs);
	}

	public static void Browser() {

		System.setProperty("webdriver.chrome.driver", prop.getProperty("pathofchromeexefile"));
		ChromeOptions options = new ChromeOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url_of_globalqa"));
		driver.manage().deleteAllCookies();

	}

	public static int[] Find_cordinates(String Xpath) {
		WebElement element = driver.findElement(By.xpath(Xpath));
		Point position = element.getLocation();
		int xcordinate = position.getX();
		int ycordinate = position.getY();
		int[] cordinates = { xcordinate, ycordinate };
		System.out.println(cordinates[0] + " " + cordinates[1]);
		// System.out.println(xcordinate+"--- "+ycordinate);
		return cordinates;
		// return new Pair<Integer,Integer>(xcordinate,ycordinate);
	}

	public  void screenshot(WebDriver driver, String snipname) throws IOException {

		File screenshot_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot_file,
				new File("G:\\Selenium Projects\\Git Repos\\qa.globalsqa\\target\\Screenshots\\"+snipname+".png"));

	}

}
