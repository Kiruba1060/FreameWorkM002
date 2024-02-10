
package genericLibrary;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import objectRepositores.HomePage;
import objectRepositores.Loginpage;

//import org.testng.annotations.BeforeSuite;

public class BaseClass extends WebDriverUitilityMethods{
	public WebDriver driver;
	public ExtentReports Report;
	public ExtentTest test;
	@BeforeSuite
	public void BeforeSutie() {
		Report=new ExtentReports("./Reports/"+getTime()+".html");
		System.out.println("Befor Suite");
	}
	
	@BeforeTest
	public void BeforeTest() {
		
		System.out.println("Befor Test");
	}
	@BeforeClass
	public void BeforClass()throws IOException {
		
		String url=FileUtility.getproperty("url");
		String browser=FileUtility.getproperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		else
			driver=new ChromeDriver();
		driver.manage().window().maximize();
		iniObject(driver);
		driver.get(url);
		System.out.println("Befor class");
	}
	
	@BeforeMethod
	public void BeforeMethod(Method methodName) throws IOException {
		String name=methodName.getName();
		test=Report.startTest(name);
		
		HomePage homepage=new HomePage(driver);
		Loginpage loginpage=new Loginpage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.getLoginpage().click();
		loginpage.getEmail().sendKeys(FileUtility.getproperty("email"));
		loginpage.getPassword().sendKeys(FileUtility.getproperty("password"));
		loginpage.getRememberMe().click();
		loginpage.getLoginbutton().click();
		System.out.println("Befor Method");
	}
	@AfterMethod
	public void AfterMethod() {
		HomePage homepage=new HomePage(driver);
		homepage.getLogoutlink().click(); 
		System.out.println("After Class");
	}
	
	@AfterClass
	
	public void AfterClass() {
		driver.quit();
		System.out.println("After Class");
	}
	
    @AfterTest
	public void AfterTest() {
    	Report.endTest(test);
		System.out.println("After Test");
    }
    @AfterSuite
 
    public void AfterSuite() {
    	Report.flush();
	System.out.println("After Suite");
    }


}
