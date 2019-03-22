package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import QA.Resubmission.trades.QA_Resub.Base_Util;

public class POM_Google_Home extends Base_Util {

	@FindBy(xpath="//input[@class='gLFyf gsfi']")
	 public WebElement search_box;
	
	@FindBy(xpath="//div[@class='FPdoLc VlcLAe']/center/input[@value='Google Search']")
	
	public WebElement search_btn;
	
	 public POM_Google_Home() throws IOException{
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
}


