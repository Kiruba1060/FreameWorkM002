package Priority;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

@Test
public class A12 {
	public void park()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.quit();
		Reporter.log("Hi" ,true);
		
	
	}
	

}
