package com.backgroundSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
					
					monochrome=true,// if false it will not give the console in readable form for analysis so it needs to be true to remove garbage characters 
					//dryRun=true,
					
					features= {"src/test/resources/com/backgroundFF/BackgroundFF.feature"},
					glue={"com/backgroundSD/"},
					
					plugin={"pretty",
							"html:target/cucumber-htmlreport",
							"json:target/cucumber-report1.json",
							"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
					}
			
			)
	
	public class RunBackgroundTest {	
	

}
