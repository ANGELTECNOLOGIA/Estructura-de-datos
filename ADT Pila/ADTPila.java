public class ADTPila<T> {
    private T[] elementos;
    private int tope;
    private static final int CAPACIDAD_POR_DEFECTO = 100;

    public ADTPila() {
        elementos = (T[]) new Object[CAPACIDAD_POR_DEFECTO];
        tope = -1;
    }

    public ADTPila(int capacidad) {
        elementos = (T[]) new Object[capacidad];
        tope = -1;
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public int length() {
        return tope + 1;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T elemento = elementos[tope];
        elementos[tope] = null;
        tope--;
        return elemento;
    }

    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return elementos[tope];
    }

    public void push(T valor) {
        if (tope + 1 == elementos.length) {
            System.out.println("Error: Pila llena");
            return;
        }
        tope++;
        elementos[tope] = valor;
    }

    public boolean isFull() {
        return tope + 1 == elementos.length;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Pila vacía";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = tope; i >= 0; i--) {
            sb.append(elementos[i]).append("\n");
        }
        return sb.toString();
    }
}