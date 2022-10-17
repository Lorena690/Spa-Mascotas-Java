package com.spamascotas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Lorena Sánchez Fernández");
        System.out.println("Spa Mascotas");
        System.out.println("Estructura de Datos");
        Boolean autenticado = false;
        do
        {
            System.out.println("Ingrese la contraseña de acceso: ");
            Scanner scanner = new Scanner(System.in);
            String contrasena = String.valueOf(scanner.next());
            if (contrasena.equals("123"))
            {
                autenticado = true;
            }
            else
            {
                System.out.println("Contraseña incorrecta, vuelve a intentarlo");
            }
        } while (!autenticado);
        System.out.flush();
        SpaMascotas spaMascotas = new SpaMascotas();
        spaMascotas.menuDatos();
    }
}
