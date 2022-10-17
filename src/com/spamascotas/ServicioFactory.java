package com.spamascotas;

import java.util.Arrays;
import java.util.List;

public class ServicioFactory {

    private static ServicioFactory instance;
    private ServicioFactory(){}

    public static ServicioFactory getInstance()
    {
        if (instance == null)
        {
            instance = new ServicioFactory();
        }
        return instance;
    }

    public Servicio factory(String nombreServicio) throws Exception
    {
        if(nombreServicio == "Baño")
        {
            return new ServicioSimple("Baño", 20000);
        }
        else if(nombreServicio == "Corte")
        {
            return new ServicioSimple("Corte", 25000);
        }
        else if (nombreServicio == "Vacuna Antigarrapatas")
        {
            return new ServicioSimple("Vacuna Antigarrapatas", 35000);
        }
        else if (nombreServicio == "Vacuna Antiparásitos")
        {
            return new ServicioSimple("Vacuna Antiparásitos", 20000);
        }
        else if (nombreServicio == "Combo 1")
        {
            return new ServicioCompuesto("Combo 1", Arrays.asList(factory("Baño"), factory("Corte")));
        }
        else if (nombreServicio == "Combo 2")
        {
            return new ServicioCompuesto("Combo 2", Arrays.asList(factory("Baño"), factory("Corte"), factory("Vacuna Antigarrapatas")));
        }
        else if (nombreServicio == "Combo 3")
        {
            return new ServicioCompuesto("Combo 3", Arrays.asList(factory("Baño"), factory("Corte"), factory("Vacuna Antigarrapatas"), factory("Vacuna Antiparásitos")));
        }
        else
        {
            throw new Exception("Código de servicio incorrecto");
        }
    }
}
