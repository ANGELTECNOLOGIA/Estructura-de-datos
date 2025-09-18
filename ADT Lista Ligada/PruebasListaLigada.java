package com.example.adtlistaligada;

public class PruebasListaLigada {
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();

        System.out.println("Pruebas del ADT Lista Ligada");

        System.out.println("\nAgregar elemento al final de la lista");
        lista.agregar(40);
        lista.agregar(50);
        lista.agregarAlFinal(10);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(30);
        lista.agregarAlFinal(100);
        System.out.print("Lista: ");
        lista.trasversal();
        System.out.println("Tamaño: " + lista.getTamanio());

        System.out.println("\nAgregar elementos al inicio");
        lista.agregarAlInicio(5);
        lista.agregarAlInicio(1);
        lista.agregarAlInicio(2);
        System.out.print("Lista: ");
        lista.trasversal();
        System.out.println("Tamaño: " + lista.getTamanio());

        System.out.println("\nAgregando después de un elemento");
        lista.agregarDespuesDe(40, 15);
        lista.agregarDespuesDe(20, 12);
        System.out.print("Lista: ");
        lista.trasversal();
        System.out.println("Tamaño: " + lista.getTamanio());

        System.out.println("\nEliminamos el primer elemento");
        lista.eliminarElPrimero();
        System.out.print("Lista: ");
        lista.trasversal();
        System.out.println("Tamaño: " + lista.getTamanio());

        System.out.println("\nEliminamos el último elemento");
        lista.eliminarElFinal();
        System.out.print("Lista: ");
        lista.trasversal();
        System.out.println("Tamaño: " + lista.getTamanio());

        System.out.println("\nEliminamos por posición:");
        lista.eliminar(1);
        lista.eliminar(2);
        System.out.print("Lista: ");
        lista.trasversal();
        System.out.println("Tamaño: " + lista.getTamanio());
    }
}