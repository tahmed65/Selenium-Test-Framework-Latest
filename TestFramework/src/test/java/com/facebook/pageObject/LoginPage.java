package com.facebook.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[1]/button")
	public WebElement customerLoginButton;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[2]/button")
	public WebElement bankManagerLoginButton;
	
	@FindBy(xpath="/html/body/div/div/div[1]/button[1]")
	public WebElement homeButton;
	
	@FindBy(xpath="/html/body/div/div/div[1]/strong")
	public WebElement xyzText;
	
	
	
	
	

}
