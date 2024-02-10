package objectRepositores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookpage {
	
	public Bookpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(className = "page-title")
	private  WebElement Bookpagetitle;
	@FindBy(id = "products-orderby")
	private WebElement SortDropDown;
	@FindBy(id = "products-pagesize")
	private WebElement DisplaypageDropdown;
	public WebElement getBookpagetitle() {
		return Bookpagetitle;
	}
	public WebElement getSortDropDown() {
		return SortDropDown;
	}
	public WebElement getDisplaypageDropdown() {
		return DisplaypageDropdown;
	}

}
