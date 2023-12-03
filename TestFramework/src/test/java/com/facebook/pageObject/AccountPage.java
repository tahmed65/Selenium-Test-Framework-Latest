package com.facebook.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends BasePage{
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[1]")
	public WebElement transactionButton;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[2]")
	public WebElement depositButton;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[3]/button[3]")
	public WebElement withdrawButton;
	
	
	@FindBy(xpath="/html/body/div/div/div[1]/button[1]")
	public WebElement homeButton;
	
	@FindBy(xpath="/html/body/div/div/div[1]/button[2]")
	public WebElement logoutButton;
	
	@FindBy(name="accountSelect")
	public WebElement accountDropDown;
	
	@FindBy(name="/html/body/div/div/div[2]/div/div[2]")
	public WebElement accountNumberText;
	
	

}
