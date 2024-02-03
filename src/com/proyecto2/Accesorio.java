package com.proyecto2;

public class Accesorio extends Producto{

    private String tipoAccesorio;
    public Accesorio(String nombre, double precio, int cantidad, String tipoAccesorio){
        super(nombre,precio,cantidad);
        this.tipoAccesorio = tipoAccesorio;
    }

}
