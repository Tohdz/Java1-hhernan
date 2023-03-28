/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class MenuControllers {

    public void menu() {
        boolean control = true;
        String[] opciones = {"Agregar", "Modificar", "Consultar", "Eliminar", "Volver"};
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
                            break;
                        case 1:
                            auto.modificar();
                            break;
                        case 2:
                            auto.consulta();
                            break;
                        case 3:
                            auto.eliminar();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 1:
                    int opcion2 = JOptionPane.showOptionDialog(null, "Registro de Clientes", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion2) {
                        case 0:
                            persona.nuevo();
                            break;
                        case 1:
                            persona.modificar();
                            break;
                        case 2:
                            persona.consulta();
                            break;
                        case 3:
                            persona.eliminar();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    int opcion3 = JOptionPane.showOptionDialog(null, "Registro de Ventas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion3) {
                        case 0:
                            venta.nuevo();
                            venta.disponibilidad();
                            break;
                        case 1:
                            venta.modificar();
                            break;
                        case 2:
                            venta.consulta();
                            break;
                        case 3:
                            venta.eliminar();
                            venta.visualizacion();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 3:
                    int resp = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicacion?",
                            "Confirm Message", JOptionPane.YES_NO_OPTION,
                            JOptionPane.INFORMATION_MESSAGE);
                    switch (resp) {
                        case 0:
                            control = false;
                            JOptionPane.showMessageDialog(null, "Gracias por su visita");
                            break;
                        case 1:
                            break;
                    }
            }
        }
    }
}
