package com.mapsa.exercise.AlirezaJamshidi.seriesa.b;

import com.mapsa.exercise.seriesa.b.MenuItem;

import java.util.ArrayList;
import java.util.Arrays;

public class CoffeeShop {
	private String name;
	private ArrayList<MenuItem> menu;
	private ArrayList<String> orders;

	public CoffeeShop(String name, MenuItem[] menu, String[] orders) {
		this.name = name;
		this.menu = new ArrayList<>(Arrays.asList(menu));
		this.orders = new ArrayList<>(Arrays.asList(orders));
	}

	public Object addOrder(String string) {
		// TODO Auto-generated method stub
		for (int i = 0; i < this.getMenu().size(); i++) {
			if (this.getMenu().get(i).getItem().equalsIgnoreCase(string)) {
				this.orders.add(string);
				return this;
			}
		}
		return "this item is currently unavailable!";
	}

	public double dueAmount() {
		// TODO Auto-generated method stub
		double res = 0;
		for (int i = 0; i < this.getOrders().size(); i++) {
			for (int j = 0; j < this.getMenu().size(); j++) {
				if (this.getMenu().get(j).getItem().equalsIgnoreCase(this.getOrders().get(i))) {
					res += this.getMenu().get(j).getPrice();
					break;
				}
			}
		}
		return res;
	}

	public Object listOrders() {
		// TODO Auto-generated method stub
		return getOrders();
	}

	public Object fulfillOrder() {
		// TODO Auto-generated method stub
		if (this.orders.isEmpty()) return "All orders have been fulfilled!";
		else return "The" + this.orders.get(0) + " is ready!";
	}

	public Object cheapestItem() {
		// TODO Auto-generated method stub
		try {
			double v = this.getMenu().get(0).getPrice();
			for (int i = 1; i < this.getMenu().size(); i++) {
				v = Math.min(this.getMenu().get(i).getPrice(), this.getMenu().get(i - 1).getPrice());
			}
			return this.getMenu().get(this.getMenu().indexOf(v)).getItem();
		} catch (Exception e) {
			return "Item not Found";
		}
	}

	private void setName(String name) {
		this.name = name;
	}

	private void setMenu(ArrayList<MenuItem> menu) {
		this.menu = menu;
	}

	private void setOrders(ArrayList<String> orders) {
		this.orders = orders;
	}

	private String getName() {
		return name;
	}

	private ArrayList<MenuItem> getMenu() {
		return menu;
	}

	private ArrayList<String> getOrders() {
		return orders;
	}
}
