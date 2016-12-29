package net.franckbenault.bdd.search;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepdefs {
	
	private WebDriver driver;
	private String baseUrl;
	
	@Before("@Web")
	public void setUp() {
		//System.setProperty("webdriver.gecko.driver", 
			//	"XXXXX.exe");

		driver = new HtmlUnitDriver();
		baseUrl = "https://www.google.be/";
	}
	
	@After("@web")
	public void tearDown() {
		
		driver.quit();
	}	
	
	@Given("^the google search page$")
	public void the_google_search_page() throws Throwable {
		driver.get(baseUrl);
	}

	@When("^I search \"([^\"]*)\"$")
	public void i_search(String searchedItem) throws Throwable {
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys(searchedItem);
		driver.findElement(By.name("btnG")).submit();
		Thread.sleep(3000);

	}

	@Then("I should find a list results of \"([^\"]*)\"$")
	public void i_should_find_a_list_results_of(String searchedItem) throws Throwable {
		
		//System.out.println(driver.getPageSource());
		assertTrue(driver.getTitle().contains(searchedItem));

	}

}
