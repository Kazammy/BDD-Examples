package net.franckbenault.bdd.price;

import java.util.HashMap;
import java.util.Map;

public class CoffeeShop {

	Map<String,Integer> prices;
	int orderPrice; 
	
	public CoffeeShop(Map<String,Integer> newPrices) {
		prices = new HashMap<String, Integer>();
		prices.putAll(newPrices);
	}
	
	public void order(String product, int quantity) {
		Integer productPrice = prices.get(product);
		if(productPrice!=null) {
			orderPrice += productPrice*quantity;
		}
	}
	
	public int getOrderPrice() {
		
		return orderPrice;
	}
}
