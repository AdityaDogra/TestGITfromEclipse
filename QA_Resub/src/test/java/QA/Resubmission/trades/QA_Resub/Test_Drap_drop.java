package QA.Resubmission.trades.QA_Resub;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Drag_drop_test;
import Pages.POM_Google_Home;

public class Test_Drap_drop extends Base_Util{
  // public static Drag_drop_test Drag_drop;
	public static POM_Google_Home GH;
	public Test_Drap_drop() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeTest
	public static void pre_actions(){

		Base_Util.Browser();
	}
	
	@Test
	public static void test_global_qa() throws IOException{
		GH= new POM_Google_Home();
		//GH.search_box.sendKeys("drag and drop testing site",Keys.TAB,Keys.TAB,Keys.ENTER);
		GH.search_box.sendKeys("drag and drop testing site");
		GH.search_btn.submit();
		//GH.search_btn.click();
		//Do_Actions("//div[@class='FPdoLc VlcLAe']/center/input[@value='Google Search']");
		driver.findElement(By.xpath("//cite[contains(text(),'www.globalsqa.com')]/ancestor::a")).click();
	}
	
	@Test
	public static void test_drag() throws IOException, InterruptedException {
		Thread.sleep(10000);
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions act= new Actions(driver);
		act.dragAndDrop(driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']")),driver.findElement(By.xpath("//div[@id='//img[@alt='trash']']"))).perform();;
		
		
		
	}
	
	
}
