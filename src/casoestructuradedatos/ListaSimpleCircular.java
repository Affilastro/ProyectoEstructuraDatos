package casoestructuradedatos;

import javax.swing.JOptionPane;

public class ListaSimpleCircular {
    Nodo cabeza;

    void agregarEmpleado(Empleado empleado) {
        Nodo nuevoNodo = new Nodo(empleado);
        if (cabeza == null) {
            cabeza = nuevoNodo;
            nuevoNodo.siguiente = nuevoNodo;
        } else {
            nuevoNodo.siguiente = cabeza.siguiente;
            cabeza.siguiente = nuevoNodo;
        }
    }

    void mostrarLista() {
        if (cabeza == null) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
            return;
        }

        Nodo actual = cabeza.siguiente;
        StringBuilder mensaje = new StringBuilder("Lista Simple Circular:\n");
        do {
            mensaje.append("Nombre: ").append(actual.empleado.nombre).append(", Edad: ").append(actual.empleado.edad).append("\n");
            actual = actual.siguiente;
        } while (actual != cabeza.siguiente);

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    String encontrarEmpleadoMayorEdad() {
        if (cabeza == null) {
            return "N/A";
        }

        Nodo actual = cabeza.siguiente;
        Empleado empleadoMayorEdad = actual.empleado;
        do {
            if (actual.empleado.edad > empleadoMayorEdad.edad) {
                empleadoMayorEdad = actual.empleado;
            }
            actual = actual.siguiente;
        } while (actual != cabeza.siguiente);

        return empleadoMayorEdad.nombre;
    }

    String encontrarEmpleadoMenorEdad() {
        if (cabeza == null) {
            return "N/A";
        }

        Nodo actual = cabeza.siguiente;
        Empleado empleadoMenorEdad = actual.empleado;
        do {
            if (actual.empleado.edad < empleadoMenorEdad.edad) {
                empleadoMenorEdad = actual.empleado;
            }
            actual = actual.siguiente;
        } while (actual != cabeza.siguiente);

        return empleadoMenorEdad.nombre;
    }
}
