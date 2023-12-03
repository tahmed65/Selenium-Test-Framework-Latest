package com.facebook.stepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.facebook.pageObject.BasePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MacysAccountCreationStepDef extends BasePage {
	
	
	
	
	@Given("User Navigate to Macys Home Page")
	public void user_navigate_to_macys_home_page() {
	   driver.get("https://www.macys.com/"); 
	}

	@When("User Click On Sign in Button")
	public void user_click_on_sign_in_button() {
	    driver.findElement(By.linkText("Sign In")).click();
	}

	@Then("User Click on Create Account Button")
	public void user_click_on_create_account_button() {
		 driver.findElement(By.linkText("Create account")).click();
		
		
	}

	@Then("User fill Up Fist Name filed")
	public void user_fill_up_fist_name_filed() {
	    driver.findElement(By.name("ca-profile-firstname")).sendKeys("Tom");
	}

	@Then("User fill Up Last Name field")
	public void user_fill_up_last_name_field() {
		driver.findElement(By.name("ca-profile-lastname")).sendKeys("Cat");
	}

	@Then("User Fill Up Email Address Filed")
	public void user_fill_up_email_address_filed() {
		driver.findElement(By.name("email")).sendKeys("Tom.cat@gmail.com");
	}

	@Then("User fill up password filed")
	public void user_fill_up_password_filed() {
		driver.findElement(By.name("password")).sendKeys("Tom2032!");
	}

	@Then("User Select the Birth Month Filed")
	public void user_select_the_birth_month_filed() {
	   Select month=new Select(driver.findElement(By.id("ca-profile-birth-month")));
	   month.selectByVisibleText("May");
	   
	}

	@Then("User Select the Birth Day Filed")
	public void user_select_the_birth_day_filed() {
		Select day=new Select(driver.findElement(By.id("ca-profile-birth-day")));
		day.selectByVisibleText("May");
	}


	
	
	
	
	
	
	
	

}
