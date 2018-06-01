/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encontafacturas;

import java.time.LocalDate;
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
public class EncontaFacturasTest {
    
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
    
    public EncontaFacturasTest() {
    }
    
    String id="4e25ce61-e6e2-457a-89f7-116404990967";
    String urlServer="http://34.209.24.195/facturas";
    


    @Test
    public void testStartDateAndFinishDateAreEqualThenNumberOfCallsMustBe1() throws EncontaPersistenceException {
        LocalDate startDate = LocalDate.parse( "2017-01-01" );
        LocalDate finishDate = LocalDate.parse( "2017-01-01");
        GetNumberOfInvoice getNumberOfInvoice= new GetNumberOfInvoice();
        getNumberOfInvoice.calculateNumberOfInvoice(startDate, finishDate, id, urlServer);
        assertEquals(1,(int)getNumberOfInvoice.getNumberOfCalls());
    }
    
    @Test
    public void testStartDateIsLessOrEqualToFinishDateThenNumberOfCallsMustBeEqualOrGreaterThan1() throws EncontaPersistenceException {
        LocalDate startDate = LocalDate.parse( "2017-01-01" );
        LocalDate finishDate = LocalDate.parse( "2017-01-02");
        GetNumberOfInvoice getNumberOfInvoice= new GetNumberOfInvoice();
        getNumberOfInvoice.calculateNumberOfInvoice(startDate, finishDate, id, urlServer);
        assertTrue(getNumberOfInvoice.getNumberOfCalls()>=1);
    }
    
    @Test
    public void testStartDateIsGreaterThanFinishDateThenNumberOfCallsMustBe1AndNumberOfInvoicesMustBe0() throws EncontaPersistenceException {
        LocalDate startDate = LocalDate.parse( "2017-02-01" );
        LocalDate finishDate = LocalDate.parse( "2017-01-02");
        GetNumberOfInvoice getNumberOfInvoice= new GetNumberOfInvoice();
        Integer numberOfInvoice=getNumberOfInvoice.calculateNumberOfInvoice(startDate, finishDate, id, urlServer);
        assertTrue(getNumberOfInvoice.getNumberOfCalls()==1 && numberOfInvoice==0);
    }
    
 
    
}
