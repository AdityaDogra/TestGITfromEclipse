package QA.Resubmission.trades.QA_Resub;

import java.io.IOException;

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
public static void test_google_search() throws IOException{
		GH= new POM_Google_Home();
		GH.search_box.sendKeys("drag and drop testing site");
		GH.search_btn.click();
	}
	
}
