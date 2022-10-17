package com.spamascotas;

import java.util.List;

public class ServicioCompuesto  extends Servicio{

    private List<Servicio> servicios;

    public ServicioCompuesto(String nombre, List<Servicio> servicios)
    {
        super(nombre);
        this.servicios = servicios;
    }
    public List<Servicio> getServicios()
    {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios)
    {
        this.servicios = servicios;
    }

    @Override
    public double calcularPrecio(int estrato)
    {
        double sumaPrecios = 0;
        for (Servicio servicio: servicios)
        {
            sumaPrecios += servicio.calcularPrecio(estrato);
        }
        return sumaPrecios;
    }

    @Override
    public String mostrarNombre() {
        String nombres = this.nombre+": ";
        for (Servicio servicio: servicios)
        {
            nombres += servicio.mostrarNombre()+", ";
        }
        return nombres;
    }

}
