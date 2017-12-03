package com.example.daniel.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 03/12/2017.
 */

public class ShoppingBasketTest {

    Item item1;
    ShoppingBasket basket1;

    @Before
    public void before() {
        item1 = new Item("book", 10.00);
        ArrayList<Buyable> testItems = new ArrayList<>();
        testItems.add(item1);

        basket1 = new ShoppingBasket(testItems);
    }

    @Test
    public void testGetShoppingBasketItems() {
        assertEquals(1, basket1.getItems().size());
    }

    @Test
    public void testShoppingBasketStartsEmpty() {
        ArrayList<Buyable> testItems = new ArrayList<>();
        ShoppingBasket basketTest = new ShoppingBasket(testItems);
        assertEquals(0, basketTest.getItems().size());
    }

    @Test
    public void testAddToBasket() {
        Item item2 = new Item("magazine", 5.00);
        basket1.addItem(item2);
        assertEquals(2, basket1.getItems().size());
    }

    @Test
    public void testRemoveItemFromBasket() {
        basket1.removeItem(item1);
        assertEquals(0, basket1.getItems().size());
    }
}
