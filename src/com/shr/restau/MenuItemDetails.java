package com.shr.restau;

public class MenuItemDetails {
	ItemType itemType;
	String itemName;
	double price;

	public MenuItemDetails() {

	}

	public MenuItemDetails(ItemType itemType, String itemName, double price) {
		super();
		this.itemType = itemType;
		this.itemName = itemName;
		this.price = price;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MenuItemDetails [itemType=" + itemType + ", itemName=" + itemName + ", price=" + price + "]";
	}

}

enum ItemType {
	APPETIZERS, MAINCOURSE, DESSERT;
}
