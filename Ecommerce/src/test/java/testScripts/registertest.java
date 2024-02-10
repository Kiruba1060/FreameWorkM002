package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import genericLibrary.BaseClass;
import genericLibrary.ExcelUtility;
import objectRepositores.HomePage;
import objectRepositores.RegisterPage;

public class registertest extends BaseClass{
	
	@DataProvider(name="registerData")
	public String[][] data()throws EncryptedDocumentException, IOException{
		return ExcelUtility.getRowData("RegisterData");
	}
	
	
	@Test(dataProvider = "registerData")
	public void register_001(String firstname,String LastName,String Email,String Password,String ConfirmPassword) {
		HomePage home=new HomePage(driver);
		RegisterPage reg=new RegisterPage(driver);
		
		home.getLogoutlink().click();
		home.getRegisterLink().click();
		test.log(LogStatus.INFO, "Navigate to Registerpagee");
		reg.getMaleRadiobutton().click();
		test.log(LogStatus.INFO, "Click male radio button");
		reg.getFirstName().sendKeys(firstname);
		test.log(LogStatus.INFO, "Enter First name");
		reg.getLastName().sendKeys(LastName);
		test.log(LogStatus.INFO, "Enter Last name");
		reg.getEmail().sendKeys(Email);
		test.log(LogStatus.INFO, "Enter Email");
		reg.getPassword().sendKeys(Password);
		test.log(LogStatus.INFO, "Enter password");
		reg.getConfirmPassword().sendKeys(ConfirmPassword);
		test.log(LogStatus.INFO, "Enter Confirm password");
		test.log(LogStatus.PASS, "Test script pass");
		
	}


}
