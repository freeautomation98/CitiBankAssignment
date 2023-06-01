package com.CITI.orangeHRM.testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="com.CITI.orangeHRM.FeatureFiles",
		glue="com.CITI.orangeHRM.stepDefinition",
		dryRun= false,
		monochrome=true,
		plugin= { "html:target/cucumber-html-report.html",
                  "json:target/cucumber-reports/cucumber.json",
                  "junit:target/cucumber-reports/cucumber.xml",
                  }
				
		)
public class TestRunner {

}
