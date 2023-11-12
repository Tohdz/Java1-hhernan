/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author XPC
 */
public class ModuloCitas {

    private static ArrayList fechas = new ArrayList();
    private static ArrayList Lunes = new ArrayList();
    private static ArrayList Martes = new ArrayList();
    private static ArrayList Miercoles = new ArrayList();
    private static ArrayList Jueves = new ArrayList();
    private static ArrayList Viernes = new ArrayList();
    private static ArrayList Sabado = new ArrayList();
    private static ArrayList Domingo = new ArrayList();
    String fecha_dia;
    String placaC;

    public ModuloCitas() {
    }

    public ModuloCitas(String fecha_dia, String placaC) {
        this.fecha_dia = fecha_dia;
        this.placaC = placaC;
    }

    public static ArrayList<String> getFechas() {
        return fechas;
    }

    public static void setFechas(ArrayList<String> fechas) {
        ModuloCitas.fechas = fechas;
    }

    public static ArrayList getLunes() {
        return Lunes;
    }

    public static void setLunes(ArrayList Lunes) {
        ModuloCitas.Lunes = Lunes;
    }

    public static ArrayList getMartes() {
        return Martes;
    }

    public static void setMartes(ArrayList Martes) {
        ModuloCitas.Martes = Martes;
    }

    public static ArrayList getMiercoles() {
        return Miercoles;
    }

    public static void setMiercoles(ArrayList Miercoles) {
        ModuloCitas.Miercoles = Miercoles;
    }

    public static ArrayList getJueves() {
        return Jueves;
    }

    public static void setJueves(ArrayList Jueves) {
        ModuloCitas.Jueves = Jueves;
    }

    public static ArrayList getViernes() {
        return Viernes;
    }

    public static void setViernes(ArrayList Viernes) {
        ModuloCitas.Viernes = Viernes;
    }

    public static ArrayList getSabado() {
        return Sabado;
    }

    public static void setSabado(ArrayList Sabado) {
        ModuloCitas.Sabado = Sabado;
    }

    public static ArrayList getDomingo() {
        return Domingo;
    }

    public static void setDomingo(ArrayList Domingo) {
        ModuloCitas.Domingo = Domingo;
    }

    public String getFecha_dia() {
        return fecha_dia;
    }

    public void setFecha_dia(String fecha_dia) {
        this.fecha_dia = fecha_dia;
    }

    public String getPlacaC() {
        return placaC;
    }

    public void setPlacaC(String placaC) {
        this.placaC = placaC;
    }

    @Override
    public String toString() {
        return "fecha_dia=" + fecha_dia + ", placaC=" + placaC + "==>";
    }

    public void Reserva() {
        int opcion;
        do {
            String[] opciones = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Dias de la Reserva ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Lunes");
            switch (opcion) {
                case 0:
                    String placas = "Placas disponibles:" + "\n";
                    for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
                        placas = placas + Vehiculos.getAutos().get(i).getPlaca() + "\n";
                        String placaAgre = JOptionPane.showInputDialog(placas + "Digite la placa del cliente a agregar:");
                        if (placaAgre.equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                            placaC = Vehiculos.getAutos().get(i).getPlaca();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    String fechabusq = JOptionPane.showInputDialog(" Ingrese aqui la fecha del vehiculo:");
                    while (fechas.contains(fechabusq)) {
                        JOptionPane.showMessageDialog(null, "La fecha está ocupada");
                        fechabusq = JOptionPane.showInputDialog("Ingrese una fecha de ingreso valida:");
                    }
                    fecha_dia = fechabusq;
                    fechas.add(fecha_dia);
                    JOptionPane.showMessageDialog(null, "Cita ingresada correctamente.");
                    ModuloCitas reserva = new ModuloCitas(fecha_dia, placaC);
                    Lunes.add(reserva);
                    break;
                case 1:
                    String placas1 = "Placas disponibles:" + "\n";
                    for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
                        placas1 = placas1 + Vehiculos.getAutos().get(i).getPlaca() + "\n";
                        String placaAgre = JOptionPane.showInputDialog(placas1 + "Digite la placa del cliente a agregar:");
                        if (placaAgre.equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                            placaC = Vehiculos.getAutos().get(i).getPlaca();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    String fechabusq1 = JOptionPane.showInputDialog(" Ingrese aqui la fecha del vehiculo:");
                    while (fechas.contains(fechabusq1)) {
                        JOptionPane.showMessageDialog(null, "La fecha está ocupada");
                        fechabusq1 = JOptionPane.showInputDialog("Ingrese una fecha de ingreso valida:");
                    }
                    fecha_dia = fechabusq1;
                    fechas.add(fecha_dia);
                    JOptionPane.showMessageDialog(null, "Cita ingresada correctamente.");
                    ModuloCitas reserva1 = new ModuloCitas(fecha_dia, placaC);
                    Martes.add(reserva1);
                    break;
                case 2:
                    String placas2 = "Placas disponibles:" + "\n";
                    for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
                        placas2 = placas2 + Vehiculos.getAutos().get(i).getPlaca() + "\n";
                        String placaAgre = JOptionPane.showInputDialog(placas2 + "Digite la placa del cliente a agregar:");
                        if (placaAgre.equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                            placaC = Vehiculos.getAutos().get(i).getPlaca();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    String fechabusq2 = JOptionPane.showInputDialog(" Ingrese aqui la fecha del vehiculo:");
                    while (fechas.contains(fechabusq2)) {
                        JOptionPane.showMessageDialog(null, "La fecha está ocupada");
                        fechabusq2 = JOptionPane.showInputDialog("Ingrese una fecha de ingreso valida:");
                    }
                    fecha_dia = fechabusq2;
                    fechas.add(fecha_dia);
                    JOptionPane.showMessageDialog(null, "Cita ingresada correctamente.");
                    ModuloCitas reserva2 = new ModuloCitas(fecha_dia, placaC);
                    Miercoles.add(reserva2);
                    break;
                case 3:
                    String placas3 = "Placas disponibles:" + "\n";
                    for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
                        placas3 = placas3 + Vehiculos.getAutos().get(i).getPlaca() + "\n";
                        String placaAgre = JOptionPane.showInputDialog(placas3 + "Digite la placa del cliente a agregar:");
                        if (placaAgre.equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                            placaC = Vehiculos.getAutos().get(i).getPlaca();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    String fechabusq3 = JOptionPane.showInputDialog(" Ingrese aqui la fecha del vehiculo:");
                    while (fechas.contains(fechabusq3)) {
                        JOptionPane.showMessageDialog(null, "La fecha está ocupada");
                        fechabusq3 = JOptionPane.showInputDialog("Ingrese una fecha de ingreso valida:");
                    }
                    fecha_dia = fechabusq3;
                    fechas.add(fecha_dia);
                    JOptionPane.showMessageDialog(null, "Cita ingresada correctamente.");
                    ModuloCitas reserva3 = new ModuloCitas(fecha_dia, placaC);
                    Jueves.add(reserva3);
                    break;
                case 4:
                    String placas4 = "Placas disponibles:" + "\n";
                    for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
                        placas4 = placas4 + Vehiculos.getAutos().get(i).getPlaca() + "\n";
                        String placaAgre = JOptionPane.showInputDialog(placas4 + "Digite la placa del cliente a agregar:");
                        if (placaAgre.equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                            placaC = Vehiculos.getAutos().get(i).getPlaca();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    String fechabusq4 = JOptionPane.showInputDialog(" Ingrese aqui la fecha del vehiculo:");
                    while (fechas.contains(fechabusq4)) {
                        JOptionPane.showMessageDialog(null, "La fecha está ocupada");
                        fechabusq4 = JOptionPane.showInputDialog("Ingrese una fecha de ingreso valida:");
                    }
                    fecha_dia = fechabusq4;
                    fechas.add(fecha_dia);
                    JOptionPane.showMessageDialog(null, "Cita ingresada correctamente.");
                    ModuloCitas reserva4 = new ModuloCitas(fecha_dia, placaC);
                    Viernes.add(reserva4);
                    break;
                case 5:
                    String placas5 = "Placas disponibles:" + "\n";
                    for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
                        placas5 = placas5 + Vehiculos.getAutos().get(i).getPlaca() + "\n";
                        String placaAgre = JOptionPane.showInputDialog(placas5 + "Digite la placa del cliente a agregar:");
                        if (placaAgre.equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                            placaC = Vehiculos.getAutos().get(i).getPlaca();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    String fechabusq5 = JOptionPane.showInputDialog(" Ingrese aqui la fecha del vehiculo:");
                    while (fechas.contains(fechabusq5)) {
                        JOptionPane.showMessageDialog(null, "La fecha está ocupada");
                        fechabusq5 = JOptionPane.showInputDialog("Ingrese una fecha de ingreso valida:");
                    }
                    fecha_dia = fechabusq5;
                    fechas.add(fecha_dia);
                    JOptionPane.showMessageDialog(null, "Cita ingresada correctamente.");
                    ModuloCitas reserva5 = new ModuloCitas(fecha_dia, placaC);
                    Sabado.add(reserva5);
                    break;
                case 6:
                    String placas6 = "Placas disponibles:" + "\n";
                    for (int i = 0; i < Vehiculos.getAutos().size(); i++) {
                        placas6 = placas6 + Vehiculos.getAutos().get(i).getPlaca() + "\n";
                        String placaAgre = JOptionPane.showInputDialog(placas6 + "Digite la placa del cliente a agregar:");
                        if (placaAgre.equalsIgnoreCase(Vehiculos.getAutos().get(i).getPlaca())) {
                            placaC = Vehiculos.getAutos().get(i).getPlaca();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    String fechabusq6 = JOptionPane.showInputDialog(" Ingrese aqui la fecha del vehiculo:");
                    while (fechas.contains(fechabusq6)) {
                        JOptionPane.showMessageDialog(null, "La fecha está ocupada");
                        fechabusq6 = JOptionPane.showInputDialog("Ingrese una fecha de ingreso valida:");
                    }
                    fecha_dia = fechabusq6;
                    fechas.add(fecha_dia);
                    JOptionPane.showMessageDialog(null, "Cita ingresada correctamente.");
                    ModuloCitas reserva6 = new ModuloCitas(fecha_dia, placaC);
                    Domingo.add(reserva6);
                    break;
                case 7:
                    break;
            }
        } while (opcion != 7);
    }

    public void consultaReserva() {
        int opcion;
        do {
            String[] opciones = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo","Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Consulta de reserva semanal ", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Informe");
            switch (opcion) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Lunes"+"\n"+Lunes);
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "Martes"+"\n"+Martes);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Miercoles"+"\n"+Miercoles);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Jueves"+"\n"+Jueves);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Viernes"+"\n"+Viernes);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Sabado"+"\n"+Sabado);
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Domingo"+"\n"+Domingo);
                    break;
                case 7:
                    break;
            }
        } while (opcion != 7);
    }

    public void reporteReserva() {
        
    String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo", "Salir"};
    int opcion;
    do {
        opcion = JOptionPane.showOptionDialog(null, "Consulta de reserva semanal", "Seleccionar día", 0, JOptionPane.QUESTION_MESSAGE, null, diasSemana, diasSemana[0]);
        if (opcion >= 0 && opcion < diasSemana.length - 1) {
            ArrayList citas = null;
            switch (opcion) {
                case 0:
                    citas = Lunes;
                    break;
                case 1:
                    citas = Martes;
                    break;
                case 2:
                    citas = Miercoles;
                    break;
                case 3:
                    citas = Jueves;
                    break;
                case 4:
                    citas = Viernes;
                    break;
                case 5:
                    citas = Sabado;
                    break;
                case 6:
                    citas = Domingo;
                    break;
            }
            if (citas != null && !citas.isEmpty()) {
                StringBuilder mensaje = new StringBuilder(diasSemana[opcion] + ":\n");
                for (Object cita : citas) {
                    mensaje.append(cita).append("\n");
                }
                JOptionPane.showMessageDialog(null, mensaje.toString());
            } else {
                JOptionPane.showMessageDialog(null, "No hay citas programadas para " + diasSemana[opcion] + ".");
            }
        }
    } while (opcion != diasSemana.length - 1); // Salir cuando se selecciona la última opción "Salir"
}

    
}
