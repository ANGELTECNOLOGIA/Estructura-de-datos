package com.example.fesaragon;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        
        HashMap<String, Libro> biblioteca = new HashMap<String, Libro>();
        
        biblioteca.put("L001", new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
        biblioteca.put("L002", new Libro("1984", "George Orwell", 1949));
        biblioteca.put("L003", new Libro("El principito", "Antoine de Saint-Exupéry", 1943));
        biblioteca.put("L004", new Libro("Don Quijote", "Miguel de Cervantes", 1605));
        biblioteca.put("L005", new Libro("Ética nicomáquea", "Aristoteles", 1566));
        biblioteca.put("L006", new Libro("El banquete", "Platón", -370));
        biblioteca.put("L007", new Libro("Batallas en el desierto", "Jose Emilio Pacheco", 1980));
        biblioteca.put("L008", new Libro("Veinte poemas para ser leídos en el tranvía", "Oliverio Girondo", 1922));
        biblioteca.put("L009", new Libro("Rayuela", "Julio Cortázar", 1963));
        biblioteca.put("L010", new Libro("La metamorfosis", "Franz Kafka", 1915));
        
        for(String clave : biblioteca.keySet()) {
            Libro libro = biblioteca.get(clave);
            System.out.println(clave + " -> " + libro);
        }
        System.out.println();
        
        Libro libro1 = biblioteca.get("L001");
        Libro libro2 = biblioteca.get("L005");
        System.out.println("Libro L001: " + libro1);
        System.out.println("Libro L005: " + libro2);
        System.out.println();
        
        biblioteca.remove("L003");
        biblioteca.remove("L008");
        System.out.println("Se eliminaron los libros L003 y L008");
        System.out.println();
        
        for(String clave : biblioteca.keySet()) {
            Libro libro = biblioteca.get(clave);
            System.out.println(clave + " -> " + libro);
        }
        System.out.println("Total de libros: " + biblioteca.size());
    }
}