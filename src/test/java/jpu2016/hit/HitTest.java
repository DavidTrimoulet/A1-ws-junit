/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpu2016.hit;

import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    private Hit hit;
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
        try {
            hit = new Hit(1, 10, TypeHit.NORMAL);
        } catch (Exception ex) {
            Logger.getLogger(HitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        assertEquals(expected, hit.getStrength()); 
    }

    /**
     * Test of getRange method, of class Hit.
     */
    @Test
    public void testGetRange() {
           final int expected = 10;
            assertEquals(expected, hit.getRange());
    }

    /**
     * Test of getTypeHit method, of class Hit.
     */
    @Test
    public void testGetTypeHit() {
        final TypeHit expected = TypeHit.NORMAL;
        assertEquals(expected, hit.getTypeHit());
    }
    @Test
    public void GivenAStrenghOf101WhenCreatingAHitShouldThrowStrengthExeption(){
        try {
            new Hit(101, 1, TypeHit.NORMAL);
            fail("Should throw exception when Strength > 101");
        } catch (final Exception e) {
            final String expected = "Strength out of range";
            assertEquals(expected, e.getMessage());
        }
    }
    
    @Test
    public void GivenAStrenghOfMinus1WhenCreatingAHitShouldThrowStrengthExeption(){
        try {
            new Hit(-1, 1, TypeHit.NORMAL);
            fail("Should throw exception when Strength < 0");
        } catch (final Exception e) {
            final String expected = "Strength out of range";
            assertEquals(expected, e.getMessage());
        }
    }
    
    @Test
    public void GivenA20RangeWhenDoublingShouldReturn40(){
        try {
            hit = new Hit(1, 20, TypeHit.MAGIC);
        } catch (Exception ex) {
            Logger.getLogger(HitTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        assertEquals(40, hit.doubleRange()); 
    }

    @Test
    public void GivenARangeOf11WhenCreatingAHitShouldThrowRangeExeption(){
        try {
            new Hit(1, 11, TypeHit.NORMAL);
            fail("Should throw exception when Range > 11");
        } catch (final Exception e) {
            final String expected = "Range out of range";
            assertEquals(expected, e.getMessage());
        }
    }
    
    @Test
    public void GivenARangeofMinus1WhenCreatingAHitShouldThrowRangeExeption(){
        try {
            new Hit(1, -1, TypeHit.NORMAL);
            fail("Should throw exception when Range < 0");
        } catch (final Exception e) {
            final String expected = "Range out of range";
            assertEquals(expected, e.getMessage());
        }
    }

}
