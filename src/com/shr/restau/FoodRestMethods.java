package com.shr.restau;

import java.util.HashMap;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("food")
public class FoodRestMethods {

	static FoodRestMethods food = new FoodRestMethods();

//	public static void main(String[] args) {
//
//
//		Order order = new Order();
//		order.AdditemToCustomerOrder("samosa", 2);
//		order.AdditemToCustomerOrder("dal", 1);
//
//		System.out.println("********customer order list*********xs");
//		order.CoustmerOrderPrint();
//
//		Bill bill = new Bill(order.orderId);
//		System.out.println("********print bill********");
//		bill.CustomerBillCalculate(order.CustomerOrderMap);
//		bill.getBillPrint();
//
//		Order or = new Order();
//		or.AdditemToCustomerOrder("paneer", 1);
//		System.out.println("********customer order list*********xs");
//		or.CoustmerOrderPrint();
//
//		Bill bi = new Bill(order.orderId);
//		System.out.println("********print bill********");
//		bi.CustomerBillCalculate(or.CustomerOrderMap);
//		bi.getBillPrint();
//	}

	public FoodRestMethods() {
		Menu menu = new Menu();
		menu.addNewItem(ConstantFood.APPETIZER, "bhajji", 6.0);
		menu.addNewItem(ConstantFood.APPETIZER, "samosa", 5.0);
		menu.addNewItem(ConstantFood.DESSERT, "lassi", 10);
		menu.addNewItem(ConstantFood.DESSERT, "brownee", 12);
		menu.addNewItem(ConstantFood.MAINDISH, "dal", 30.0);
		menu.addNewItem(ConstantFood.MAINDISH, "paneer", 30.0);

	}

	@GET
	@Path("menu")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Double> getMenuList() {
		return Menu.getMenuItems();
	}

	@GET
	@Path("apetizers")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Double> getApetizerList() {
		Appetizer a1 = new Appetizer();
		return a1.getFoodListMap();
	}

	@GET
	@Path("MainCourse")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Double> getMainCourseList() {
		MainCourse m = new MainCourse();
		return m.getFoodListMap();
	}

	@GET
	@Path("deserts")
	@Produces(MediaType.APPLICATION_JSON)
	public HashMap<String, Double> getDesertList() {
		Desert d = new Desert();
		return d.getFoodListMap();
	}

	@POST
	@Path("additem")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Message addFoodItem(MenuItem m) {
		Menu menu = new Menu();
		menu.addNewItem(m.itemType, m.itemName, m.price);
		Message me = new Message("Food Item added");
		return me;
	}

	@POST
	@Path("addApetizer")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Message addApetizerRest(Appetizer a) {

		Appetizer a1 = new Appetizer();

		a1.addFoodItem(a.itemName, a.price);

		Message m = new Message("apetizer added");

		return m;
	}

	@POST
	@Path("addMainCourse")
	@Produces({ MediaType.APPLICATION_JSON })
	@Consumes({ MediaType.APPLICATION_JSON })
	public Message addMainCourseRest(MainCourse mm) {

		MainCourse m1 = new MainCourse();

		m1.addFoodItem(mm.itemName, mm.price);

		Message m = new Message("MainCurseDish is added");

		return m;
	}

}
