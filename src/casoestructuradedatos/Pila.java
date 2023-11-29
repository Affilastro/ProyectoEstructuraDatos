package casoestructuradedatos;

public class Pila {
    Nodo tope;

    void push(Empleado empleado) {
        Nodo nuevoNodo = new Nodo(empleado);
        if (tope == null) {
            tope = nuevoNodo;
        } else {
            nuevoNodo.siguiente = tope;
            tope = nuevoNodo;
        }
    }

    Empleado pop() {
        if (tope == null) {
            return null;
        }
        Empleado empleado = tope.empleado;
        tope = tope.siguiente;
        return empleado;
    }

    boolean estaVacia() {
        return tope == null;
    }
}

