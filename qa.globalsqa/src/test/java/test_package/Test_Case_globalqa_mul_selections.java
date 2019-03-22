package test_package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import main_package.Base_Utils;
import main_package.Test_case_Listner;
import test_Pages.Test_global_qa;
@Listeners(Test_case_Listner.class)
public class Test_Case_globalqa_mul_selections extends Base_Utils {

	public Test_Case_globalqa_mul_selections() throws IOException {
		super();
		
	}
 static Test_global_qa TGQA;
    static Actions act;
	
	@BeforeTest
	public static void launch_up() {
		Browser();		
	}
	
	@Test(enabled=true)
	public  void Test_multiple_selection_1() throws InterruptedException, IOException {
		
		TGQA= new Test_global_qa();
		//driver.switchTo().frame(TGQA.frame_for_images);
		driver.findElement(By.xpath("//span[contains(text(),'Select Elements') and @class='link_span']/..")).click();
	
		
   
   
	  act = new  Actions(driver);
	  act.keyDown(Keys.CONTROL).perform();
	
		TGQA.for_multiple_selection("Item 2");
		TGQA.for_multiple_selection("Item 4");
		TGQA.for_multiple_selection("Item 6");
	
		act.keyUp(Keys.CONTROL).perform();
	
	}
	@Test(enabled=true)
	public  void Test_multiple_selection_2() throws InterruptedException, IOException {
		TGQA= new Test_global_qa();
		
		   //driver.switchTo().frame(TGQA.frame_for_images);
		   
			  act = new  Actions(driver);
			  act.keyDown(Keys.CONTROL).perform();
				TGQA.for_multiple_selection("Item 2");
				TGQA.for_multiple_selection("Item 3");
				TGQA.for_multiple_selection("Item 4");
				TGQA.for_multiple_selection("Item 5");
				TGQA.for_multiple_selection("Item 6");
				TGQA.for_multiple_selection("Item 7");
				
				act.keyUp(Keys.CONTROL).perform();
		
	}
	
	@Test
	public void drawbox_to_select_elements() throws IOException {
		
		TGQA= new Test_global_qa();
		driver.findElement(By.xpath("//span[contains(text(),'Select Elements') and @class='link_span']/..")).click();
		act = new  Actions(driver);
		driver.switchTo().frame(TGQA.frame_for_images);
		act.clickAndHold(TGQA.Item2).moveToElement(TGQA.Item4).perform();
		driver.switchTo().defaultContent();
	}
	
}
