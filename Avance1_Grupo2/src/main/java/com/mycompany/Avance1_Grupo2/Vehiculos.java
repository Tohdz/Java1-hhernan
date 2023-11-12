/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Avance1_Grupo2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class Vehiculos extends Clientes implements Interfaces {

    private static ArrayList<Vehiculos> autos = new ArrayList();

    String placa;
    String modelo;
    String marca;
    String color;
    int año;
    String tipoGasolina;
    String especialidadReferencia;
    int cont_servicios; //Contador de la cantidad de servicios que elige el cliente

    public Vehiculos() {
    }

    public Vehiculos(String placa, String modelo, String marca, String color, int año, String tipoGasolina, String especialidadReferencia, int cedula, String nombre, String direccion, int telefono, String correo, int cont_servicios) {
        super(cedula, nombre, direccion, telefono, correo);
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.año = año;
        this.tipoGasolina = tipoGasolina;
        this.especialidadReferencia = especialidadReferencia;
        this.cont_servicios = 1;
    }

    public static ArrayList<Vehiculos> getAutos() {
        return autos;
    }

    public static void setAutos(ArrayList<Vehiculos> autos) {
        Vehiculos.autos = autos;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public String getEspecialidadReferencia() {
        return especialidadReferencia;
    }

    public void setEspecialidadReferencia(String especialidadReferencia) {
        this.especialidadReferencia = especialidadReferencia;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCont_servicios() {
        return cont_servicios;
    }

    public void setCont_servicios(int cont_servicios) {
        this.cont_servicios = cont_servicios;
    }

    public void incrementarContador() {
        cont_servicios++;
    }

    @Override
    public String toString() {
        return "Placa = " + placa + "  Modelo = " + modelo + "  Marca = " + marca + "  Color = " + color + "  Año = " + año + "  Tipo de Combustible = " + tipoGasolina + "  Especialidad de Referencia = " + especialidadReferencia + "  Cedula = " + cedula + "  Nombre = " + nombre + "  Direccion = " + direccion + "  Telefono = " + telefono + "  Correo = " + correo + "==>";
    }

    @Override
    public boolean controlcadenas(String cadena) {
        int cont = 0;
        cont = 0;
        int ascii;
        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            ascii = (int) caracter;
            if ((ascii < 65 || ascii > 90) && (ascii < 97 || ascii > 122)) {
                cont++;
            }
        }
        if (cont >= 1) {
            JOptionPane.showMessageDialog(null, "Ingrese caracter valido");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void agregar() {
        cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la Identificacion del cliente:"));
        nombre = JOptionPane.showInputDialog("Digite el nombre del cliente:");
        direccion = JOptionPane.showInputDialog("Digite la direccion del cliente:");
        telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del cliente:"));
        correo = JOptionPane.showInputDialog("Digite el correo electronico del cliente:");
        placa = JOptionPane.showInputDialog("Digite la placa del vehiculo:");
        modelo = JOptionPane.showInputDialog("Digite el modelo del vehiculo:");
        marca = JOptionPane.showInputDialog("Digite la marca del vehiculo:");
        color = JOptionPane.showInputDialog("Digite el color del vehiculo:");
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año del vehiculo:"));
        tipoGasolina = JOptionPane.showInputDialog("Digite el tipo de combustible del vehiculo:");
        especialidadReferencia = JOptionPane.showInputDialog("Digite la especialidad por la que viene el vehiculo:");
        Vehiculos auto = new Vehiculos(placa, modelo, marca, color, año, tipoGasolina, especialidadReferencia, cedula, nombre, direccion, telefono, correo, cont_servicios);
        autos.add(auto);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo cliente.");

    }

    @Override
    public void consultar() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < autos.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + autos.get(i).getCedula() + "\n" + "Nombre: " + autos.get(i).getNombre() + "\n" + "Direccion: " + autos.get(i).getDireccion() + "\n" + "Telefono: " + autos.get(i).getTelefono() + "\n" + "Correo: " + autos.get(i).getCorreo() + "\n" + "Placa: " + autos.get(i).getPlaca() + "\n" + "Modelo: " + autos.get(i).getModelo() + "\n" + "Marca: " + autos.get(i).getMarca() + "\n" + "Color: " + autos.get(i).getColor() + "\n" + "Año: " + autos.get(i).getAño() + "\n" + "Tipo de combustible: " + autos.get(i).getTipoGasolina() + "\n" + "Especialidad: " + autos.get(i).getEspecialidadReferencia() + "\n");
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < autos.size(); i++) {
                    info1 = info1 + ("Numero de Identificacion: " + autos.get(i).getCedula() + "\n" + "Nombre: " + autos.get(i).getNombre() + "\n" + "Direccion: " + autos.get(i).getDireccion() + "\n" + "Telefono: " + autos.get(i).getTelefono() + "\n" + "Correo: " + autos.get(i).getCorreo() + "\n" + "Placa: " + autos.get(i).getPlaca() + "\n" + "Modelo: " + autos.get(i).getModelo() + "\n" + "Marca: " + autos.get(i).getMarca() + "\n" + "Color: " + autos.get(i).getColor() + "\n" + "Año: " + autos.get(i).getAño() + "\n" + "Tipo de combustible: " + autos.get(i).getTipoGasolina() + "\n" + "Especialidad: " + autos.get(i).getEspecialidadReferencia() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
    }

    @Override
    public void modificar() {
        String buscarPlaca = JOptionPane.showInputDialog("Digite la placa a buscar: ");
        for (int i = 0; i < autos.size(); i++) {
            if (buscarPlaca.equalsIgnoreCase(autos.get(i).getPlaca())) {
                String[] ediciones = {"Numero de Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Placa", "Modelo", "Marca", "Color", "Año", "Tipo de combustible", "Especialidad", "Salir"};
                int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero de Identificacion");
                switch (editar) {
                    case 0:
                        int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));
                        int nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                        if (busqueda == autos.get(i).getCedula()) {
                            autos.get(i).setCedula(nuevoid);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 1:
                        String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar: ");
                        String nuevonom = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                        if (busqueda1.equalsIgnoreCase(autos.get(i).getNombre())) {
                            autos.get(i).setNombre(nuevonom);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 2:
                        String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese la direccion a buscar: ");
                        String nuevodir = JOptionPane.showInputDialog(null, "Ingrese la nueva direccion: ");
                        if (busqueda2.equalsIgnoreCase(autos.get(i).getDireccion())) {
                            autos.get(i).setDireccion(nuevodir);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 3:
                        int busqueda3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono a buscar: "));
                        int nuevotel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: "));
                        if (busqueda3 == autos.get(i).getTelefono()) {
                            autos.get(i).setTelefono(nuevotel);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 4:
                        String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese el correo a buscar: ");
                        String nuevocorr = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                        if (busqueda4.equalsIgnoreCase(autos.get(i).getCorreo())) {
                            autos.get(i).setCorreo(nuevocorr);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 5:
                        String busqueda5 = JOptionPane.showInputDialog(null, "Ingrese la placa a buscar: ");
                        String nuevopla = JOptionPane.showInputDialog(null, "Ingrese la nueva placa: ");
                        if (busqueda5.equalsIgnoreCase(autos.get(i).getPlaca())) {
                            autos.get(i).setPlaca(nuevopla);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 6:
                        String busqueda6 = JOptionPane.showInputDialog(null, "Ingrese el modelo a buscar: ");
                        String nuevomod = JOptionPane.showInputDialog(null, "Ingrese el nuevo modelo: ");
                        if (busqueda6.equalsIgnoreCase(autos.get(i).getModelo())) {
                            autos.get(i).setModelo(nuevomod);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 7:
                        String busqueda7 = JOptionPane.showInputDialog(null, "Ingrese la marca a buscar: ");
                        String nuevomar = JOptionPane.showInputDialog(null, "Ingrese la nueva marca: ");
                        if (busqueda7.equalsIgnoreCase(autos.get(i).getMarca())) {
                            autos.get(i).setMarca(nuevomar);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 8:
                        String busqueda8 = JOptionPane.showInputDialog(null, "Ingrese el color a buscar: ");
                        String nuevocol = JOptionPane.showInputDialog(null, "Ingrese el nuevo color: ");
                        if (busqueda8.equalsIgnoreCase(autos.get(i).getColor())) {
                            autos.get(i).setColor(nuevocol);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 9:
                        int busqueda9 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el año a buscar: "));
                        int nuevoano = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo año: "));
                        if (busqueda9 == autos.get(i).getAño()) {
                            autos.get(i).setAño(nuevoano);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 10:
                        String busqueda10 = JOptionPane.showInputDialog(null, "Ingrese el combustible a buscar: ");
                        String nuevocom = JOptionPane.showInputDialog(null, "Ingrese el nuevo tipo de combustible: ");
                        if (busqueda10.equalsIgnoreCase(autos.get(i).getTipoGasolina())) {
                            autos.get(i).setTipoGasolina(nuevocom);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                    case 11:
                        String busqueda11 = JOptionPane.showInputDialog(null, "Ingrese la especialidad a buscar: ");
                        String nuevoesp = JOptionPane.showInputDialog(null, "Ingrese la nueva especialidad: ");
                        if (busqueda11.equalsIgnoreCase(autos.get(i).getEspecialidadReferencia())) {
                            autos.get(i).setEspecialidadReferencia(nuevoesp);
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                        }
                        break;
                }
            } else {
                JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
            }
        }
    }

    @Override
    public void eliminar() {
        int busqueda6 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
        for (int i = 0; i < autos.size(); i++) {
            if (busqueda6 == autos.get(i).getCedula()) {
                autos.remove(i);
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                break;
            }
        }
    }

    public void buscarPorPlaca() {
        String placaBuscada = JOptionPane.showInputDialog("Ingrese el número de placa a buscar:");
        boolean encontrado = false;

        for (Vehiculos vehiculo : autos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placaBuscada)) {
                JOptionPane.showMessageDialog(null, "Vehículo encontrado:\n" + vehiculo.toString());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "No se encontró ningún vehículo con la placa especificada.");
        }
    }

    public void mostrarHistorial() {
        StringBuilder historial = new StringBuilder("Historial de Vehículos del Taller:\n");

        for (Vehiculos vehiculo : autos) {
            historial.append("Placa: ").append(vehiculo.getPlaca()).append("\n");
            historial.append("Cliente: ").append(vehiculo.getNombre()).append("\n");
            historial.append("Especialidad de referencia: ").append(vehiculo.getEspecialidadReferencia()).append("\n");
            historial.append("------------------------------\n");
        }

        JOptionPane.showMessageDialog(null, historial.toString());
    }

}
