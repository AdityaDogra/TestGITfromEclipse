package Main_Timesheet_Creation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cucumber.listener.Reporter;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.api.Scenario;

public class BaseUtil {
	public static Properties file;
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public BaseUtil() throws IOException {
		file = new Properties();
		FileInputStream keyfile = new FileInputStream(
				"G:\\Selenium Projects\\Timesheet_Creation\\src\\main\\java\\Main_Timesheet_Creation\\Config.properties");
		file.load(keyfile);
	}

	public static void Browserlaunch() {

		System.setProperty("webdriver.chrome.driver", file.getProperty("pathofchromeexefile"));
		driver = new ChromeDriver();
		driver.get(file.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

	public static void switchwindows() {
		ArrayList<String> win = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(win.size());
		for (String a : win) {
			System.out.println("the window is---> " + a);
		}
		driver.switchTo().window(win.get(1));
		System.out.println("the window is switched to--->" + win.get(1));
	}

	public static void waitforelement(WebDriver driver, String path) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(path))).click();

	}

	public static Map<String, String> daysfortimemissing() {
		//driver.findElement(By.xpath("//div[@class='tsCalendarContainer']/div[2]/div")).getAttribute("aria-label");
		Map<String,String> daystime=new HashMap<String,String>();
	   
		for (int x=1;x<=5;x++) {
			//String DayfromKey=driver.findElement(By.xpath("//div[@class='tsCalendarContainer']/div[2]/div["+x+"]/div")).getAttribute("aria-label");
			String DayfromKey=driver.findElement(By.xpath("//div[@class='tsCalendarContainer']/div/div["+x+"]/div/span")).getText();
			String timefromkey=driver.findElement(By.xpath("//div[@class='tsCalendarContainer']/div[2]/div["+x+"]/div[1]/div/div[1]/div[2]/input")).getAttribute("value");
		daystime.put(DayfromKey, driver.findElement(By.xpath("//div[@class='tsCalendarContainer']/div[2]/div["+x+"]/div[1]/div/div[1]/div[2]/input")).getAttribute("value"));
		System.out.println("the day is --->"+DayfromKey+"   The time for  the day is--->"+timefromkey);
		
		}return daystime;
		
	
	}
	
	public static void takescreen(Scenario sc) throws IOException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("G:\\Selenium Projects\\Timesheet_Creation\\target\\Screenshots\\"+sc.getName()+".png"));
		//String path_of_screenshot= System.getProperty("user.dir"+sc.getName()+".png");
		Reporter.addScreenCaptureFromPath("G:\\Selenium Projects\\Timesheet_Creation\\target\\Screenshots\\"+sc.getName()+".png");
	}

}
