package com.spamascotas;

public abstract class Servicio {

    protected String nombre;


    public Servicio(String nombre)
    {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public abstract double calcularPrecio(int estrato);

    public abstract String mostrarNombre();
}
