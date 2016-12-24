package net.franckbenault.bdd.splitting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber-splitting.json","html:target/cucumber-splitting"})
public class RunCukesTest {
}