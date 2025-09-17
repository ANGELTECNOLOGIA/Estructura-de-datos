package com.example.tareaset;

public class Main {
    public static void main(String[] args) {
        SetADT<Integer> conjuntoA = new SetADT<>();
        SetADT<Integer> conjuntoB = new SetADT<>();
        SetADT<Integer> conjuntoC = new SetADT<>();
        SetADT<Integer> conjuntoD = new SetADT<>();
        
        System.out.println("Probando el ADT Set");
        
        conjuntoA.agregar(1);
        conjuntoA.agregar(2);
        conjuntoA.agregar(3);
        conjuntoA.agregar(4);
        conjuntoA.agregar(2); 
        conjuntoA.agregar(1); 
        
        conjuntoB.agregar(3);
        conjuntoB.agregar(4);
        conjuntoB.agregar(5);
        conjuntoB.agregar(6);
        
        conjuntoC.agregar(1);
        conjuntoC.agregar(2);
        conjuntoC.agregar(3);

        conjuntoD.agregar(1);
        conjuntoD.agregar(2);
        conjuntoD.agregar(3);
        
        System.out.println("Conjunto A: " + conjuntoA.toString());
        System.out.println("Conjunto B: " + conjuntoB.toString());
        System.out.println("Conjunto C: " + conjuntoC.toString());
        System.out.println("Conjunto D: " + conjuntoD.toString());

        System.out.println();
        
        System.out.println("Longitud de A: " + conjuntoA.longitud());
        System.out.println("Longitud de B: " + conjuntoB.longitud());
        System.out.println("Longitud de C: " + conjuntoC.longitud());
        System.out.println("Longitud de D: " + conjuntoD.longitud());

        System.out.println();
        
        System.out.println("¿A contiene 3? " + conjuntoA.contiene(3));
        System.out.println("¿A contiene 7? " + conjuntoA.contiene(7));

        System.out.println();
        
        System.out.println("Eliminando elemento 3 del conjunto A");
        conjuntoA.eliminar(3);
        System.out.println("Conjunto A después de eliminar 3: " + conjuntoA.toString());
        
        conjuntoA.agregar(3);

        System.out.println();

        System.out.println("¿A es igual a B? " + conjuntoA.equals(conjuntoB));
        System.out.println("¿A es igual a C? " + conjuntoA.equals(conjuntoC));
        System.out.println("¿C es igual a D? " + conjuntoC.equals(conjuntoD));

        System.out.println();

        System.out.println("¿C es subconjunto de A? " + conjuntoC.esSubConjunto(conjuntoA));
        System.out.println("¿A es subconjunto de C? " + conjuntoA.esSubConjunto(conjuntoC));
        System.out.println("¿D es subconjunto de C? " + conjuntoD.esSubConjunto(conjuntoC));
        
        System.out.println();

        SetADT<Integer> unionAB = conjuntoA.union(conjuntoB);
        System.out.println("Unión de A y B: " + unionAB.toString());
        SetADT<Integer> unionCA = conjuntoC.union(conjuntoA);
        System.out.println("Unión de C y A: " + unionCA.toString());
        
        System.out.println();

        SetADT<Integer> interseccionAB = conjuntoA.interseccion(conjuntoB);
        System.out.println("Intersección de A y B: " + interseccionAB.toString());
        SetADT<Integer> interseccionCA = conjuntoA.interseccion(conjuntoC);
        System.out.println("Intersección de C y A: " + interseccionCA.toString());

        System.out.println();
        
        SetADT<Integer> diferenciaAB = conjuntoA.diferencia(conjuntoB);
        System.out.println("Diferencia de A y B (A - B): " + diferenciaAB.toString());
        
        SetADT<Integer> diferenciaBA = conjuntoB.diferencia(conjuntoA);
        System.out.println("Diferencia de B y A (B - A): " + diferenciaBA.toString());
    }
}