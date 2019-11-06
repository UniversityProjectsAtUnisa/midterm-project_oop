/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2019.prova1.gruppo07;

/**
 *
 * @author carbo
 */
public class NetworkException extends RuntimeException {

    /**
     * Creates a new instance of <code>NetworkException</code> without detail
     * message.
     */
    public NetworkException() {
    }

    /**
     * Constructs an instance of <code>NetworkException</code> with the
     * specified detail message.
     *
     * @param errorMessage the detail message.
     */
    public NetworkException(String errorMessage) {
        super(errorMessage);
    }
}
