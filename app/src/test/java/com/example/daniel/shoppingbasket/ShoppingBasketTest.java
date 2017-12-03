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

    @Test
    public void testClearBasket() {
        basket1.clearBasket();
        assertEquals(0, basket1.getItems().size());
    }

    @Test
    public void testTotalValueOfShoppingBasket() {
        Item item2 = new Item("magazine", 5.00);
        basket1.addItem(item2);
        assertEquals(15.00, basket1.totalValue(), 0.01);
    }

    @Test
    public void testTotalValueOfShoppingBasket_BOGOF() {
        Item item2 = new Item("magazine", 5.00);
        Item item3 = new Item("magazine", 6.00);
        Item item4 = new Item("magazine", 7.00);
        Item item5 = new Item("magazine", 8.00);

        basket1.addItem(item2);
        basket1.addItem(item3);
        basket1.addItem(item4);
        basket1.addItem(item5);

        assertEquals(24.00, basket1.totalValueBogof(), 0.01);
    }

    @Test
    public void testTotalValueOfShoppingBasket_BOGOF_TotalGreaterThanTwentyDiscount() {
        Item item2 = new Item("magazine", 5.00);
        Item item3 = new Item("magazine", 6.00);

        basket1.addItem(item2);
        basket1.addItem(item3);

        assertEquals(16.00, basket1.totalValueBogofGreaterThanTwenty(), 0.01);

        Item item4 = new Item("magazine", 7.00);
        Item item5 = new Item("magazine", 8.00);

        basket1.addItem(item4);
        basket1.addItem(item5);

        assertEquals(21.60, basket1.totalValueBogofGreaterThanTwenty(), 0.01);


    }


//    @Test
//    public void testTotalValueOfShoppingBasket_BOGOF_LoyaltyDiscount() {
//        Item item2 = new Item("magazine", 5.00);
//        Item item3 = new Item("magazine", 6.00);
//        Item item4 = new Item("magazine", 7.00);
//        Item item5 = new Item("magazine", 8.00);
//
//        basket1.addItem(item2);
//        basket1.addItem(item3);
//        basket1.addItem(item4);
//        basket1.addItem(item5);
//
//        assertEquals(24.00, basket1.totalValueBogofLoyaltyDiscount(), 0.01);
//    }


}
