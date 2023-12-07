/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.avance1estructuradatos;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class Menu {

    public static void menu() {
        Arbol tree = new Arbol();
        boolean control = true;
        while (control == true) {
            String[] opciones = {"Estacionamiento", "Cliente", "Menu de desayunos", "Itinerario semanal", "Habitaciones", "Añadir clientes frecuentes", "Recorrer clientes", "Contar clientes", "Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Hotel Country Place", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Estacionamiento");
            switch (opcion) {
                case 0:
                    menuEstacionamiento();
                    break;
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuDesayuno();
                    break;
                case 3:
                    menuItinerario();
                    break;
                case 4:
                    menuHabitaciones();
                    break;
                case 5:
                    tree.InsertarCli();
                    break;
                case 6:
                    String[] opciones1 = {"InOrden", "PreOrden", "PostOrden", "Salir"};
                    int opcion1 = JOptionPane.showOptionDialog(null, "Impresion", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones1, "Inorden");
                    switch (opcion1) {
                        case 0:
                            tree.RecorrerInOrden();
                            break;
                        case 1: 
                            tree.RecorrerPreOrden();
                            break;
                        case 2:
                            tree.RecorrerPosOrden();
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Cantidad de clientes:  "+tree.ContarNodos());
                    break;
                case 8:
                    control = false;
                    break;

            }
        }
    }

    public static void menuEstacionamiento() {
        PilaEstacionamiento estacionamiento = new PilaEstacionamiento();
        int opcion;
        do {
            String[] opciones = {"Ingresar auto", "Obtener auto", "Vaciar estacionamiento", "Cantidad de autos estacionados", "Autos estacionados", "Verificar estacionado", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Menu de estacionamiento ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    try {
                    estacionamiento.Apilar();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 1:
                    estacionamiento.obtenerVehiculo();
                    break;
                case 2:
                    estacionamiento.vaciar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "La cantidad de autos estacionados es: " + estacionamiento.contar());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, estacionamiento.ImprimirPila());
                    break;
                case 5:
                    estacionamiento.verificar2();
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);
    }

    public static void menuCliente() {
        ColaClientes cliente = new ColaClientes();
        int opcion;
        do {
            String[] opciones = {"Ingresar cliente", "Asignar proximo cliente", "Vaciar cola clientes", "Ubicar cliente", "Cantidad de clientes", "Cliente con prioridad", "Imprimir cola", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Menu de estacionamiento ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    try {
                    cliente.Encolar();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 1:
                    cliente.Atender();
                    break;
                case 2:
                    cliente.vaciar();
                    break;
                case 3:
                    cliente.ubicar();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "La cantidad de clientes en espera es " + cliente.contar());
                    break;
                case 5:
                    cliente.verificarPrioridad();
                    break;
                case 6:
                    cliente.ImprimirCola();
                    break;
                case 7:
                    break;
            }
        } while (opcion != 7);
    }

    public static void menuDesayuno() {
        ListaSimpleCircular desayuno = new ListaSimpleCircular();
        int opcion;
        do {
            String[] opciones = {"Ingresar desayuno", "Imprimir desayunos", "Modificar desayuno", "Desayuno con menos calorias", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Menu de estacionamiento ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    try {
                    desayuno.Insertar();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 1:
                    JOptionPane.showMessageDialog(null, desayuno.imprimir());
                    break;
                case 2:
                    try {
                    desayuno.Modifica();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 3:
                    desayuno.menosCalorias();
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void menuItinerario() {
        ListaDobleCircular acti = new ListaDobleCircular();
        int opcion;
        do {
            String[] opciones = {"Ingresar actividad", "Imprimir actividades", "Eliminar actividad", "Tipo de actividad", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Menu de estacionamiento ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    try {
                    acti.Insertar();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 1:
                    String[] opciones1 = {"Ascendente", "Descendente", "Salir"};
                    int opcion1 = JOptionPane.showOptionDialog(null, "Menu de impresion", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones1, "Ascendente");
                    switch (opcion1) {
                        case 0:
                            JOptionPane.showMessageDialog(null, acti.imprimir());
                            break;
                        case 1:
                            JOptionPane.showMessageDialog(null, acti.imprimir2());
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 2:
                    try {
                    acti.Elimina();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 3:
                    String[] opciones3 = {"Diurna", "Nocturna", "Salir"};
                    int opcion3 = JOptionPane.showOptionDialog(null, "Menu de tipo", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones3, "Diurna");
                    switch (opcion3) {
                        case 0:
                            acti.imprimirD();
                            break;
                        case 1:
                            acti.imprimirN();
                            break;
                        case 2:
                            break;
                    }
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void menuHabitaciones() {
        ListaDobleCircular2 habitacion = new ListaDobleCircular2();
        int opcion;
        do {
            String[] opciones = {"Nuevas Habitaciones", "Reservas", "Imprimir disponibles", "Incrementar tarifa", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Menu de estacionamiento ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    try {
                    habitacion.Insertar();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 1:
                    try {
                    habitacion.Modifica();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 2:
                    habitacion.imprimir();
                    break;
                case 3:
                    try {
                    habitacion.IncremetaValor();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
                break;
                case 4:
                    break;
            }
        } while (opcion != 4);
    }
}
