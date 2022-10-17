package com.spamascotas;

import java.util.Date;

public class Propietario {

    private String nombre;
    private Mascota mascota;
    private int estratoSocioeconomico;
    private int identificacion;
    private Date fechaServicio;
    private String servicio;

    public Propietario(String nombre, Mascota mascota, int estratoSocioeconomico)
    {
        this.nombre = nombre;
        this.mascota = mascota;
        this.estratoSocioeconomico = estratoSocioeconomico;
    }

    public int getIdentificacion()
    {
        return identificacion;
    }

    public void setIdentificacion(int identificacion)
    {
        this.identificacion = identificacion;
    }
    public Date getFechaServicio()
    {
        return fechaServicio;
    }

    public void setFechaServicio(Date fechaServicio)
    {
        this.fechaServicio = fechaServicio;
    }
    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getServicio()
    {
        return servicio;
    }

    public void setSetvicio(String servicio)
    {
        this.servicio = servicio;
    }

    public Mascota getMascota()
    {
        return mascota;
    }

    public void setMascota(Mascota mascota)
    {
        this.mascota = mascota;
    }

    public int getEstratoSocioeconomico()
    {
        return estratoSocioeconomico;
    }

    public void setEstratoSocioeconomico(int estratoSocioeconomico)
    {
        this.estratoSocioeconomico = estratoSocioeconomico;
    }
}
