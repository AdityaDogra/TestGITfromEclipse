package QA.Resubmission.trades.QA_Resub;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base_Util {

	public static Properties prop;
	
	public static WebDriver driver;
	
	public Base_Util() throws IOException {
		 prop = new Properties();
		FileInputStream fs= new FileInputStream("G:\\Selenium Projects\\QA_Resub\\src\\main\\java\\QA\\Resubmission\\trades\\QA_Resub\\Config.properties");
		prop.load(fs);
	}
	
	
	public static void Browser() {
		
		System.setProperty("webdriver.chrome.driver",prop.getProperty("pathofchromeexefile") );
		ChromeOptions options= new ChromeOptions();
		options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT);
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url_of_google"));
		
	}
	
}
