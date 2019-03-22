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
public class TestCase_globalqa_drag_drop extends Base_Utils{
	 static Test_global_qa TGQA;
	
public TestCase_globalqa_drag_drop() throws IOException {
		super();
		
	}

static Actions act;
	
	@BeforeTest
	public static void launch_up() {
		Browser();		
	}
	
	@Test
	public static void Test_drag_drop_High_Tatras_3() throws InterruptedException, IOException {
		TGQA= new Test_global_qa();
		
 
   TGQA.image_to_drag_and_drop("High Tatras 3", TGQA.Destination);
		
	}
	@Test
	public static void Test_drag_drop_High_Tatras_2() throws InterruptedException, IOException {
		TGQA= new Test_global_qa();
		
  // driver.switchTo().frame(TGQA.frame_for_images);
   TGQA.image_to_drag_and_drop("High Tatras 2", TGQA.Destination);
		
	}
	@Test
	public static void Test_drag_drop_High_Tatras_4() throws InterruptedException, IOException {
		TGQA= new Test_global_qa();
		
  // driver.switchTo().frame(TGQA.frame_for_images);
   TGQA.image_to_drag_and_drop("High Tatras 4", TGQA.Destination);
		
	}
	@Test
	public static void Test_drag_drop_High_Tatras() throws InterruptedException, IOException {
		TGQA= new Test_global_qa();
		
   driver.switchTo().frame(TGQA.frame_for_images);
   TGQA.image_to_drag_and_drop("High Tatras", TGQA.Destination);
		
	}
	
}
