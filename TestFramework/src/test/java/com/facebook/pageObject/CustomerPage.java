package com.facebook.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPage extends BasePage{
	
	public CustomerPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="userSelect")
	public WebElement yourNameDropDown;
	
	@FindBy(xpath="/html/body/div/div/div[2]/div/form/button")
	public WebElement loginButton;

	@FindBy(xpath="/html/body/div/div/div[1]/strong")
	public WebElement xyzText;
	
}
