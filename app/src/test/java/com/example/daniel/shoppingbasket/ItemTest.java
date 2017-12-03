package com.example.daniel.shoppingbasket;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 03/12/2017.
 */

public class ItemTest {

    Item item;

    @Test
    public void testGetName() {
        Item item1 = new Item("book", 10.00);
        assertEquals("book", item1.getName());
    }
}
