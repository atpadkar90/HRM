package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.UtilsClass;

public class RegisterPage extends BaseClass{
	
	@FindBy(name="firstName")
	private WebElement fname;
	
	@FindBy(name="lastName")
	private WebElement lname;
	
	@FindBy(name="phone")
	private WebElement Phone;
	
	
	@FindBy(name="userName")
	private WebElement uname;
	
	@FindBy(name="address1")
	private WebElement address;
	
	@FindBy(name="city")
	private WebElement City;
	
	@FindBy(name="state")
	private WebElement State;
	
	@FindBy(name="postalCode")
	private WebElement pcode;
	
	@FindBy(name="email")
	private WebElement Email;

	@FindBy(name="password")
	private WebElement Password;

	@FindBy(name="confirmPassword")
	private WebElement cpassword;

	@FindBy(xpath="//input[@name='submit']")
	private WebElement submit;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void contactInformation(String name,String Lname,String phoneno,String emailid)
	{
		UtilsClass.sendKey(fname, name);
		UtilsClass.sendKey(lname, Lname);
		UtilsClass.sendKey(Phone, phoneno);
		UtilsClass.sendKey(uname, emailid);
		
	}
	
	public void mailingInformation(String Address,String city,String state,String Pcode)
	{
		UtilsClass.sendKey(address, Address);
		UtilsClass.sendKey(City, city);
		UtilsClass.sendKey(State, state);
		UtilsClass.sendKey(pcode, Pcode);
	}
	
	public void  userInformation(String email,String pass,String confirmPassword)
	{
		UtilsClass.sendKey(Email, email);
		UtilsClass.sendKey(Password, pass);
		UtilsClass.sendKey(cpassword, confirmPassword);
	}
	
	public void clickOnButton()
	{
		UtilsClass.clickOnElement(submit);
		
			
	}
	
	
}
