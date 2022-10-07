package com.mapsa.exercise.seriesa.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class CoffeeShopNorouzi {
	private String name;
	private ArrayList<MenuItem> menu = new ArrayList<>();
	private ArrayList<String> orders = new ArrayList<>();

	public CoffeeShopNorouzi(String name, MenuItem[] menu, String[] orders) {
		this.name = name;
		this.menu.addAll(Arrays.asList(menu));
		this.orders.addAll(Arrays.asList(orders));
	}

	public String shopName() { return this.name; }

	public String addOrder(String item) {
		MenuItem t = this.menu.stream().filter(i -> i.getItem().equals(item)).findFirst().orElse(null);
		if (t == null) return "This item is currently unavailable!";
		this.orders.add(item);
		return "Order added!";
	}

	public String fulfillOrder() {
		return this.orders.isEmpty() ? "All orders have been fulfilled!" : String.format("The %s is ready!", this.orders.remove(0));
	}

	public String[] listOrders() {
		return this.orders.isEmpty() ? new String[] {} : this.orders.stream().toArray(String[]::new);
	}

	public double dueAmount() {
		return this.orders.isEmpty() ? 0d: this.orders.stream().mapToDouble(s -> this.menu.stream()
				.filter(i -> i.getItem().equals(s)).findFirst().orElse(new MenuItem("dummy", "food", 0.0)).getPrice()).sum();
	}

	public String cheapestItem() {
		return this.menu.stream().sorted(Comparator.comparingDouble(MenuItem::getPrice)).limit(1).toArray(MenuItem[]::new)[0].getItem();
	}

	public String[] drinksOnly() {
		return this.menu.stream().filter(i -> i.getType().equals("drink")).map(MenuItem::getItem).toArray(String[]::new);
	}

	public String[] foodOnly() {
		return this.menu.stream().filter(i -> i.getType().equals("food")).map(MenuItem::getItem).toArray(String[]::new);
	}
}