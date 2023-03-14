package Controllers;

import javax.swing.JOptionPane;

public class MenuControllers {

    public void menu() {
        boolean control = true;
        String[] opciones = {"Agregar", "Modificar", "Consultar", "Eliminar"};
        String[] opciones1 = {"Registro de nuevos Vehiculos", "Registro de Clientes", "Registro de Ventas", "Salir"};
        AutoControllers auto = new AutoControllers();
        PersonaControllers persona = new PersonaControllers();
        VentaControllers venta = new VentaControllers();

        while (control == true) {
            int opcion = JOptionPane.showOptionDialog(null, "Autos Colon", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones1, "Registro de nuevos Vehiculos");
            switch (opcion) {
                case 0:
                    int opcion1 = JOptionPane.showOptionDialog(null, "Registro de nuevos Vehiculos", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion1) {
                        case 0:
                            auto.nuevo();
                            JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo vehiculo.");
                            break;
                        case 1:
                            auto.modificar();
                            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
                            break;
                        case 2:
                            auto.consulta();
                            JOptionPane.showMessageDialog(null, "Para Autos Colon es un placer servirle.");
                            break;
                        case 3:
                            auto.eliminar();
                            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                            break;
                    }
                    break;
                case 1:
                    int opcion2 = JOptionPane.showOptionDialog(null, "Registro de Clientes", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion2) {
                        case 0:
                            persona.nuevo();
                            JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo cliente.");
                            break;
                        case 1:
                            persona.modificar();
                            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
                            break;
                        case 2:
                            persona.consulta();
                            JOptionPane.showMessageDialog(null, "Para Autos Colon es un placer servirle.");
                            break;
                        case 3:
                            persona.eliminar();
                            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                            break;
                    }
                    break;
                case 2:
                    int opcion3 = JOptionPane.showOptionDialog(null, "Registro de Ventas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion3) {
                        case 0:

                            break;
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                    }
                    break;
                case 3:
                    control = false;
                    break;
            }
        }
    }
}
