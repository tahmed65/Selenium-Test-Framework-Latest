package com.facebook.stepDef;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import com.facebook.pageObject.BasePage;
import com.facebook.pageObject.FaceBookLoginPage;
import com.facebook.utilities.ReadWriteFromExcel;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SingUpAndSingInStepDef extends BasePage{
	ReadWriteFromExcel excel;
	FaceBookLoginPage faceBookLoginPage;
	
	@Before
	public void setUpBrowser() {
		BasePage.initBrowser();
		 
	}
	
	@After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot on Failure");
        }
        
        driver.quit();
    }

	
	
	
	@Given("User Navigate to Facebook Home Page")
	public void user_navigate_to_facebook_home_page() {
	   driver.get("https://www.facebook.com/");
	}

	@When("User Click on Create New Account Button")
	public void user_click_on_create_new_account_button() {
	  // driver.findElement(By.linkText("Create new account")).click();
		faceBookLoginPage=new FaceBookLoginPage();
		faceBookLoginPage.createNewAccountLink.click();
	}

	@Then("User Enter Their First Name")
	public void user_enter_their_first_name() throws IOException {
	  // driver.findElement(By.name("firstname")).sendKeys("Mike");
		faceBookLoginPage.firstnameFiled.sendKeys("Mike");
	}

	@Then("User Enter their Last Name")
	public void user_enter_their_last_name() {
		// driver.findElement(By.name("lastname")).sendKeys("Pen");
		faceBookLoginPage.lastnameFiled.sendKeys("Pen");
	}

	@Then("User Enter Their valid Email address")
	public void user_enter_their_valid_email_address() {
		 //driver.findElement(By.name("reg_email__")).sendKeys("Mike.pen@outlook.com"); 
		faceBookLoginPage.emailFiled.sendKeys("Mike.pen@outlook.com");
	}

	@Then("User Re-Enter Their valid Email address")
	public void user_re_enter_their_valid_email_address() {
		// driver.findElement(By.name("reg_email_confirmation__")).sendKeys("Mike.pen@outlook.com");
		faceBookLoginPage.emailConfirmationFiled.sendKeys("Mike.pen@outlook.com");
	}

	@Then("User Enter Stong Password as Per requirement")
	public void user_enter_stong_password_as_per_requirement() {
		// driver.findElement(By.name("reg_passwd__")).sendKeys("Mike@2032!");
		faceBookLoginPage.passwordFiled.sendKeys("Mike@2032!");
	}

	@Then("User Select Birth Month from the drop down")
	public void user_select_birth_month_from_the_drop_down() {
	    //Select month=new Select(driver.findElement(By.name("birthday_month")));
	   // month.selectByVisibleText("Jan");
	    Select month=new Select(faceBookLoginPage.birthdayMonthDropDown);
	    month.selectByVisibleText("Jan");
	}

	@Then("User Select Birth Day from the drop Down")
	public void user_select_birth_day_from_the_drop_down() {
//	    Select day=new Select(driver.findElement(By.name("birthday_day")));
//	    day.selectByVisibleText("25");
	    
	   Select day=new Select(faceBookLoginPage.birthdayDayDropDown);
	   day.selectByVisibleText("25");
	}

	@Then("User Select Birth Year from the drop Down")
	public void user_select_birth_year_from_the_drop_down() {
//	    Select year=new Select(driver.findElement(By.name("birthday_year")));
//	    year.selectByVisibleText("1980");
	    
	   Select year=new Select(faceBookLoginPage.birthdayYearDropDown);
	   year.selectByVisibleText("1980");
	}

	@When("User Click on Male Gender Option")
	public void user_click_on_male_gender_option() {
	   // driver.findElement(By.xpath("//form/div[1]/div[7]/span/span[2]/label")).click();
		faceBookLoginPage.maleOptionButton.click();
	}

	@When("User Click on Femal Gender Option")
	public void user_click_on_femal_gender_option() {
		//driver.findElement(By.xpath("//form/div[1]/div[7]/span/span[1]/label")).click();
		faceBookLoginPage.femaleOptionButton.click();
	}

	@When("User Click on Custom Gender Option")
	public void user_click_on_custom_gender_option() {
		//driver.findElement(By.xpath("//form/div[1]/div[7]/span/span[3]/label")).click();
		
		faceBookLoginPage.otherOptionButton.click();
	}
	
	
	
	
	
	
	

}
