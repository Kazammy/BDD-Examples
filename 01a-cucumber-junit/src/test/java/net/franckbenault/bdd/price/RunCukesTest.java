package net.franckbenault.bdd.price;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"json:target/cucumber-price.json","html:target/cucumber-price"})
public class RunCukesTest {
}