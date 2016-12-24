package net.franckbenault.bdd.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"json:target/cucumber-report.json","html:target/cucumber"})
public class RunCukesTest extends AbstractTestNGCucumberTests {
}