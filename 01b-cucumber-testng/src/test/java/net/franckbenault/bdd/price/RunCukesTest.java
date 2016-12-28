package net.franckbenault.bdd.price;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"json:target/cucumber-price.json","html:target/cucumber-price"})
public class RunCukesTest extends AbstractTestNGCucumberTests {
}