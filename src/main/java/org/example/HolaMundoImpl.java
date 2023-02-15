package org.example;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HolaMundoImpl extends UnicastRemoteObject implements HolaMundo {
    protected HolaMundoImpl() throws RemoteException {
        super();
    }

    @Override
    public String saludar() throws RemoteException {
        return "Hola mundo IESAC";
    }
}