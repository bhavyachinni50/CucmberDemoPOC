package runners;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "main/java/features",
glue = {"stepDefinations"},
plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
dryRun = true,
monochrome = true,
publish = true)
public class TestRunner {

}
