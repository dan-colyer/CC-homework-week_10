package com.example.daniel.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 03/12/2017.
 */

public class CustomerTest {

    Item item1;
    Customer customer1;

    @Before
    public void before() {
        item1 = new Item("book", 10.00);
        ArrayList<Buyable> testBoughtItems = new ArrayList<>();
        testBoughtItems.add(item1);

        customer1 = new Customer(testBoughtItems);
    }

    @Test
    public void testGetBoughtItems() {
        assertEquals(1, customer1.getBoughtItems().size());
    }

}
