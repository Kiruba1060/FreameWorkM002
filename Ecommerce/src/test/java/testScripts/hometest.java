package testScripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import objectRepositores.HomePage;

public class hometest extends BaseClass{
	
	@Test
	public void homepage_002() throws InterruptedException {
		HomePage homepage=new HomePage(driver);
		
		scrollIntoView(driver, homepage.getLaptopimg(),true);
		Thread.sleep(5000);
		scrollIntoView(driver, homepage.getLaptopimg(),false);
			}
    @Test
    public void homepage_003() {
    	HomePage homepage=new HomePage(driver);	
    	homepage.getSearchbutton().click();
    	acceptAlert(driver);
    }
}
