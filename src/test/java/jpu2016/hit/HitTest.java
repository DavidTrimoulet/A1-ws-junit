/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpu2016.hit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class HitTest {
    
    public HitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getStrength method, of class Hit.
     */
    @Test
    public void testGetStrength() {
        final int expected = 1;
        final Hit hit = new Hit(1, 10, TypeHit.NORMAL);
        assertEquals(expected, hit.getStrength()); 
    }

    /**
     * Test of getRange method, of class Hit.
     */
    @Test
    public void testGetRange() {
           fail("The test case is a prototype.");
    }

    /**
     * Test of getTypeHit method, of class Hit.
     */
    @Test
    public void testGetTypeHit() {
        fail("The test case is a prototype.");
    }
    
}
