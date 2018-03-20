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
    
    private int key;
    private int[] seq;
    private SearchResult searchResult;
    private boolean asc;
    private boolean elementFound;
    private int pos;
    
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
        key = 6;
        seq = new int[4];
        seq[0] = 6;
        seq[1] = 7;
        seq[2] = 9;
        seq[3] = 22;
        searchResult = BinarySearch.search(key, seq);
        asc = true;
        elementFound = false;
        pos = searchResult.getPosition();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of search method, of class BinarySearch.
     */
    @Test
    public void testBinarySearchSequenceWithValidSize() {
        assert seq.length > 0;
    }
    @Test
    public void testBinarySearchSequenceAscendingNoDuplicates(){
        if (seq.length > 1){
            for (int i = 1; i < seq.length; i++){
                if (seq[i] <= seq[i-1]){
                    asc = false;
                    break;
                }
            }
        }    
        assertEquals(asc, true);
    }
    
    @Test
    public void BinarySearchFoundElement(){
        if (searchResult.isFound()== true && seq[pos-1] == key ){
            elementFound = true;
        }
        assertEquals(elementFound, true);
    }
    

}
