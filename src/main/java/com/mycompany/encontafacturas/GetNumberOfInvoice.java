/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encontafacturas;

import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author martin
 */
public  class GetNumberOfInvoice {

    private Integer numberOfCalls=0;

    public GetNumberOfInvoice(){}
    
    /**
     *
     * @param start start date for calculate number of invoice 
     * @param finish finish date for calculate number of invoice 
     * @param id id of user/client 
     * @param urlServer server's address
     * @return numberOfInvoice number of invoices from user/client between the two dates
     * @throws EncontaPersistenceException if the address or the server does not work
     */
    public Integer calculateNumberOfInvoice(LocalDate start,LocalDate finish,String id,String urlServer) throws EncontaPersistenceException{
        Integer numberOfInvoice=0;
        //call method to get the server response
        String serverResponse=getResponse(start, finish, id, urlServer);
        //Try to convert the answer provide by the server to a number
        numberOfInvoice=isAnumber(serverResponse);
        //if is a number, return the number of invoices
        if(numberOfInvoice!=-1){
            return numberOfInvoice;
        }
        //else calculated a middle date (divide and conquer)
        else{
            //calculated the days between the to dates
            long daysBetween = DAYS.between(start, finish);
            long middleDays=daysBetween/2;
            //create a middle point between the two dates to start the recursion
            LocalDate middleDate=start.plusDays(middleDays);
            //calculate the number of invoices with two range of date more shorter
            return calculateNumberOfInvoice( start, middleDate, id, urlServer) + calculateNumberOfInvoice( middleDate.plusDays(1), finish, id, urlServer);
        }
   
    }
    
    /**
     *
     * @param serverResponse response of the server 
     * @return numberOfInvoice -1 if the response is not a number or an integer>=0 if the response is a number
     */
    private Integer isAnumber(String serverResponse){
        Integer isAnumber=-1;
        try{
            isAnumber= Integer.parseInt(serverResponse);
        }catch(NumberFormatException e){
            //Logger.getLogger(GetNumberOfInvoice.class.getName()).log(Level.SEVERE, null, e);
        }
        return isAnumber;
    }
    
     /**
     *
     * @param start start date for calculate number of invoice 
     * @param finish finish date for calculate number of invoice 
     * @param id id of user/client 
     * @param urlServer server's address
     * @return serverResponse response of the server 
     */
    private String getResponse(LocalDate start,LocalDate finish,String id,String url ) throws EncontaPersistenceException{
        String serverResponse="";
        //building the url with the current parameters
        url=url+"?id="+id+"&start="+start+"&finish="+finish;
        try {
            URL urlServer;
            urlServer = new URL(url);
            BufferedReader reader;  
            //initialization and read of the http request with the definitive url
            reader = new BufferedReader(new InputStreamReader(urlServer.openStream(), "UTF-8"));
            for (String line; (line = reader.readLine()) != null;) {
                //assigned the server response
                serverResponse=line;
            }
            //Increment the number of calls if an error doesn't occur
            this.numberOfCalls+=1;
        } catch (IOException  ex) {
            throw new EncontaPersistenceException(ex.getMessage(),ex);
        }
        return serverResponse;
    }

    public Integer getNumberOfCalls() {
        return numberOfCalls;
    }

    public void setNumberOfCalls(Integer numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }
    
    
    
}
