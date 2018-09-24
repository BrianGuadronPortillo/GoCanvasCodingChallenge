package com.exampledemo.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				//"pretty",
				"html:target/default-cucumber-reports", 
				"json:target/cucumber.json"
				,"rerun:target/rerun.txt"
		
		},
		
		tags="@challenge", 
		features= "src/test/resources/com/gocanvas/features", 
				
		glue="com.exampledemo.steps_definitions"
		,dryRun = false
		)
public class CukesRunner {}
