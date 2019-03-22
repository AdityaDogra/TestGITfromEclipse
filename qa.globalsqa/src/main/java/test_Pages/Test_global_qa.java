package test_Pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import main_package.Base_Utils;

public class Test_global_qa extends Base_Utils {
	int i;
	static Actions act;
	@FindBy(xpath = "//div[@id='trash']")
	public WebElement Destination;

	@FindBy(xpath = "//iframe[@class='demo-frame']")
	public  WebElement frame_for_images;
	
	@FindBy(xpath = "//li[text()='Item 1']/../li[2]")
	public   WebElement Item2;
	
	@FindBy(xpath = "//li[text()='Item 1']/../li[4]")
	public   WebElement Item4;
	

	public Test_global_qa() throws IOException {
		PageFactory.initElements(driver, this);

	}

	public void image_to_drag_and_drop(String name_of_image, WebElement destination) {

		List<WebElement> list_of_images = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
		System.out.println("The number of images are-->" + list_of_images.size());
		for (i = 0; i < list_of_images.size(); i++) {

			String[] abc = list_of_images.get(i).getText().split("\n");
			if (abc[0].equals(name_of_image)) {
				System.out.println(list_of_images.get(i).getText());
				act = new Actions(driver);
				act.dragAndDrop(list_of_images.get(i), destination).perform();
			}
		}
	}

	public  WebElement for_multiple_selection(String name_of_the_element_from_list) {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.switchTo().frame(frame_for_images);

		List<WebElement> list_of_elements = driver.findElements(By.xpath("//li[text()='Item 1']/../li"));
		System.out.println("The number of elements in list are-->" + list_of_elements.size());
		WebElement element = null;
		for (WebElement a : list_of_elements) {
System.out.println(a.getText()+"----"+a);
			if (a.getText().equals(name_of_the_element_from_list)) {
				element = a;
System.out.println(a.getText()+"matched"+name_of_the_element_from_list);
a.click();
				driver.switchTo().defaultContent();
break;
			}

		}
		return element;

	}
}
