package com.mycompany.arraydosdadt;

import com.mycompany.arraydosdadt.ArrayDosDADT;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        ArrayDosDADT<Integer> a1 = new ArrayDosDADT<>(8, 8);
        System.out.println();
        System.out.println(a1.getElemento(2, 2));
        a1.setElemento(2, 2, 25);
        System.out.println();
        System.out.println(a1.getElemento(2, 2));
        System.out.println();
        System.out.println("El tam de filas del arreglo: " + a1.getRowsize());
    }
}
