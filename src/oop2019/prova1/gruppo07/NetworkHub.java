/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop2019.prova1.gruppo07;

import java.util.*;

/**
 *
 * @author carbo
 */
public class NetworkHub implements NetworkInterface {

    private Set<NetworkInterface> connections;

    private final String id;

    public NetworkHub(String id) {
        this.id = id;
        connections = new HashSet<>();
    }

    @Override
    public void accept(NetworkInterface sourceInterface, int sourceAddress, int destAddress, String message) {
        for (NetworkInterface net : connections) {
            if (!net.equals(sourceInterface)) {
                net.accept(this, sourceAddress, destAddress, message);
                System.out.println(toString() + ": da " + sourceAddress + " via " + net.toString()
                        + " per " + destAddress);
            }
        }

    }

    @Override
    public void connect(NetworkInterface other) {
        connections.add(other);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NetworkHub other = (NetworkHub) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public String getId() {
        return id;
    }

    public void printConnections() {
        System.out.println("Connessioni di: " + toString());
        for (NetworkInterface net : connections) {
            System.out.println("  " + net.toString());
        }
    }
    
    public String toString(){
        return "Hub "+id;
    }

}
