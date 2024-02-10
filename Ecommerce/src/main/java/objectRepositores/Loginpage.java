package objectRepositores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement email;
	@FindBy(id = "Password")
	private WebElement Password;
	@FindBy(id = "RememberMe")
	private WebElement RememberMe;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;
	@FindBy(xpath = "//a[.='Forgot password?']")
	private WebElement Fogot_password;
	
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement Register;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getRememberMe() {
		return RememberMe;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getFogot_password() {
		return Fogot_password;
	}

	public WebElement getRegister() {
		return Register;
	}
	
	
	

}
