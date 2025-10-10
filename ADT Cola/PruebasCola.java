package com.example.adtcola; // Ajusta este paquete para que coincida con ADTCola

import main.java.com.example.adtcola.ADTCola;

public class PruebasCola {
    public static void main(String[] args) {
        ADTCola<String> salaDeEsperaNombre = new ADTCola<>();
        ADTCola<Integer> salaDeEsperaEdad = new ADTCola<>();
        ADTCola<Double> salaDeEsperaEstatura = new ADTCola<>();

        System.out.println("Cola de pacientes");

        // 1.Registrar la llegada de un paciente a la cola.

        salaDeEsperaNombre.encolarNombre("Lamine Yamal");
        salaDeEsperaEdad.encolarEdad(18);
        salaDeEsperaEstatura.encolarEstatura(1.78);

        salaDeEsperaNombre.encolarNombre("Taylor Swift");
        salaDeEsperaEdad.encolarEdad(35);
        salaDeEsperaEstatura.encolarEstatura(1.78);

        salaDeEsperaNombre.encolarNombre("Nicki Nicole");
        salaDeEsperaEdad.encolarEdad(25);
        salaDeEsperaEstatura.encolarEstatura(1.45);

        salaDeEsperaNombre.encolarNombre("Sergio Pérez");
        salaDeEsperaEdad.encolarEdad(35);
        salaDeEsperaEstatura.encolarEstatura(1.73);

        salaDeEsperaNombre.encolarNombre("Lewis Hamilton");
        salaDeEsperaEdad.encolarEdad(40);
        salaDeEsperaEstatura.encolarEstatura(1.74);

        salaDeEsperaNombre.encolarNombre("Bill Gates");
        salaDeEsperaEdad.encolarEdad(69);
        salaDeEsperaEstatura.encolarEstatura(1.77);

        salaDeEsperaNombre.encolarNombre("Lebron James");
        salaDeEsperaEdad.encolarEdad(40);
        salaDeEsperaEstatura.encolarEstatura(2.06);

        salaDeEsperaNombre.encolarNombre("Claudia Sheinbaum Pardo");
        salaDeEsperaEdad.encolarEdad(63);
        salaDeEsperaEstatura.encolarEstatura(1.63);

        salaDeEsperaNombre.encolarNombre("Andres Manuel Lopez Obrador");
        salaDeEsperaEdad.encolarEdad(71);
        salaDeEsperaEstatura.encolarEstatura(1.73);
        
        salaDeEsperaNombre.encolarNombre("Angela Merkel");
        salaDeEsperaEdad.encolarEdad(71);
        salaDeEsperaEstatura.encolarEstatura(1.65);

        salaDeEsperaNombre.encolarNombre("Bellakat");
        salaDeEsperaEdad.encolarEdad(28);
        salaDeEsperaEstatura.encolarEstatura(1.67);
        // 2.Atender al paciente que ha estado esperando más tiempo (el que está al frente de la cola).
        // 4.Cuando se atiende un paciente se muestra nombre, edad y estatura.

        System.out.println("\n");

        System.out.println("Lo estamos atendiendo...");
        System.out.println("Nombre: " + salaDeEsperaNombre.frente());
        System.out.println("Edad: " + salaDeEsperaEdad.frente() + " años");
        System.out.println("Estatura: " + salaDeEsperaEstatura.frente() + " cm");
        System.out.println("Ha sido atendido exitosamente :)");

        System.out.println("\n");

        salaDeEsperaNombre.desencolar();
        salaDeEsperaEdad.desencolar();
        salaDeEsperaEstatura.desencolar();

        // 3.Mostrar el estado de la cola (los pacientes que están esperando).

        System.out.println("Esta es el numero de pacientes que se encuentran en sala de espera: " + salaDeEsperaNombre.longitud());
        System.out.println("\n");

        // 5.Verificar si la cola está vacía (para saber si no hay pacientes esperando).

        System.out.println(salaDeEsperaNombre.to_string());
    }
}