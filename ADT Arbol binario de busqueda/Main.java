package com.example.binarysearchthree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
        bst.insert(100);
        bst.insert(10);
        bst.insert(150);
        bst.insert(167);
        bst.insert(185);

        System.out.println("Recordido Inorden:");
        bst.transversal("inorden");
        
        System.out.println("\nRecordido Preorden:");
        bst.transversal("preorden");
        
        System.out.println("\nRecordido Postorden:");
        bst.transversal("postorden");

        System.out.println("\n\nBuscar 40: " + (bst.search(40) != null ? "Encontrado" : "No encontrado"));
        System.out.println("Buscar 112: " + (bst.search(112) != null ? "Encontrado" : "No encontrado"));
        System.out.println("Buscar 150: " + (bst.search(150) != null ? "Encontrado" : "No encontrado"));
        
        bst.remove(20);
        bst.remove(70);
        bst.remove(167);
        System.out.println("\nDespues de eliminar 20, 70 y 167:");
        System.out.println("\nRecordido Inorden:");
        bst.transversal("inorden");
        
        System.out.println("\nRecordido Preorden:");
        bst.transversal("preorden");
        
        System.out.println("\nRecordido Postorden:");
        bst.transversal("postorden");
    }
}