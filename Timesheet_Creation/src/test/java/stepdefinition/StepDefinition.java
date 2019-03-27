package stepdefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Main_Timesheet_Creation.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinition extends BaseUtil {
	 ExtentReports extent;
	    ExtentTest test;
	    Scenario sc;
	public StepDefinition() throws IOException {
		super();
	}
	@Before
	 public void init()
    {
      // this.sc = sc;
		// extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentScreenshot.html", true);
    }
	@After
	public void cleanup(Scenario sc) throws IOException {
		
		
		if(sc.isFailed()) {
		takescreen(sc);
			
		}
			else {
				System.out.println("All cleanup is done and this will trigger after each scenario");
				
			}
	
	}

	@When("^the time is missing$")
	public void the_time_is_missing() throws Throwable {
	    BaseUtil.Browserlaunch();
	    driver.findElement(By.xpath("//a[@title='YASH Infogram']")).click();
	    takescreen(sc);
	 //  Assert.assertEquals(true, false);
	    BaseUtil.switchwindows();
	    BaseUtil.waitforelement(driver,"//div[@data-chipid='info-timeSheet']");
	    driver.findElement(By.xpath("//span[@class='tsIconSlimArrowLeft globalIconFont1Support tsWeekChangerIcon']")).click();
	  // driver.findElement(By.xpath("//div[@id='__tile4']")).click();
	}

	@Then("^verify the days for which time is missing$")
	public void verify_the_days_for_which_time_is_missing() throws Throwable {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Assert.assertEquals(true, false);
	  driver.findElement(By.xpath("//button[@title='Previous Time Sheet']")).click();
	  BaseUtil.daysfortimemissing();
	 
	// String Day= driver.findElement(By.xpath("//div[@class='tsCalendarContainer']/div[2]/div/div[1]")).getAttribute("aria-label");
	 // String Time=driver.findElement(By.xpath("//div[@class='tsCalendarContainer']/div[2]/div/div[1]/div/div[1]/div[2]/input")).getAttribute("value");
	  //System.out.println("the day is --->"+Day+"   The time for  the day is--->"+Time);
	}

	@Then("^fill the missing time in the timesheet$")
	public void fill_the_missing_time_in_the_timesheet() throws Throwable {
	  System.out.println("Please fill the time");
	    
	}

	@Then("^verify the total working hours of the week$")
	public void verify_the_total_working_hours_of_the_week() throws Throwable {
		 System.out.println("will verify later");
	
	}
	
	@When("^Total is there$")
	public void total_is_there() throws Throwable {
	   String Textis=driver.findElement(By.xpath("//dl[@class='tsSummaryTotal']/dt/span")).getText();
	   Assert.assertEquals("Total", Textis);
	}

	@Then("^how many toatal hours are there$")
	public void how_many_toatal_hours_are_there() throws Throwable {
		String Tiemis=driver.findElement(By.xpath("//dd[@id='9__summaryTotal']")).getText();
		Assert.assertEquals("45:00", Tiemis);
	}

	@And("^show us the hours$")
	public void show_us_the_hours() throws Throwable {
		String Tiemis=driver.findElement(By.xpath("//dd[@id='9__summaryTotal']")).getText();
	   System.out.println("The Time is ---->"+Tiemis);
	}

	@When("^the timesheet is there$")
	public void the_timesheet_is_there() throws Throwable {
	    System.out.println("Yes the Time sheet is there");
	}

	@Then("^verify what statuc is there$")
	public void verify_what_statuc_is_there() throws Throwable {
		String statusis=driver.findElement(By.xpath("//span[@class='tsStatusLabelText']")).getText();
		Assert.assertEquals("Status", statusis);
	}

	@And("^tell us the status$")
	public void tell_us_the_status() throws Throwable {
		String statusis=driver.findElement(By.xpath("//span[@class='tsStatusLabelText']")).getText();
		System.out.println("The status is----> "+statusis);
	}
	
}
