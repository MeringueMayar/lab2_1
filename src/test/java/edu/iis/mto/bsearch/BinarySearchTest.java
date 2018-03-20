/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.bsearch;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mayar
 */
public class BinarySearchTest {
    
    public BinarySearchTest() {
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
     * Test of search method, of class BinarySearch.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        int key = 2;
        int[] seq = new int[3];
        seq[0] = 1;
        seq[1] = 2;
        seq[2] = 5;
        
        int asc = 1;
        
        assert seq.length > 0;
        for (int i = 1; i < seq.length; i++){
            if (seq[i] <= seq[i-1]){
                asc = 0;
                break;
            }
        }
        assertEquals(asc, 1);
    }
    
}
