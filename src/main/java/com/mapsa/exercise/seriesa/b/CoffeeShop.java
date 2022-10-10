package com.mapsa.exercise.seriesa.b;

import java.util.ArrayList;

public class CoffeeShop {
    String name;
    MenuItem[] menu;
    ArrayList<String> orders;

    public CoffeeShop(String string, MenuItem[] menu, ArrayList<String> strings) {
        // TODO Auto-generated constructor stub
        this.name = string;
        this.menu = menu;
        this.orders = strings;
    }

    public Object addOrder(String string) {
        // TODO Auto-generated method stub
        for (int i = 0; i < this.menu.length; i++) {
            if (this.menu[i].getItem().equals(string))
                return "this item currently unavailable";

        }
        this.orders.add(string);
        return "done";

    }

    public double dueAmount() {
        // TODO Auto-generated method stub
        double sum = 0;
        for (String a : this.orders) {
            for (int i = 0; i < menu.length; i++) {
                if (a.equals(this.menu[i].getItem()))
                    sum += this.menu[i].getPrice();

            }

        }
        return sum;
    }


    public Object listOrders() {
        if (this.orders.isEmpty())
            return null;
        else
            return this.orders;
    }

    public Object fulfillOrder() {
        if (this.orders.isEmpty())
            return "All orders have been fulfilled!";
        else
            return "The {item} is ready!";

    }

    public Object cheapestItem() {
        double cheapest=this.menu[0].getPrice();
        String cheapestName="";
		for (int i = 1; i <this.menu.length ; i++) {
			if (this.menu[i].getPrice()<cheapest) {
				cheapest = this.menu[i].getPrice();
				cheapestName = this.menu[i].getItem();
			}


		}
        return cheapestName;
    }

	public Object drinksOnly(){
    	ArrayList<String> drinks = new ArrayList<>();
		for (int i = 0; i <this.menu.length ; i++) {
			if (this.menu[i].getType().equals("drink"))
				drinks.add(this.menu[i].getItem());

		}
    	return drinks;
	}

	public Object foodOnly(){
		ArrayList<String> foods = new ArrayList<>();
		for (int i = 0; i <this.menu.length ; i++) {
			if (this.menu[i].getType().equals("food"))
				foods.add(this.menu[i].getItem());

		}
		return foods;
	}

}

