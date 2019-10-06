package com.shr.restau;
import java.util.HashMap;

public class Appetizer implements FoodItem {
	String apeName;
	double price;
	
	public Appetizer() {
		
	}
	
	public Appetizer(String apeName, double price) {
		this.apeName = apeName;
		this.price = price;
	}

	public String getApeName() {
		return apeName;
	}

	public void setApeName(String apeName) {
		this.apeName = apeName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static HashMap<String, Double> getAptMap() {
		return aptMap;
	}

	public static void setAptMap(HashMap<String, Double> aptMap) {
		Appetizer.aptMap = aptMap;
	}

	static HashMap<String, Double> aptMap = new HashMap<>();

	public void addFoodItem(String apeName, double price) {
		aptMap.put(apeName, price);
	}

	public void updateFoodItem(String ApeName, Double price) {
		aptMap.put(ApeName, price);
	}

	public HashMap<String, Double> getFoodListMap() {
		return aptMap;
	}
}