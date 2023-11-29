package casoestructuradedatos;

import javax.swing.JOptionPane;

public class ListaDobleCircular {
    Nodo cabeza;

    void agregarEmpleado(Empleado empleado) {
        Nodo nuevoNodo = new Nodo(empleado);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza.siguiente;
            cabeza.siguiente = nuevoNodo;
            cabeza = nuevoNodo;
        }
    }

    void mostrarLista() {
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
            return;
        }

        Nodo actual = cabeza.siguiente;
        StringBuilder mensaje = new StringBuilder("Lista Doble Circular:\n");
        do {
            mensaje.append("Nombre: ").append(actual.empleado.nombre).append(", Edad: ").append(actual.empleado.edad).append("\n");
            actual = actual.siguiente;
        } while (actual != cabeza.siguiente);

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }
}
