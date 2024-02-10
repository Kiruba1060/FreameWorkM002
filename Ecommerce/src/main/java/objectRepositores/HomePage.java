package objectRepositores;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[.='Register']")
	private WebElement registerLink;
	
	@FindBy(partialLinkText = "Log in")
	private WebElement Loginpage;
	
	@FindBy(partialLinkText = "Log out")
	private WebElement Logoutlink;
	@FindBy(id = "small-searchterms")
	private WebElement searchTextbox;
	@FindBy(className = "search-box-button")
	private WebElement Searchbutton;
	@FindBy(linkText = "Books")
	private WebElement Bookpage;
	@FindBy(linkText = "Computers")
	private WebElement Computerpage;
	@FindBy(linkText = "Electronics")
	private WebElement Electronicspage;
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement APPArels_shoespage;
	@FindBy(linkText = "Digital downloads")
	private WebElement DigitalDownloadpage;
	@FindBy(linkText = "Jewelry")
	private WebElement Jewelry;
	

	@FindBy(linkText = "Gift Cards")
	private WebElement GiftCard;
	
	@FindBy(xpath = "//div[@class='picture']//..//..//a[.='Build your own expensive computer']")
	private WebElement Laptopimg;




	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginpage() {
		return Loginpage;
	}

	public WebElement getLogoutlink() {
		return Logoutlink;
	}

	public WebElement getBookpage() {
		return Bookpage;
	}

	public WebElement getSearchTextbox() {
		return searchTextbox;
	}

	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	public WebElement getComputerpage() {
		return Computerpage;
	}

	public WebElement getElectronicspage() {
		return Electronicspage;
	}

	public WebElement getAPPArels_shoespage() {
		return APPArels_shoespage;
	}

	public WebElement getDigitalDownloadpage() {
		return DigitalDownloadpage;
	}

	public WebElement getJewelry() {
		return Jewelry;
	}

	public WebElement getGiftCard() {
		return GiftCard;
	}
	public WebElement getLaptopimg() {
		return Laptopimg;
	}
	
}
