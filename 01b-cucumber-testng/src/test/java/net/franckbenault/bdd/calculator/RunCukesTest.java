package net.franckbenault.bdd.calculator;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"json:target/cucumber-calculator.json","html:target/cucumber-calculator"})
public class RunCukesTest extends AbstractTestNGCucumberTests {
}