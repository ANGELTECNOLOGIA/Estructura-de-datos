package com.example.adtlistaligada;

public class ListaLigada<T> {
    Nodo<T> head;
    int tamanio = 0;
    Nodo<T> currNode;

    public ListaLigada() {
    }

    public boolean estaVacia(){
        return head == null;
    }

    public int getTamanio(){
        return this.tamanio;
    }

    public void agregar(T valor){
        if (this.head == null){
            this.head = new Nodo<>(valor);
            this.tamanio++;
        }else {
            currNode = this.head;
            while (currNode.getSiguiente() != null){
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(new Nodo<>(valor));
            this.tamanio++;
        }
    }

    public void agregarAlFinal(T valor) { //
        agregar(valor);
    }

    public void agregarAlInicio(T valor) { //
        Nodo<T> nuevoNodo = new Nodo<>(valor);
        nuevoNodo.setSiguiente(head);
        head = nuevoNodo;
        this.tamanio++;
    }

    public boolean agregarDespuesDe(T referencia, T valor) {
        currNode = this.head;
        while (currNode != null) {
            if (currNode.getData().equals(referencia)) {
                Nodo<T> nuevoNodo = new Nodo<>(valor);
                nuevoNodo.setSiguiente(currNode.getSiguiente());
                currNode.setSiguiente(nuevoNodo);
                this.tamanio++;
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }

    public boolean eliminar(int posicion) {
        if (posicion < 0 || posicion >= tamanio) {
            return false;
        }

        if (posicion == 0) {
            return eliminarElPrimero();
        }

        if (posicion == tamanio - 1) {
            return eliminarElFinal();
        }

        Nodo<T> anterior = null;
        currNode = head;
        int contador = 0;

        while (contador < posicion) {
            anterior = currNode;
            currNode = currNode.getSiguiente();
            contador++;
        }

        anterior.setSiguiente(currNode.getSiguiente());
        tamanio--;
        return true;
    }

    public boolean eliminarElPrimero() {
        if (head == null) {
            return false;
        }
        head = head.getSiguiente();
        tamanio--;
        return true;
    }

    public boolean eliminarElFinal() {
        if (head == null) {
            return false;
        }

        if (tamanio == 1) {
            head = null;
            tamanio--;
            return true;
        }

        Nodo<T> anterior = null;
        currNode = head;

        while (currNode.getSiguiente() != null) {
            anterior = currNode;
            currNode = currNode.getSiguiente();
        }

        anterior.setSiguiente(null);
        tamanio--;
        return true;
    }

    public int buscar(T valor){
        currNode = this.head;
        int contador = 0;
        while (currNode != null){
            if(currNode.getData() == valor){
                return contador;
            }
            contador++;
            currNode = currNode.getSiguiente();
        }
        return -1;
    }

    public boolean actualizar(T actual, T nuevo){
        currNode = this.head;
        while (currNode != null){
            if(currNode.getData() == actual){
                currNode.setData(nuevo);
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }
    
    public void trasversal(){
        currNode = this.head;
        while (currNode != null){
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println();
    }
}

class Nodo<T> {
    private T data;
    private Nodo<T> siguiente;

    public Nodo(T data) {
        this.data = data;
        this.siguiente = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "[" + data + "] -> ";
    }
}