package com.example.daniel.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Daniel on 03/12/2017.
 */

public class ItemTest {

    Item item1;

    @Before
    public void before() {
        item1 = new Item("book", 10.00);
    }

    @Test
    public void testGetName() {
        assertEquals("book", item1.getName());
    }

    @Test
    public void testSetName() {
        item1.setName("magazine");
        assertEquals("magazine", item1.getName());
    }
}
