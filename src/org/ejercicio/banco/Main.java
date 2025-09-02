package org.ejercicio.banco;

public class Main {
    public static void main (String[] args){
        Cliente cliente1 = new Cliente("Analicia",1170041);
        CuentaBancaria cuenta1 = new CuentaBancaria(2872454,cliente1,10000);

        CuentaBancaria cuenta2 = new CuentaBancaria(123,new Cliente("Juan perez",123),9000);

        Cliente cliente3 = new Cliente("Raul emiliano", 458);
    }
}