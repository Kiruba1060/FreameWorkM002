package objectRepositores;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "gender-male")
	private WebElement MaleRadiobutton;
	@FindBy(id = "gender-female")
	private WebElement FemaleRadiobutton;
	@FindBy(id = "FirstName")
	private  WebElement FirstName;
	@FindBy(id = "LastName")
	private WebElement LastName;
	@FindBy(id = "Email")
	private WebElement Email;
	@FindBy(id = "Password")
	private WebElement Password;
	@FindBy(id = "ConfirmPassword")
	private WebElement ConfirmPassword;
	@FindBy(id = "register-button")
	private WebElement registerbutton;
	public WebElement getMaleRadiobutton() {
		return MaleRadiobutton;
	}
	public WebElement getFemaleRadiobutton() {
		return FemaleRadiobutton;
	}
	public WebElement getFirstName() {
		return FirstName;
	}
	public WebElement getLastName() {
		return LastName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	public WebElement getRegisterbutton() {
		return registerbutton;
	}
	
	

}
