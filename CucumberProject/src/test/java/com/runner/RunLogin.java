package com.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features = "src/test/resources.RunLogin.feature",
		glue = { "com.stepdef.defenation"}
		
		)




public class RunLogin extends AbstractTestNGCucumberTests {

}
