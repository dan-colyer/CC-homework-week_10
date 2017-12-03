package com.example.daniel.shoppingbasket;

/**
 * Created by Daniel on 03/12/2017.
 */

public class Item implements Buyable {

    String name;
    double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }


    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
}
