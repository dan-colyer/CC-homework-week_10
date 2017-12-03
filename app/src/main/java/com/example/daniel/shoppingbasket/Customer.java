package com.example.daniel.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by Daniel on 03/12/2017.
 */

public class Customer {

    private ArrayList<Buyable> boughtItems;

    public Customer(ArrayList<Buyable> boughtItems) {
        this.boughtItems = boughtItems;
    }

    public ArrayList<Buyable> getBoughtItems() {
        return boughtItems;
    }

    public void addBoughtItem(Buyable item) {
        this.boughtItems.add(item);
    }

    public void removeBoughtItem(Buyable item) {
        this.boughtItems.remove(item);
    }

    public void clearBoughtItems() {
        this.boughtItems.clear();
    }
}
