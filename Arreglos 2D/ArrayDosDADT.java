package com.mycompany.arraydosdadt;

public class ArrayDosDADT<T> {
    private int ren;
    private int col;
    private T[][] datos;

    public ArrayDosDADT(int ren, int col) {
        this.ren = ren;
        this.col = col;
        this.datos = (T[][]) new Object[ren][col];
    }

    public void limpiar(T dato) {
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                datos[i][j] = dato;
            }
        }
    }

    public int getRowsize() {
        return ren;
    }

    public int getColSize() {
        return col;
    }

    public void setElemento(int ren, int col, T dato) {
        if (ren >= 0 && ren < this.ren && col >= 0 && col < this.col) {
            datos[ren][col] = dato;
        } else {
            System.out.println("Índices fuera de rango.");
        }
    }

    public T getElemento(int ren, int col) {
        if (ren >= 0 && ren < this.ren && col >= 0 && col < this.col) {
            return datos[ren][col];
        } else {
            System.out.println("Índices fuera de rango.");
            return null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ren; i++) {
            for (int j = 0; j < col; j++) {
                sb.append(datos[i][j]);
                if (j < col - 1) {
                    sb.append(" --> ");
                }
            }
            if (i < ren - 1) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}