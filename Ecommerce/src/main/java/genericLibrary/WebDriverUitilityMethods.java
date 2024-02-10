package genericLibrary;

import java.io.File;
import java.time.LocalDateTime;
import java.util.Set;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUitilityMethods {
	
	static Select selectoption;
	static JavascriptExecutor jse;
	static Actions actions;
	public static void selectOptionByIndex(WebElement dropdown,int index) {
		selectoption=new Select(dropdown);
		selectoption.selectByIndex(index);
	}
	
	public static void selectOptionByValue(WebElement dropdown,String Value) {
		selectoption=new Select(dropdown);
		selectoption.selectByValue(Value);
	}
	public  static void selectOptionByVisibleText(WebElement dropdown,String Text) {
		selectoption=new Select(dropdown);
		selectoption.selectByVisibleText(Text);
	}
	public static String getTime() {
		String getLocalTimeDate=LocalDateTime.now().toString().replace("-", "_").replace(":", "_");
		return getLocalTimeDate;
	}

	public static String getdriverScreenshot(WebDriver driver) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		String imagepath="./ScreenShots/"+getTime()+".png";
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File prem=new File(imagepath);
		
		try {
			FileHandler.copy(temp, prem);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();	
		}
		return "."+imagepath;
		
    }
	
	public static  String getWebElementScreenShot(WebElement element) {
		String imagepath="./ScreenShots/"+getTime()+".png";
		File temp2=element.getScreenshotAs(OutputType.FILE);
		File perm2=new File(imagepath);
		try {
			FileHandler.copy(temp2, perm2);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "."+imagepath;
	}
	
	public void getWindoesHandle(WebDriver driver,String Windowgiven) {
		
	 Set<String> allwindow=driver.getWindowHandles();
		for(String window:allwindow) {
			if(driver.getTitle().contains(Windowgiven)) {
				break ;
			}
		}
	}

	
	public static void iniObject(WebDriver driver) {
		jse=(JavascriptExecutor)driver;
		actions=new Actions(driver);
	
	}
	
	public static void scrollWindowBy(WebDriver driver,int x,int y) {
		jse.executeScript("window.scrollBy("+x+","+y+")");
			}
	public static void scrollWindowTo(WebDriver driver,int x,int y) {
		jse.executeScript("window.scrollTo("+x+","+y+")");
	}
	public static void scrollIntoView(WebDriver driver,WebElement element,boolean elementPosition) {
		jse.executeScript("argument[0].scrollIntoView("+elementPosition+")", element);
	}
	

	public static void handleDisableOrHiddentButton(WebElement element) {
		jse.executeScript("arguments[0].click()", element);
	}
	public static void handleHiddenOrDisablesTextField(WebElement element,String value) {
		jse.executeScript("arguments[0].value='"+value+"'",element);
	}
	public static void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	 public static void movetoElement(WebElement element) {
		 actions.moveToElement(element).perform();;
	 }
	 
	 public static void click(WebElement element) {
		 actions.click(element).perform();
	 }
	 public static void contextClick(WebElement element) {
		 actions.contextClick(element).perform();
	 }
	 public static void DoubleClick(WebElement element) {
		 actions.doubleClick(element).perform();
	 }
	 public static void ClickandHold(WebElement element) {
		 actions.clickAndHold(element).perform();
	 }
	 public static void dragAndDrop(WebElement search,WebElement element) {
		 actions.dragAndDrop(search, element).perform();
	 }
	 public static void refresh(WebElement element) {
		 actions.release(element).perform();
	 }
	 public static void scrollbyAmount(int x,int y) {
		 actions.scrollByAmount(x, y).perform();
	 }
	 public static void scrollToElement(WebElement element) {
		 actions.scrollToElement(element);
	 }
	 public static void scrollfromorgin(ScrollOrigin orgin,int x,int y) {
		 actions.scrollFromOrigin(orgin, x, y);
	 }
}
