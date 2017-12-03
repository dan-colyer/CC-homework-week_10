package com.example.daniel.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by Daniel on 03/12/2017.
 */

public class ShoppingBasket {

    private ArrayList<Buyable> items;

    public ShoppingBasket(ArrayList<Buyable> items) {
        this.items = items;
    }

    public ArrayList<Buyable> getItems() {
        return items;
    }

    public void addItem(Buyable item) {
        this.items.add(item);
    }

    public void removeItem(Buyable item) {
        this.items.remove(item);
    }
}
