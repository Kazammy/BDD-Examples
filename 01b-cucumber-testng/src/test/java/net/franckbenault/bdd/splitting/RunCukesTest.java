package net.franckbenault.bdd.splitting;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(plugin = {"json:target/cucumber-splitting.json","html:target/cucumber-splitting"})
public class RunCukesTest extends AbstractTestNGCucumberTests {
}