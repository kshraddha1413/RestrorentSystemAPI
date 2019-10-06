package com.shr.restau;
import java.util.HashMap;

public interface FoodItem {
	public void addFoodItem(String itemName, double price);
	public HashMap<String, Double> getFoodListMap();
	public void updateFoodItem(String itemName, Double price) ;
}
