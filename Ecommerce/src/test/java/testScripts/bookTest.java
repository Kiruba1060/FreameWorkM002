package testScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;
import objectRepositores.Bookpage;
import objectRepositores.HomePage;

public class bookTest extends BaseClass {

	@Test
	public void books_2() {
		HomePage homePage=new HomePage(driver);
		Bookpage bookpage=new Bookpage(driver);
		homePage.getBookpage().click();
		test.log(LogStatus.INFO, "Navigate to Bookpage");
		WebElement sortByDropdrown=bookpage.getSortDropDown();
		
		Select select=new Select(sortByDropdrown);
		
		select.selectByIndex(2);
		test.log(LogStatus.INFO, test.addScreenCapture(getWebElementScreenShot(sortByDropdrown)));
		select.selectByIndex(4);
		test.log(LogStatus.INFO, "Select dropdown2");
		test.log(LogStatus.PASS, "Test script execute");
	}
	@Test
	public void book003() {
		HomePage homePage=new HomePage(driver);
		homePage.getComputerpage().click();
		test.log(LogStatus.INFO, "Navigate to computer page");
		getdriverScreenshot(driver);
		test.log(LogStatus.INFO, "takeScreenShot successfully");
		test.log(LogStatus.FAIL, "Test script Fail");
	}
		
}
