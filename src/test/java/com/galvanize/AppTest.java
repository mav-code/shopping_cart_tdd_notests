package com.galvanize;
/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AppTest {
    @Test
    public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");

    }

//    Given that I visit the site, when I begin shopping, then I expect my cart to be empty.
    @Test
    public void initializesEmpty(){
        // Setup
        App cart = new App();
        // Execute
        // Assert
        assertTrue(cart.isEmpty(), "cart is empty when initialized");

    }
    @Test
    public void cartIsNotEmptyAfterAdding(){
        // Setup
        App cart = new App();
        cart.addItem();
        // Execute
        // Assert
        assertFalse(cart.isEmpty(), "cart is not empty after having an item added to it");

    }
//    Given I have an empty cart, when I add an Item, then I expect to getTotalPrice() reflect the sum of all the Items in my cart.
//public void testName(){
//// Setup
//// Execute
//// Assert
//}
//    Given I have an empty cart, when I add items, then I expect itemizedList() reflect the items I have added along with their price.
//    Given I have an empty cart, when I add more than one of an item, then I expect getTotalPrice() to reflect both the item price and quantity.
//    Given I have an empty cart, when I add more than one of an item, then I expect itemQuantities() to show the number of items I have added.
//    Given I have a cart with items that are not on sale, when I add items that are on sale, I expect onSaleItems() to include only the items on sale.
}
