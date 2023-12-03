package com.facebook;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags = "@test",
		features = "src/test/resources/features", 
		plugin = {"pretty", "html:target/cucumber-report/report.html", 
				            "json:target/cucumber.json", 
				            "junit:target/cucumber.xml", 
				            "rerun:target/cucumber-reports/rerun.txt"}, 
		glue = {"com.facebook.stepDef"}
		
		//tags = {}    
		
)


public class Runner {

}
