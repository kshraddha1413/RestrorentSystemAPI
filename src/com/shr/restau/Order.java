package com.shr.restau;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

class Order {
	Menu menu = new Menu();
	HashMap<String, Integer> CustomerOrderMap = new HashMap<>();
	static int orderId = 1;

	Order() {
		orderId++;
	}

	public void AdditemToCustomerOrder(String FoodItem, Integer quantity) {
		HashMap<String, Double> MenuMap = menu.getMenuItems();
		if (MenuMap.containsKey(FoodItem)) {
			CustomerOrderMap.put(FoodItem, quantity);
		} else {
			System.out.println(FoodItem + " is not available");
		}
	}

	public void CoustmerOrderPrint() {
		for (Map.Entry<String, Integer> i : CustomerOrderMap.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());
		}
	}
}
