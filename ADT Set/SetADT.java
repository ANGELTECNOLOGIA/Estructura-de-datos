package com.example.tareaset;

import java.util.ArrayList;

public class SetADT<T> {
    public ArrayList<T> data;
    
    // Constructor
    public SetADT() {
        data = new ArrayList<>();
    }

    // Determina la longitud del conjunto
    public int longitud() {
        return data.size();
    }

    // Agrega un elemento al conjunto
    public void agregar(T elemento) {
        if (!this.contiene(elemento)) {
            data.add(elemento);
        }
    }

    // Verifica si un elemento está dentro del conjunto
    public boolean contiene(T elemento) {
        return data.contains(elemento);
    }

    // Elimina un elemento del conjunto
    public void eliminar(T elemento) {
        data.remove(elemento);
    }

    public String toString() {
        if (data.isEmpty()) {
            return "Conjunto vacío";
        }
        
        String resultado = "{";
        for (int i = 0; i < data.size(); i++) {
            resultado += data.get(i).toString();
            if (i < data.size() - 1) {
                resultado += ", ";
            }
        }
        resultado += "}";
        return resultado;
    }

    // Verifica si dos conjuntos contienen los mismos elementos
    public boolean equals(SetADT<T> otroConjunto) {
        // Primero verifica que tengan la misma longitud, para saber de manera mas rapido si contienen los mismos elementos
        if (this.longitud() != otroConjunto.longitud()) {
            return false;
        }
        
        // En caso de que tenga la misma longitud, va a recorrer todos los elementos de los conjuntos, para ver si son iguales
        for (T elemento : data) {
            if (!otroConjunto.contiene(elemento)) {
                return false;
            }
        }
        
        return true;
    }
    //Verifica si un conjunto esta dentro de otro conjunto.
    public boolean esSubConjunto(SetADT<T> otroConjunto) {
        for (T elemento : data) {
            if (!otroConjunto.contiene(elemento)) {
                return false;
            }
        }
        return true;
    }
    //Regresa un nuevo conjunto con la union
    public SetADT<T> union(SetADT<T> otroConjunto) {
        SetADT<T> conjuntoUnion = new SetADT<>();
        
        // Agregar todos los elementos del conjunto actual
        for (T elemento : data) {
            conjuntoUnion.agregar(elemento);
        }
        
        // Agregar todos los elementos del otro conjunto
        for (T elemento : otroConjunto.data) {
            conjuntoUnion.agregar(elemento);
        }
        
        return conjuntoUnion;
    }
    // Regresa un nuevo conjunto con la Interseccion.
    public SetADT<T> interseccion(SetADT<T> otroConjunto) {
        SetADT<T> conjuntoInterseccion = new SetADT<>();
        
        for (T elemento : data) {
            if (otroConjunto.contiene(elemento)) {
                conjuntoInterseccion.agregar(elemento);
            }
        }
        
        return conjuntoInterseccion;
    }
    // Regresa un nuevo conjunto con la diferencia.
    public SetADT<T> diferencia(SetADT<T> otroConjunto) {
        SetADT<T> conjuntoDiferencia = new SetADT<>();
        
        for (T elemento : data) {
            if (!otroConjunto.contiene(elemento)) {
                conjuntoDiferencia.agregar(elemento);
            }
        }
        
        return conjuntoDiferencia;
    }
}