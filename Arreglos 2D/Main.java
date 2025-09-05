package com.mycompany.arraydosdadt;

import com.mycompany.arraydosdadt.ArrayDosDADT;

public class Main {
    public static void main(String[] args) {

        // Crea el tablero de ajedrez
        ArrayDosDADT<String> tablero = new ArrayDosDADT<>(8, 8);

        tablero.limpiar(".");

        // Piezas negras
        String REY_NEGRO = "\u265A";
        String REINA_NEGRA = "\u265B";
        String TORRE_NEGRA = "\u265C";
        String ALFIL_NEGRO = "\u265D";
        String CABALLO_NEGRO = "\u265E";
        String PEON_NEGRO = "\u265F";
        
        // Piezas blancas
        String REY_BLANCO = "\u2654";
        String REINA_BLANCA = "\u2655";
        String TORRE_BLANCA = "\u2656";
        String ALFIL_BLANCO = "\u2657";
        String CABALLO_BLANCO = "\u2658";
        String PEON_BLANCO = "\u2659";
        
        // Se colocan piezas negras
        tablero.setElemento(0, 0, TORRE_NEGRA);
        tablero.setElemento(0, 1, CABALLO_NEGRO);
        tablero.setElemento(0, 2, ALFIL_NEGRO);
        tablero.setElemento(0, 3, REINA_NEGRA);
        tablero.setElemento(0, 4, REY_NEGRO);
        tablero.setElemento(0, 5, ALFIL_NEGRO);
        tablero.setElemento(0, 6, CABALLO_NEGRO);
        tablero.setElemento(0, 7, TORRE_NEGRA);
        
        // Se colocan los peones negros
        for(int j = 0; j < 8; j++) {
            tablero.setElemento(1, j, PEON_NEGRO);
        }
        
        // Se colocan las piezas blancas
        tablero.setElemento(7, 0, TORRE_BLANCA);
        tablero.setElemento(7, 1, CABALLO_BLANCO);
        tablero.setElemento(7, 2, ALFIL_BLANCO);
        tablero.setElemento(7, 3, REINA_BLANCA);
        tablero.setElemento(7, 4, REY_BLANCO);
        tablero.setElemento(7, 5, ALFIL_BLANCO);
        tablero.setElemento(7, 6, CABALLO_BLANCO);
        tablero.setElemento(7, 7, TORRE_BLANCA);
        
        // Se colocan los peones blancos
        for(int j = 0; j < 8; j++) {
            tablero.setElemento(6, j, PEON_BLANCO);
        }
        
        // Muestra el tablero con toString()
        System.out.println("TABLERO DE AJEDREZ:");
        System.out.println(tablero.toString());
    }
}
