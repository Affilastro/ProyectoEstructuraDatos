package casoestructuradedatos;

public class Nodo {
    Empleado empleado;
    Nodo siguiente;

    Nodo(Empleado empleado) {
        this.empleado = empleado;
        this.siguiente = null;
    }
}
