/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class Menu {

    static Vehiculos vehi = new Vehiculos();
    static Mecanicos mec = new Mecanicos();
    static MecanicaBasica mb = new MecanicaBasica();
    static MecanicaDiesel md = new MecanicaDiesel();
    static MecanicaGasolina mg = new MecanicaGasolina();
    static MecanicaElectricos me = new MecanicaElectricos();
    static MecanicaPesada mp = new MecanicaPesada();
    static MecanicaMotos mm = new MecanicaMotos();
    static ModuloCitas reser = new ModuloCitas();
    static Reportes rep = new Reportes();

    public static void menu() {
        boolean control = true;
        while (control == true) {
            String[] opciones = {"Clientes", "Empleados", "Especialidades", "Reservas","Reportes","Salir"};
            int opcion = JOptionPane.showOptionDialog(null, "Taller Hermanos Valverde", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Clientes");
            switch (opcion) {
                case 0:
                    menuClientes();
                    break;
                case 1:
                    menuMecanicos();
                    break;
                case 2:
                    menuEspecialidad();
                    break;
                case 3:
                    menuReservas();
                case 4:
                    menuReportes();
                    break;
                case 5:
                    control = false;
                    break;
            }
        }
    }

    public static void menuClientes() {
        int opcion;
        do {
            String[] opciones = {"Agregar", "Consultar", "Modificar", "Eliminar", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Ingreso de clientes", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    try {
                    vehi.agregar();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El error es debido a " + e);
                }
                break;
                case 1:
                    vehi.consultar();
                    break;
                case 2:
                    try {
                    vehi.modificar();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El error es debido a " + e);
                }
                break;
                case 3:
                    try {
                    vehi.eliminar();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El error es debido a " + e);
                }
                break;
                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void menuMecanicos() {
        int opcion;
        do {
            String[] opciones = {"Agregar", "Consultar", "Modificar", "Eliminar", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Ingreso de empleados", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    try {
                    mec.agregar();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El error es debido a " + e);
                }
                break;
                case 1:
                    mec.consultar();
                    break;
                case 2:
                    try {
                    mec.modificar();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El error es debido a " + e);
                }
                break;
                case 3:
                    try {
                    mec.eliminar();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "El error es debido a " + e);
                }
                break;
                case 4:
                    break;
            }
        } while (opcion != 4);
    }

    public static void menuEspecialidad() {
        int opcion;
        do {
            String[] opciones = {"Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Menu de especialidades ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar vehiculo");
            switch (opcion) {
                case 0:
                    mb.menuBasica();
                    break;
                case 1:
                    md.menuDiesel();
                    break;
                case 2:
                    mg.menuGas();
                    break;
                case 3:
                    me.menuElectricos();
                    break;
                case 4:
                    mp.menuPesada();
                    break;
                case 5:
                    mm.menuMoto();
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);
    }

    public static void menuReservas() {
        int opcion;
        do {
            String[] opciones = {"Reserva", "Consultar Reservas", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Menu de Reservas ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Reserva");
            switch (opcion) {
                case 0:
                    reser.Reserva();
                    break;
                case 1:
                    reser.consultaReserva();
                    break;
                case 2:
                    break;
            }
        } while (opcion != 2);
    }
    public static void menuReportes(){
         int opcion;
        do {
            String[] opciones = {"Historial de Vehiculos", "Informacion clientes","Especialidades", "Citas por dia", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Menu de Reportes ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Ingresar Reporte");
            switch (opcion) {
                case 0:
                    vehi.mostrarHistorial(); //Historial de vehiculos
                    break;
                case 1:
                    vehi.buscarPorPlaca(); //Informacion de clientes
                    break;
                case 2:
                    rep.mostrarEspecialidades(); //Especialidades del taller
                    break;
                case 3:
                    reser.reporteReserva(); //Consultar las reservas por dia
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
}
}
