package Cucumbertest.nykaacucumber.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Cucumbertest/nykaacucumber/feature/nykaa.feature",
glue="Cucumbertest\\nykaacucumber\\stepdefinition",
plugin = {"pretty","html:target/CucumberHtmlReport", "json:target/cucumber.json",
		 }, 
monochrome = true, dryRun = false)
public class Testrunner {

}
