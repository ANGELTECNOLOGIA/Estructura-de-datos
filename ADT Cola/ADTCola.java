package main.java.com.example.adtcola;
import java.util.ArrayList;
import java.util.Objects;

public class ADTCola<T> {
    private ArrayList<T> data; // Define los datos
    private int size; // Define el tamaño del arreglo

    public ADTCola() {
        data = new ArrayList<>();
        size = 0;
    }

    public boolean estaVacia() {
        return size == 0;
    }

    public int longitud() {
        return size;
    }

    public T frente() {
        return data.get(0);
    }

    public void encolarNombre(T nombre) {
        data.add(nombre);
        size++;
    }

    public void encolarEdad(T edad) {
        data.add(edad);
        size++;
    }

    public void encolarEstatura(T estatura) {
        data.add(estatura);
        size++;
    }

    public T desencolar() {
        if (estaVacia()) {
            System.out.println("La cola esta vacia");
        }
        size--;
        return data.remove(0);
    }


    public ArrayList<T> getData() {
        return data;
    }

    public ArrayList<T> getSize() {
        return size;
    }

    public void setData(T data) {
        this.data = data;
    }
    
    public void setSize(T size) {
        this.size = size;
    }

    public String to_string() {
        if (estaVacia()) {
            return "Afortunadamente no hay pacientes por atender";
        } 
        else {
            return "Hay pacientes esperando a ser atendidos";
        }
    }
}