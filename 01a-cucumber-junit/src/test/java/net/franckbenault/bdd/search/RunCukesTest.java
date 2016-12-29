package net.franckbenault.bdd.search;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/cucumber-search.json","html:target/cucumber-search"})
public class RunCukesTest {
}