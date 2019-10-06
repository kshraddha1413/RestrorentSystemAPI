package com.shr.restau;
import java.util.HashMap;

public class MainCourse implements FoodItem {
	String maindishName;
	double price;
	static HashMap<String, Double> mainCourseMap = new HashMap<String, Double>();

	public void addFoodItem(String itemName, double price) {
		mainCourseMap.put(itemName, price);

	}

	public void updateFoodItem(String itemName, Double price) {
		mainCourseMap.put(itemName, price);
	}

	public HashMap<String, Double> getFoodListMap() {
		return mainCourseMap;
	}
}