package com.facebook.stepDef;

import org.openqa.selenium.support.ui.Select;

import com.facebook.pageObject.AccountPage;
import com.facebook.pageObject.BasePage;
import com.facebook.pageObject.CustomerPage;
import com.facebook.pageObject.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class CustomerFunctionalityStepDef extends BasePage{
	
	LoginPage loginPage;
	CustomerPage customerPage;
	AccountPage accountPage;
	
	
	@Given("User Navigate to XYZ Bank Home Page")
	public void user_navigate_to_xyz_bank_home_page() {
	   driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
	}

	@When("User Click On Customer Login Button")
	public void user_click_on_customer_login_button() {
		loginPage=new LoginPage();
		customerPage=new CustomerPage();
		accountPage=new AccountPage();
		String actualResult= loginPage.xyzText.getText();
		Assert.assertEquals("XYZ Bank", actualResult);
		
		loginPage.customerLoginButton.click();
		
	}

	@Then("Customer Verify the XYZ text")
	public void customer_verify_the_xyz_text() {
		String actualResult= customerPage.xyzText.getText();
		Assert.assertEquals("XYZ Bank", actualResult);
	}

	@Then("Select First User form the Your Name Drop Down")
	public void select_first_user_form_the_your_name_drop_down() {
		Select customerName=new Select(customerPage.yourNameDropDown);
		customerName.selectByVisibleText("Hermoine Granger");
	}

	@Then("User Click On Login Button")
	public void user_click_on_login_button() {
		customerPage.loginButton.click();
	}

	@Then("User Verify the Default Account Numnber")
	public void user_verify_the_default_account_numnber() {
		String actualResult= accountPage.accountNumberText.getTagName();
		System.out.println("Actual Result: "+actualResult);
		Assert.assertEquals("1001", actualResult);
		
		
	}

	@Then("User Click on Deposite button")
	public void user_click_on_deposite_button() {
		accountPage.depositButton.click();
	}

	@Then("User Click on Withdrawl button")
	public void user_click_on_withdrawl_button() {
		accountPage.withdrawButton.click();
	}

	@Then("User Click on Transction button")
	public void user_click_on_transction_button() {
		
		accountPage.transactionButton.click();
	    
	}



	
	
	
	

}
