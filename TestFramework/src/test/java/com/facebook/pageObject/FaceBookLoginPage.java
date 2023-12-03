package com.facebook.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage extends BasePage{
	
	//Constructor 
	public FaceBookLoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(linkText="Create new account")
	public WebElement createNewAccountLink;
	
	
	@FindBy(name="firstname")
	public WebElement firstnameFiled;

	
	@FindBy(name="lastname")
	public WebElement lastnameFiled;
	
	@FindBy(name="reg_email__")
	public WebElement emailFiled;
	
	@FindBy(name="reg_email_confirmation__")
	public WebElement emailConfirmationFiled;
	
	@FindBy(name="reg_passwd__")
	public WebElement passwordFiled;
	
	
	@FindBy(name="birthday_month")
	public WebElement birthdayMonthDropDown;
	
	@FindBy(name="birthday_day")
	public WebElement birthdayDayDropDown;
	
	
	@FindBy(name="birthday_year")
	public WebElement birthdayYearDropDown;
	
	@FindBy(xpath="//form/div[1]/div[7]/span/span[2]/label")
	public WebElement maleOptionButton;
	
	@FindBy(xpath="//form/div[1]/div[7]/span/span[1]/label")
	public WebElement femaleOptionButton;
	
	@FindBy(xpath="//form/div[1]/div[7]/span/span[3]/label")
	public WebElement otherOptionButton;
	
	
	
	
	
	
	
	
}
