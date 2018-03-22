/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.iis.mto.bsearch;

import static org.hamcrest.CoreMatchers.is;
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
        asc = true;
        elementFound = false;
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of search method, of class BinarySearch.
     */       
    @Test
    public void TestSearchedElementFoundInSingleElementSequence(){
        seq = new int[1];
        seq[0] = 2;
        key = 2;
        searchResult = BinarySearch.search(key, seq);
        pos = searchResult.getPosition();
        if (searchResult.isFound()== true && seq[pos-1] == key ){
            elementFound = true;
        }
        assertThat(elementFound, is(true));
    }
    
    @Test
    public void TestSearchedElementNotFoundInSingleElementSequence(){
        seq = new int[1];
        seq[0] = 2;
        key = 4;
        searchResult = BinarySearch.search(key, seq);
        pos = searchResult.getPosition();
        if (searchResult.isFound()== true && seq[pos-1] == key ){
            elementFound = true;
        }
        assertThat(elementFound, is(true));
    }
    
    @Test
    public void TestSearchedElementIsFirstInSequence(){
        seq = new int[3];
        seq[0] = 2;
        seq[1] = 3;
        seq[2] = 7;
        key = 2;
        searchResult = BinarySearch.search(key, seq);
        pos = searchResult.getPosition();
        if (searchResult.isFound()== true && seq[pos-1] == key ){
            elementFound = true;
        }
        assertThat(elementFound, is(true));
    }
    
    @Test
    public void TestSearchedElementIsLastInSequence(){
        seq = new int[3];
        seq[0] = 2;
        seq[1] = 3;
        seq[2] = 7;
        key = 7;
        searchResult = BinarySearch.search(key, seq);
        pos = searchResult.getPosition();
        if (searchResult.isFound()== true && seq[pos-1] == key ){
            elementFound = true;
        }
        assertThat(elementFound, is(true));
    }
    
    @Test
    public void TestSearchedElementIsMiddleElementInSequence(){
        seq = new int[3];
        seq[0] = 2;
        seq[1] = 3;
        seq[2] = 7;
        key = 3;
        searchResult = BinarySearch.search(key, seq);
        pos = searchResult.getPosition();
        if (searchResult.isFound()== true && seq[pos-1] == key ){
            elementFound = true;
        }
        assertThat(elementFound, is(true));
    }
    
    @Test 
    public void TestSearchedElementIsNotInSequence(){
        seq = new int[3];
        seq[0] = 2;
        seq[1] = 3;
        seq[2] = 7;
        key = 19;
        searchResult = BinarySearch.search(key, seq);
        pos = searchResult.getPosition();
        if (searchResult.isFound()== true && seq[pos-1] == key ){
            elementFound = true;
        }
        assertThat(elementFound, is(true));
    }
    
    @Test 
    public void TestSequenceHasZeroLength(){
        seq = new int[0];
        key = 19;
        try {
            searchResult = BinarySearch.search(key, seq);
            fail();
        } catch (IllegalArgumentException e) {}
    }
}
