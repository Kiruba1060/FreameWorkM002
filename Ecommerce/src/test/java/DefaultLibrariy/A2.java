package DefaultLibrariy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class A2 {
	ExtentReports report=new ExtentReports("./Reports/report.html");
	@Test
	public void test001() {
		ExtentTest test=report.startTest("LoginTestScript");
		
		WebDriver driver=new ChromeDriver();
		test.log(LogStatus.INFO, "Browser Launch");
		
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Maximized");
		
		driver.get("https://gaana.com/");
		test.log(LogStatus.INFO, "Navigate to webpage");
		
		
		test.log(LogStatus.PASS, "Test script pass");
		
		report.endTest(test);
		report.flush();
		
		
		
	}
	
	

}
