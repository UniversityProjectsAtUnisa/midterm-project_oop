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
public class FileServer extends NetworkDevice {

    @Override
    protected void process(int sourceAddress, String message) {

        System.out.println(this + ": Su richiesta di "
                + sourceAddress + ": " + message);
        if (getConnection() == null) {
            throw new NetworkException("FileServer non connesso!");
        }
        getConnection().accept(this, getAddress(), sourceAddress, "Dati risposta: " + message);
    }

    public String toString() {
        return super.toString() + ": File Server";
    }

}
