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
}
