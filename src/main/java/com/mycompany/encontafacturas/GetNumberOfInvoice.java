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
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author martin
 */
public  class GetNumberOfInvoice {

    private Integer numberOfCalls=0;

    public GetNumberOfInvoice(){}
    
    
    public Integer calculateNumberOfInvoice(LocalDate start,LocalDate finish,String id,String urlServer){
        return 0;
    }
    
  
    private Integer isAnumber(String serverResponse){
        return 0;
    }
    

    private String getResponse(LocalDate start,LocalDate finish,String id,String url ){
        return "";
    }

    public Integer getNumberOfCalls() {
        return numberOfCalls;
    }

    public void setNumberOfCalls(Integer numberOfCalls) {
        this.numberOfCalls = numberOfCalls;
    }
    
    
    
}
