package com.shr.restau;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Menu {

	static Appetizer ape;
	static MainCourse main;
	static Desert des;
	static HashMap<String, Double> MenuItems = new HashMap<>();

	Menu() {
		ape = new Appetizer();
		main = new MainCourse();
		des = new Desert();
	}

	public void addNewItem(String itemType, String itemName, double price) {

		if (itemType == ConstantFood.APPETIZER) {
			Appetizer apeObj = new Appetizer();
			HashMap<String, Double> apelList = apeObj.getFoodListMap();
			apelList.put(itemName, price);
		} else if (itemType == ConstantFood.MAINDISH) {
			MainCourse mainobj = new MainCourse();
			HashMap<String, Double> mainDishList = mainobj.getFoodListMap();
			mainDishList.put(itemName, price);
		}
		if (itemType == ConstantFood.DESSERT) {
			Desert desrtobj = new Desert();
			HashMap<String, Double> desertList = desrtobj.getFoodListMap();
			desertList.put(itemName, price);
		}

	}

	public static HashMap<String, Double> getMenuItems() {
		MenuItems.putAll(ape.getFoodListMap());
		MenuItems.putAll(main.getFoodListMap());
		MenuItems.putAll(des.getFoodListMap());
		return MenuItems;
	}

	public void printMenu() {
		System.out.println("******Apetizers :**********");
		HashMap<String, Double> aptmap = (ape.getFoodListMap());
		for (Map.Entry<String, Double> i : aptmap.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());

		}
		System.out.println("\b******Main Course dishes :\b*****");
		HashMap<String, Double> mainmap = (main.getFoodListMap());
		for (Entry<String, Double> i : mainmap.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());

		}
		System.out.println("\b******Desert Items :\b*****");
		HashMap<String, Double> desertmap = (des.getFoodListMap());
		for (Entry<String, Double> i : desertmap.entrySet()) {
			System.out.println(i.getKey() + " : " + i.getValue());
		}
	}
}
