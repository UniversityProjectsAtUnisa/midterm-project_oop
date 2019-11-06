/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2019.prova1.gruppo07;

/**
 *
 * @author marco
 */
public class Computer extends NetworkDevice {

    private final String name;

    public Computer(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    protected void process(int sourceAddress, String message) {
        System.out.println(this.toString()
                + " ha ricevuto da " + sourceAddress + ": " + message);
    }

    public void remoteFileAccessRequest(int serverAddress, String fileName) {

        if (getConnection() == null) {
            throw new NetworkException();
        }
        getConnection().accept(this, getAddress(), serverAddress, "Accesso a " + fileName);
    }

    public void remotePrintRequest(int printerAddress, String fileName) {
        if (getConnection() == null) {
            throw new NetworkException();
        }
        getConnection().accept(this, getAddress(), printerAddress, "Stampa di " + fileName);
    }

    @Override
    public String toString() {
        return super.toString() + ": Computer " + name;
    }

}
