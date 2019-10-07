package com.shr.restau;
import java.util.HashMap;

public class Appetizer extends MenuItem implements FoodItem {
	
	public Appetizer() {
		
	}
	
	public static HashMap<String, Double> getAptMap() {
		return aptMap;
	}

	public static void setAptMap(HashMap<String, Double> aptMap) {
		Appetizer.aptMap = aptMap;
	}

	public static HashMap<String, Double> aptMap = new HashMap<>();

	public void addFoodItem(String itemName, double price) {
		aptMap.put(itemName, price);
	}

	public void updateFoodItem(String itemName, Double price) {
		aptMap.put(itemName, price);
	}

	public  HashMap<String, Double> getFoodListMap() {
		return aptMap;
	}
}