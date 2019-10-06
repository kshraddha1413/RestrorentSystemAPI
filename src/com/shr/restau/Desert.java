package com.shr.restau;
import java.util.HashMap;


public class Desert implements FoodItem{
	String desertDishName;
	double price;
	static HashMap<String, Double> desertmap = new HashMap<String, Double>();

	public void addFoodItem(String itemName, double price) {
		desertmap.put(itemName, price);
	}

	public void updateFoodItem(String itemName, Double price) {
		desertmap.put(itemName, price);
	}

	public HashMap<String, Double> getFoodListMap(){
		return desertmap;
	}

}
