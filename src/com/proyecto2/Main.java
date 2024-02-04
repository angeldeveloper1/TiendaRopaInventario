package com.proyecto2;

public class Main {

    public static void main(String[] args) {

        Accesorio aretes = new Accesorio("Aretes",7.99,20,"Aro");
        PrendaDeVestir camiseta = new PrendaDeVestir("Camiseta",10.99,15,36);
        Accesorio collar = new Accesorio("Collar",20.99,10,"Colgante");
        PrendaDeVestir pantalon = new PrendaDeVestir("Pantalon",34.99,10,28);
        PrendaDeVestir boxer = new PrendaDeVestir("Boxer",8.99,30,32);

        Tienda tienda = new Tienda();

        tienda.agregarProducto(aretes);
        tienda.agregarProducto(camiseta);
        tienda.agregarProducto(collar);
        tienda.agregarProducto(pantalon);
        tienda.agregarProducto(boxer);

        tienda.imprimirInventario();
        System.out.println("\n");
        tienda.imprimirCantidad();


    }
}