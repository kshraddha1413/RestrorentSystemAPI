package com.shr.restau;
class BillHelper {
	String itemOrderd;
	double orderdItemPrice;
	int orderItemquantity;
	double totalItemPrice;

	BillHelper(String itemOrderd1, double orderdItemPrice1, int orderItemquantity1, double totalItemPrice1) {
		this.itemOrderd = itemOrderd1;
		this.orderdItemPrice = orderdItemPrice1;
		this.orderItemquantity = orderItemquantity1;
		this.totalItemPrice = totalItemPrice1;
	}
}
