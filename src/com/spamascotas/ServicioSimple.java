package com.spamascotas;

public class ServicioSimple extends Servicio{

    private double precio;

    public ServicioSimple(String nombre, double precio)
    {
        super(nombre);
        this.precio = precio;
    }

    public double getPrecio()
    {
        return precio;
    }

    public void setPrecio(double precio)
    {
        this.precio = precio;
    }
    @Override
    public double calcularPrecio(int estrato) {
        if(estrato == 1 || estrato == 2)
        {
            return precio * 0.85;
        }
        else if(estrato == 3 || estrato == 4)
        {
            return precio * 0.90;
        }
        else if (estrato >= 5)
        {
            return precio * 0.95;
        }
        else
        {
            return precio;
        }
    }

    @Override
    public String mostrarNombre() {
        return nombre;
    }
}
