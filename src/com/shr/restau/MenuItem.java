package com.shr.restau;

public class MenuItem {
	String itemType;
	String itemName;
	double price;
	
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
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	@Override
	public String toString() {
		return "MenuItem [itemName=" + itemName + ", price=" + price + ", itemType=" + itemType + "]";
	}

}
