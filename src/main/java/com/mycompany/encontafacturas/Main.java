/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encontafacturas;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
/**
 *
 * @author martin
 */
public class Main {
    
    public static void main(String[] args){
        LocalDate startDate = LocalDate.parse( "2017-01-01" );
        LocalDate finishDate = LocalDate.parse( "2017-03-01");
        String id="4e25ce61-e6e2-457a-89f7-116404990967";
        String urlServer="http://34.209.24.195/facturas";
        GetNumberOfInvoice getNumberOfInvoice= new GetNumberOfInvoice();
        Integer numberOfInvoices=getNumberOfInvoice.calculateNumberOfInvoice(startDate, finishDate, id, urlServer);
        System.out.println("the number of invoices of id="+id+" is "+numberOfInvoices);
        System.out.println("and the number of calls were : "+getNumberOfInvoice.getNumberOfCalls());
    }
    
}
