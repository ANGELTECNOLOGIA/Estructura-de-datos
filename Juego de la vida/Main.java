package com.mycompany.arraydosdadt;

public class Main {
    public static void main(String[] args) {
        int filas = 8;
        int columnas = 8;
        int generaciones = 10;
        
        JuegoDeLaVida juego = new JuegoDeLaVida(filas, columnas);
        
        System.out.println("Juego de la vida");
        System.out.println();
        System.out.println("Muestra base:");
        juego.mostrarMuestra();
        
        for (int generacion = 1; generacion <= generaciones; generacion++) {
            juego.siguienteGeneracion();
            System.out.println("Generacion " + generacion + ":");
            juego.mostrarMuestra();
        }
        
        System.out.println("Fin de las " + generaciones + " generaciones");
    }
}