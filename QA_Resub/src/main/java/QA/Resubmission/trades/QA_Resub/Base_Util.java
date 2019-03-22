package QA.Resubmission.trades.QA_Resub;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Point;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.internal.collections.Pair;

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
		driver.manage().deleteAllCookies();
		
	}
	 public static int[] Find_cordinates(String Xpath) {
		 WebElement element = driver.findElement(By.xpath(Xpath));
			Point position = element.getLocation();
			int xcordinate=position.getX();
			int ycordinate=position.getY();
			int[] cordinates= {xcordinate,ycordinate};
			System.out.println(cordinates[0]+" "+cordinates[1]);
			//System.out.println(xcordinate+"--- "+ycordinate);
			return cordinates;
			//return new Pair<Integer,Integer>(xcordinate,ycordinate);
		 }
	
	 
}
