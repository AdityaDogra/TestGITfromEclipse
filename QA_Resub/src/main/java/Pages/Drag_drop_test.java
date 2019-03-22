package Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import QA.Resubmission.trades.QA_Resub.Base_Util;

public class Drag_drop_test extends Base_Util {

	public static Actions act;
	
	@FindBy(xpath="//div[@id='droppable']")
	public static WebElement Destination;


public Drag_drop_test() throws IOException{
	
	PageFactory.initElements(driver, this);
	
}

	


	public static void Do_Drag_Drop(String string, WebElement destination2) throws InterruptedException {
	
		Thread.sleep(5000);
		List<WebElement> iframes= driver.findElements(By.xpath("//div[@class='container startNow']//iframe"));
		System.out.println(iframes.size());
		for(WebElement a: iframes) {
			
			System.out.println(a.getAttribute("class"));
			
			
		}
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//List<WebElement> list1=driver.findElements(By.xpath("//ul[@id='gallery']/li"));
	
	//for (WebElement a: list1) {
		
		//System.out.println(a.getText());
		
		
		
		//	}
		
		
	//}
	 
	
}

	}


