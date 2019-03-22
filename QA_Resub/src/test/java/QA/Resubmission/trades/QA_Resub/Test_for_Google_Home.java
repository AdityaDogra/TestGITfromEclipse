package QA.Resubmission.trades.QA_Resub;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.POM_Google_Home;

public class Test_for_Google_Home extends Base_Util {

	public static POM_Google_Home GH;
	public Test_for_Google_Home() throws IOException {
		super();

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
   
	
}
