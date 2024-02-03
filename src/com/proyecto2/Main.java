package com.proyecto2;

public class Main {

    public static void main(String[] args) {

        Producto[] prod = new Producto[5];
        prod[0] = new Accesorio("Aretes",7.99,20,"Aro");
        prod[1] = new PrendaDeVestir("Camiseta",10.99,15,36);
        prod[2] = new Accesorio("Collar",20.99,10,"Colgante");
        prod[3] = new PrendaDeVestir("Pantalon",34.99,10,28);
        prod[4] = new PrendaDeVestir("Boxer",8.99,30,32);

        for (Producto producto : prod){
            producto.impresionLista();
            System.out.println("\n");
        }


    }

}
