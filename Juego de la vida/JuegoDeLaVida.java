package com.mycompany.arraydosdadt;

public class JuegoDeLaVida {
    private ArrayDosDADT<Character> muestra;
    private int filas;
    private int columnas;

    public JuegoDeLaVida(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.muestra = new ArrayDosDADT<>(filas, columnas);
        inicializarMuestraAleatoria();
    }

    public void inicializarMuestraAleatoria() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (Math.random() >= 0.5) {
                    muestra.setElemento(i, j, 'V');
                } else {
                    muestra.setElemento(i, j, 'M');
                }
            }
        }
    }

    public void siguienteGeneracion() {
        ArrayDosDADT<Character> muestraSiguiente = new ArrayDosDADT<>(filas, columnas);
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                int vecinosVivos = contarVecinosVivos(i, j);
                char estadoActual = muestra.getElemento(i, j);
                char nuevoEstado = 'M';
                
                if (estadoActual == 'V') {
                    if (vecinosVivos == 2 || vecinosVivos == 3) {
                        nuevoEstado = 'V';
                    }
                } else {
                    if (vecinosVivos == 3) {
                        nuevoEstado = 'V';
                    }
                }
                
                muestraSiguiente.setElemento(i, j, nuevoEstado);
            }
        }
        
        muestra = muestraSiguiente;
    }

    private int contarVecinosVivos(int fila, int columna) {
        int contador = 0;
        
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                if (i == 0 && j == 0) continue;
                
                int vecinoFila = fila + i;
                int vecinoColumna = columna + j;
                
                if (vecinoFila >= 0 && vecinoFila < filas && 
                    vecinoColumna >= 0 && vecinoColumna < columnas) {
                    
                    if (muestra.getElemento(vecinoFila, vecinoColumna) == 'V') {
                        contador++;
                    }
                }
            }
        }
        
        return contador;
    }

    public void mostrarMuestra() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(muestra.getElemento(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public ArrayDosDADT<Character> getMuestra() {
        return muestra;
    }
}