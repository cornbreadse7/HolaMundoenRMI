package org.example;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            HolaMundo hola = new HolaMundoImpl();
            Naming.rebind("rmi://localhost/HolaMundo", hola);
            System.out.println("Servidor listo");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
