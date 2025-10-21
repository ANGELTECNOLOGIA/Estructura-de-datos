public class Balanceador {
    public static boolean estaBalanceado(String codigo) {
        ADTPila<Character> pila = new ADTPila<>();
        
        for (int i = 0; i < codigo.length(); i++) {
            char caracter = codigo.charAt(i);
            
            if (caracter == '{') {
                pila.push(caracter);
            } else if (caracter == '}') {
                if (pila.isEmpty()) {
                    return false;
                }
                pila.pop();
            }
        }
        
        return pila.isEmpty();
    }

    public static void analizarCodigo(String codigo) {
        System.out.println("Código: " + codigo);
        boolean balanceado = estaBalanceado(codigo);
        System.out.println("Balanceado: " + balanceado);
        System.out.println();
    }

    public static void main(String[] args) {

        String prueba1 = "public class Ejemplo { void metodo() { } }";
        String prueba2 = "if (x) { } else { }";
        String prueba3 = "while (true) { { }";
        String prueba4 = "System.out.println(\"Hola\");";
        String prueba5 = "{ { { } } }";
        String prueba6 = "} {";
        String prueba7 = "{{{{{{{{{{{{{{{}}}}}}}}}}}}}}}";
        String prueba8 = "}{}{}{}{}}}{}{}";

        analizarCodigo(prueba1);
        analizarCodigo(prueba2); 
        analizarCodigo(prueba3);
        analizarCodigo(prueba4);
        analizarCodigo(prueba5);
        analizarCodigo(prueba6);
        analizarCodigo(prueba7);
        analizarCodigo(prueba8);
    }
}