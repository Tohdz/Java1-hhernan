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
        String[] opciones1 = {"Personas", "Usuarios", "Choferes","Vehiculos","Viajes","Facturacion","Salir"};
        String [] opciones2 ={"Venta de tiquetes","Consulta de ventas","Eliminar ventas","Validacion de espacios","Volver"};
        PersonasControllers personas = new PersonasControllers();
        UsuariosControllers usuarios = new UsuariosControllers();
        ChoferesControllers choferes = new ChoferesControllers(); 
        VehiculosControllers vehiculos = new VehiculosControllers();
        ViajesControllers viajes = new ViajesControllers();
        TicketsControllers tickets = new TicketsControllers();
        

        while (control == true) {
            int opcion = JOptionPane.showOptionDialog(null, "Transportes el Roble", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones1, "Registro de nuevos Vehiculos");
            switch (opcion) {
                case 0:
                    int opcion1 = JOptionPane.showOptionDialog(null, "Registro de Clientes", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion1) {
                        case 0:
                            personas.nuevo();
                            break;
                        case 1:
                            personas.modificar();
                            break;
                        case 2:
                           personas.consulta();
                            break;
                        case 3:
                            personas.eliminar();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 1:
                    int opcion2 = JOptionPane.showOptionDialog(null, "Registro de Usuarios", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion2) {
                        case 0:
                            usuarios.nuevo();
                            break;
                        case 1:
                            usuarios.modificar();
                            break;
                        case 2:
                            usuarios.consulta();
                            break;
                        case 3:
                            usuarios.eliminar();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 2:
                    int opcion3 = JOptionPane.showOptionDialog(null, "Registro de Choferes", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion3) {
                        case 0:
                            choferes.nuevo();
                            break;
                        case 1:
                            choferes.modificar();
                            break;
                        case 2:
                            choferes.consulta();
                            break;
                        case 3:
                            choferes.eliminar();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 3:
                    int opcion4 = JOptionPane.showOptionDialog(null, "Registro de Vehiculos", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion4) {
                        case 0:
                            vehiculos.nuevo();
                            break;
                        case 1:
                            vehiculos.modificar();
                            break;
                        case 2:
                            vehiculos.consulta();
                            break;
                        case 3:
                            vehiculos.eliminar();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 4:
                    int opcion5 = JOptionPane.showOptionDialog(null, "Registro de Viajes", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                    switch (opcion5) {
                        case 0:
                            viajes.nuevo();
                            break;
                        case 1:
                            viajes.modificar();
                            break;
                        case 2:
                            viajes.consulta();
                            break;
                        case 3:
                            viajes.eliminar();
                            break;
                        case 4:
                            break;
                    }
                    break;
                case 5:
                    int opcion6 = JOptionPane.showOptionDialog(null, "Facturacion", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones2, "Consultar");
                    switch (opcion6) {
                        case 0:
                            tickets.nuevo();
                            break;
                        case 1:
                            tickets.consulta();
                            break;
                        case 2:
                            tickets.eliminar();
                            break;
                        case 3: 
                           
                            break;
                        case 4:
                            break;
                    }
                    break; 
                case 6:
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
