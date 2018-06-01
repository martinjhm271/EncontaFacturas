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
	try{
	    LocalDate startDate = LocalDate.parse( args[0] );
            LocalDate finishDate = LocalDate.parse( args[1]);
            String id=args[2];
            String urlServer=args[3];
            GetNumberOfInvoice getNumberOfInvoice= new GetNumberOfInvoice();
            Integer numberOfInvoices=getNumberOfInvoice.calculateNumberOfInvoice(startDate, finishDate, id, urlServer);
            System.out.println("the number of invoices of id="+id+" is "+numberOfInvoices);
            System.out.println("and the number of calls were : "+getNumberOfInvoice.getNumberOfCalls());
	}catch(Exception e){
	    System.out.println("An error was ocurred,maybe the parameters are wrong or the given address does not work,try again!");
            System.out.println(e.getMessage());
	}

    }
    
}
