/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encontafacturas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martin
 */
public class MainTest {
    
    /**
    
    * Equivalence class
    * Input condition
    *   the start date and finish date are equal, so number of calls must be 1
    * Type 
    *   Range                       
    * VALID EQUIVALENCE CLASS
    *   DATEDIFF (start, finish) == 0

    * Equivalence class
    * Input condition
    *   the start date is less or equal than the finish date,so number of calls must be >=1
    * Type  
    *   Range                        
    * VALID EQUIVALENCE CLASS
    *   DATEDIFF (start, finish) >= 0 
 
    * Equivalence class
    * Input condition
    *   the start date is greater than the finish date, so number of calls must be 1 and number of invoices must be 0
    * Type  
    *   Range                        
    * NOT VALID EQUIVALENCE CLASS
    *   start date > finish date
    */
    
    public MainTest() {
    }
    
    
    @Before
    public void setUp() {
    }
   

    @Test
    public void testStartDateAndFinishDateAreEqualThenNumberOfCallsMustBe1() {
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testStartDateIsLessOrEqualToFinishDateThenNumberOfCallsMustBeEqualOrGreaterThan1() {
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testStartDateIsGreaterThanFinishDateThenNumberOfCallsMustBe1AndNumberOfInvoicesMustBe0() {
        fail("The test case is a prototype.");
    }
    
 
    
}
