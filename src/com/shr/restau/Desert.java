package com.shr.restau;

import java.util.HashMap;

public class Desert extends MenuItem implements FoodItem {
	
	static HashMap<String, Double> desertmap = new HashMap<String, Double>();
	Desert() {

	}

	public void addFoodItem(String itemName, double price) {
		desertmap.put(itemName, price);
	}

	public void updateFoodItem(String itemName, Double price) {
		desertmap.put(itemName, price);
	}

	public HashMap<String, Double> getFoodListMap() {
		return desertmap;
	}

}
