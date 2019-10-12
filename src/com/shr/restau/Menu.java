package com.shr.restau;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import com.shr.restau.*;

public class Menu {

	static List<MenuItemDetails> MenuItems = new ArrayList<>();

	Menu() {
	}

	public Message addMenuItem(MenuItemDetails menuItemDetails) {

		boolean alreadyAddedStatus = false;
		for (MenuItemDetails m : MenuItems) {
			if (m.itemName == menuItemDetails.getItemName()) {
				alreadyAddedStatus = true;
				break;
			}
		}
		if (alreadyAddedStatus) {
			return new Message("Item already available in Menu");
		} else {
			MenuItems.add(menuItemDetails);
			return new Message("Item added to Menu");
		}
	}

	public List<MenuItemDetails> getMenuItems() {
		return MenuItems;
	}

	public Message updateMenuItems(MenuItemDetails menuItemDetails) {
		boolean updateStatus = false;
		for (MenuItemDetails m : MenuItems) {
			if (m.itemName == menuItemDetails.getItemName()) {
				m.price = menuItemDetails.getPrice();
				updateStatus = true;
				break;
			}
		}
		if (updateStatus) {
			return (new Message("updated"));
		} else {
			return (new Message("item not found"));
		}
	}

	public Message deleteMenuItems(MenuItemDetails menuItemDetails) {
		boolean deleteStatus = false;
		for (int i = 0; i < MenuItems.size(); i++) {
			if (MenuItems.get(i).itemName == menuItemDetails.getItemName()) {
				MenuItems.remove(i);
				deleteStatus = true;
				break;
			}
		}
		if (deleteStatus) {
			return (new Message("deleted"));
		} else {
			return (new Message("item not found"));
		}
	}

	public void printMenuItems() {
		System.out.println("itemType  | itemName | price");
		for (MenuItemDetails m : MenuItems) {
			System.out.println(m.itemType + " | " + m.itemName + " | " + m.price);
		}
	}

}
