package org.example;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HolaMundo extends Remote {
    String saludar() throws RemoteException;
}