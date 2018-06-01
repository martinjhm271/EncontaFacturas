/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.encontafacturas;

/**
 *
 * @author martin
 */

public class EncontaPersistenceException extends Exception{

    public EncontaPersistenceException(String message) {
        super(message);
    }

    public EncontaPersistenceException(String message, Throwable cause) {
        super(message, cause);
    }
    
}