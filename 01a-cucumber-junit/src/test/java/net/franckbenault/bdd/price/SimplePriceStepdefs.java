package net.franckbenault.bdd.price;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimplePriceStepdefs {

	CoffeeShop shop;
	
	@Given("^the price list for a coffee shop$")
	public void shouldGiveThePriceListForACoffeeShop(DataTable dtPrices) throws Throwable {
		
		Map<String, Integer> prices = new HashMap<>();
		for(List<String> aprice : dtPrices.raw()) {
			prices.put(aprice.get(0), Integer.valueOf(aprice.get(1)));
		}
		shop = new CoffeeShop(prices);
	}

	@When("^I order (\\d+) \"([^\"]*)\"$")
	public void shouldOrder(int quantity, String product) throws Throwable {
		shop.order(product, quantity);
	}

	@Then("^should I pay (\\d+)$")
	public void shouldPay(int expectedValue) throws Throwable {
	    assertTrue(shop.getOrderPrice()==expectedValue);
	}

}
