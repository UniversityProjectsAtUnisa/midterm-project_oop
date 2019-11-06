/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2019.prova1.gruppo07;

/**
 *
 * @author ilmico
 */
public abstract class NetworkDevice implements NetworkInterface {

    private final int address;
    private NetworkInterface connection = null;
    private static int allocati = 0;

    public NetworkDevice() {
        this.address = ++allocati;
    }

    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message) {
        if(destAddress == this.address)
            process(sourceAddress, message);
    }

    @Override
    public void connect(NetworkInterface other) {
        this.connection = other;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (getClass() != other.getClass()) {
            return false;
        }
        final NetworkDevice obj = (NetworkDevice) other;
        if (this.address != obj.address) {
            return false;
        }
        return true;
    }

    public int getAddress() {
        return address;
    }

    public NetworkInterface getConnection() {
        return connection;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + this.address;
        return hash;
    }

    protected abstract void process(int sourceAddress, String message);

    @Override
    public String toString() {
        return "Device " + address;
    }

}
