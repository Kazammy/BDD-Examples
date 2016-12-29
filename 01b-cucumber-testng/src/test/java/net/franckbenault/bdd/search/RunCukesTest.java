package net.franckbenault.bdd.search;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"json:target/cucumber-search.json","html:target/cucumber-search"})
public class RunCukesTest extends AbstractTestNGCucumberTests {
}