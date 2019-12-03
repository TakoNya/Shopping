/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author b6
 */
public class ShoppingCartTest {
    private ShoppingCart cart1;
    private Product prod1;
    
    public ShoppingCartTest() {
    }
    
    @Before
    public void setUp() {
        cart1 = new ShoppingCart();
        prod1 = new Product("P001", "Plasma TV LG 32", "Plasma TV with TDT Decod.and high resolution Screen", 46999.99);
        cart1.addItem(prod1);
    }
    
    @After
    public void tearDown() {
        prod1 = null;
        cart1=null;
    }

    /**
     * Test of getBalance method, of class ShoppingCart.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        
        double expResult = 46999.99;
        double result = cart1.getBalance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of addItem method, of class ShoppingCart.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        Product prod2 = new Product("P002", "DVD player Sanmsung", "DVD player remote control and programming", 39.99);
        cart1.addItem(prod2);
        assertEquals(2, cart1.getItemCount());
        double expected = prod1.getPrice() + prod2.getPrice();
        double result = cart1.getBalance();
        assertEquals(expected, result, 0.00);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of removeItem method, of class ShoppingCart.
     */
    @Test
    public void testRemoveItem() {
        System.out.println("removeItem");
                
        cart1.removeItem(prod1);
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(0, cart1.getItemCount());

    }

    /**
     * Test of getItemCount method, of class ShoppingCart.
     */
    @Test
    public void testGetItemCount() {
        System.out.println("getItemCount");
        
        int expResult = 1;
        int result = cart1.getItemCount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of empty method, of class ShoppingCart.
     */
    @Test
    public void testEmpty() {
        System.out.println("empty");
        
        cart1.empty();
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(0, cart1.getItemCount());

    }
    
}
