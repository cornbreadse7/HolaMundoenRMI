package org.example;
import java.rmi.Naming;
public class Cliente {
    public static void main(String[] args) {
        try {
            HolaMundo hola = (HolaMundo) Naming.lookup("rmi://localhost/HolaMundo");
            System.out.println(hola.saludar());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}