package casoestructuradedatos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        ListaDobleCircular listaDobleCircular = new ListaDobleCircular();
        Pila pila = new Pila();
        ListaSimpleCircular listaSimpleCircular = new ListaSimpleCircular();

        while (true) {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado (o 'fin' para terminar):");
            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            String telefono = JOptionPane.showInputDialog("Ingrese el teléfono del empleado:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado:"));

            Empleado empleado = new Empleado(nombre, telefono, edad);
            listaDobleCircular.agregarEmpleado(empleado);
            pila.push(empleado);
        }

        // Copia de la pila a la lista simple circular
        while (!pila.estaVacia()) {
            listaSimpleCircular.agregarEmpleado(pila.pop());
        }

        listaDobleCircular.mostrarLista();
        listaSimpleCircular.mostrarLista();

        String empleadoMayorEdad = listaSimpleCircular.encontrarEmpleadoMayorEdad();
        String empleadoMenorEdad = listaSimpleCircular.encontrarEmpleadoMenorEdad();

        JOptionPane.showMessageDialog(null, "Empleado de mayor edad: " + empleadoMayorEdad);
        JOptionPane.showMessageDialog(null, "Empleado de menor edad: " + empleadoMenorEdad);
    }
}
