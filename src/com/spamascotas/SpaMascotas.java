package com.spamascotas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpaMascotas {

    private List<Servicio> servicios;
    private Propietario propietario;
    public SpaMascotas(List<Servicio> servicios)
    {
        this.servicios = servicios;
    }

    public List<Servicio> getServicios()
    {
        return servicios;
    }

    public Propietario getPropietario()
    {
        return propietario;
    }

    public void setPropietario(Propietario propietario)
    {
        this.propietario = propietario;
    }

    public Boolean validarPassword( String password )
    {
        if (password.trim().equals("123"))
            return true;
        else
            return false;
    }

    public void setServicios(List<Servicio> servicios)
    {
        this.servicios = servicios;
    }

    public SpaMascotas()
    {
        ServicioFactory servicioFactory = ServicioFactory.getInstance();
        this.servicios = new ArrayList<Servicio>();
        try {
            servicios.add(servicioFactory.factory("Combo 1"));
            servicios.add(servicioFactory.factory("Combo 2"));
            servicios.add(servicioFactory.factory("Combo 3"));
        }catch (Exception e){
        }
    }


    public double consultarCosto(String nombreServicio, int estratoSocioeconomico)
    {
        for(Servicio servicio: servicios)
        {
            if (servicio.getNombre() == nombreServicio)
            {
                return servicio.calcularPrecio(estratoSocioeconomico);
            }
        }
        return 0;
    }

    public String consultarNombre(String nombreServicio)
    {
        for (Servicio servicio: servicios)
        {
            if (servicio.getNombre() == nombreServicio)
            {
                return servicio.mostrarNombre();
            }
        }
        return "";
    }

    public void menuDatos() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, bienvenido a nuestro Spa de Mascotas");
        System.out.println("Ingresar nombre del propietario de la mascota");
        String nombrePropietario = scanner.next();
        System.out.println("Ingrese nombre de la mascota");
        String nombreMascota = scanner.next();
        System.out.println("Ingrese el estrato socieconómico al que pertenece");
        int estrato = scanner.nextInt();
        Mascota mascota = new Mascota(nombreMascota);
        Propietario propietario = new Propietario(nombrePropietario, mascota, estrato);
        System.out.println("Ingrese el número del combo que quiere utilizar en el Spa");
        for(Servicio servicio : servicios)
        {
            System.out.println(servicio.mostrarNombre() + servicio.calcularPrecio(-1));
        }
        int comboElegido = scanner.nextInt();
        System.out.println("Usuario : " + propietario.getNombre());
        System.out.println("Estrato : " + propietario.getEstratoSocioeconomico());
        System.out.println("Nombre de la Mascota : " + propietario.getMascota().getNombre());
        String combo = "";
        switch (comboElegido)
        {
            case 1:
                combo = "Combo 1";
                break;
            case 2:
                combo = "Combo 2";
                break;
            case 3:
                combo = "Combo 3";
                break;
            default:
                System.out.println("Ingrese un combo válido");
                break;
        }
        for(Servicio servicio : servicios)
        {
            if(servicio.getNombre() == combo)
            {
                System.out.println(servicio.mostrarNombre() + "Precio: $" +servicio.calcularPrecio(propietario.getEstratoSocioeconomico()));
            }
        }
    }
}
