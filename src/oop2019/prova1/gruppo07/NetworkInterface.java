/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2019.prova1.gruppo07;

/**
 *
 * @author gruppo07
 */
public interface NetworkInterface {

    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message);

    public void connect(NetworkInterface other);
}
