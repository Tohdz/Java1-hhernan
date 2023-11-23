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
public class Mecanicos extends Clientes implements Interfaces {
    
    
    double incentivo=0.10;

    private static ArrayList<Mecanicos> mecBasica = new ArrayList();
    private static ArrayList<Mecanicos> mecDiesel = new ArrayList();
    private static ArrayList<Mecanicos> mecGasolina = new ArrayList();
    private static ArrayList<Mecanicos> mecElectricos = new ArrayList();
    private static ArrayList<Mecanicos> mecPesada = new ArrayList();
    private static ArrayList<Mecanicos> mecMotos = new ArrayList();
    
    public Mecanicos() {
    }

    public Mecanicos(double incentivo, int cedula, String nombre, String direccion, int telefono, String correo) {
        super(cedula, nombre, direccion, telefono, correo);
        this.incentivo = incentivo;
    }

    public double getIncentivo() {
        return incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo;
    }

    public static ArrayList<Mecanicos> getMecBasica() {
        return mecBasica;
    }

    public static void setMecBasica(ArrayList<Mecanicos> mecBasica) {
        Mecanicos.mecBasica = mecBasica;
    }

    public static ArrayList<Mecanicos> getMecDiesel() {
        return mecDiesel;
    }

    public static void setMecDiesel(ArrayList<Mecanicos> mecDiesel) {
        Mecanicos.mecDiesel = mecDiesel;
    }

    public static ArrayList<Mecanicos> getMecGasolina() {
        return mecGasolina;
    }

    public static void setMecGasolina(ArrayList<Mecanicos> mecGasolina) {
        Mecanicos.mecGasolina = mecGasolina;
    }

    public static ArrayList<Mecanicos> getMecElectricos() {
        return mecElectricos;
    }

    public static void setMecElectricos(ArrayList<Mecanicos> mecElectricos) {
        Mecanicos.mecElectricos = mecElectricos;
    }

    public static ArrayList<Mecanicos> getMecPesada() {
        return mecPesada;
    }

    public static void setMecPesada(ArrayList<Mecanicos> mecPesada) {
        Mecanicos.mecPesada = mecPesada;
    }

    public static ArrayList<Mecanicos> getMecMotos() {
        return mecMotos;
    }

    public static void setMecMotos(ArrayList<Mecanicos> mecMotos) {
        Mecanicos.mecMotos = mecMotos;
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

    @Override
    public String toString() {
        return "Cedula = " + cedula + "  Nombre = " + nombre + "  Direccion = " + direccion + "  Telefono = " + telefono + "  Correo = " + correo+ "incentivo=" + incentivo + "==>";
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
        int opcion;
        do {
            String[] opciones = {"Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Ingreso por categoria", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Mecanica Basica");
            switch (opcion) {
                case 0:
                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la Identificacion del mecanico:"));
                    nombre = JOptionPane.showInputDialog("Digite el nombre del mecanico:");
                    direccion = JOptionPane.showInputDialog("Digite la direccion del mecanico:");
                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del mecanico:"));
                    correo = JOptionPane.showInputDialog("Digite el correo electronico del mecanico:");
                    Mecanicos mec0 = new Mecanicos(incentivo, cedula, nombre, direccion, telefono, correo);
                    mecBasica.add(mec0);
                    JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo empleado.");
                    break;
                case 1:
                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la Identificacion del mecanico:"));
                    nombre = JOptionPane.showInputDialog("Digite el nombre del mecanico:");
                    direccion = JOptionPane.showInputDialog("Digite la direccion del mecanico:");
                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del mecanico:"));
                    correo = JOptionPane.showInputDialog("Digite el correo electronico del mecanico:");
                    Mecanicos mec1 = new Mecanicos(incentivo, cedula, nombre, direccion, telefono, correo);
                    mecDiesel.add(mec1);
                    JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo empleado.");
                    break;
                case 2:
                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la Identificacion del mecanico:"));
                    nombre = JOptionPane.showInputDialog("Digite el nombre del mecanico:");
                    direccion = JOptionPane.showInputDialog("Digite la direccion del mecanico:");
                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del mecanico:"));
                    correo = JOptionPane.showInputDialog("Digite el correo electronico del mecanico:");
                    Mecanicos mec2 = new Mecanicos(incentivo, cedula, nombre, direccion, telefono, correo);
                    mecGasolina.add(mec2);
                    JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo empleado.");
                    break;
                case 3:
                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la Identificacion del mecanico:"));
                    nombre = JOptionPane.showInputDialog("Digite el nombre del mecanico:");
                    direccion = JOptionPane.showInputDialog("Digite la direccion del mecanico:");
                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del mecanico:"));
                    correo = JOptionPane.showInputDialog("Digite el correo electronico del mecanico:");
                    Mecanicos mec3 = new Mecanicos(incentivo, cedula, nombre, direccion, telefono, correo);
                    mecElectricos.add(mec3);
                    JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo empleado.");
                    break;
                case 4:
                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la Identificacion del mecanico:"));
                    nombre = JOptionPane.showInputDialog("Digite el nombre del mecanico:");
                    direccion = JOptionPane.showInputDialog("Digite la direccion del mecanico:");
                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del mecanico:"));
                    correo = JOptionPane.showInputDialog("Digite el correo electronico del mecanico:");
                    Mecanicos mec4 = new Mecanicos(incentivo, cedula, nombre, direccion, telefono, correo);
                    mecPesada.add(mec4);
                    JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo empleado.");
                    break;
                case 5:
                    cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite la Identificacion del mecanico:"));
                    nombre = JOptionPane.showInputDialog("Digite el nombre del mecanico:");
                    direccion = JOptionPane.showInputDialog("Digite la direccion del mecanico:");
                    telefono = Integer.parseInt(JOptionPane.showInputDialog("Digite el telefono del mecanico:"));
                    correo = JOptionPane.showInputDialog("Digite el correo electronico del mecanico:");
                    Mecanicos mec5 = new Mecanicos(incentivo, cedula, nombre, direccion, telefono, correo);
                    mecMotos.add(mec5);
                    JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo empleado.");
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);
    }

    @Override
    public void consultar() {
        int opcion;
        do {
            String[] opciones = {"Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Consulta por categoria", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Mecanica Basica");
            switch (opcion) {
                case 0:
                    String[] ediciones = {"Individual", "Informe"};
                    int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
                    switch (editar) {
                        case 0:
                            for (int i = 0; i < mecBasica.size(); i++) {
                                JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + mecBasica.get(i).getCedula() + "\n" + "Nombre: " + mecBasica.get(i).getNombre() + "\n" + "Direccion: " + mecBasica.get(i).getDireccion() + "\n" + "Telefono: " + mecBasica.get(i).getTelefono() + "\n" + "Correo: " + mecBasica.get(i).getCorreo() + "\n");
                            }
                            break;
                        case 1:
                            String info1 = "";
                            for (int i = 0; i < mecBasica.size(); i++) {
                                info1 = info1 + ("Numero de Identificacion: " + mecBasica.get(i).getCedula() + "\n" + "Nombre: " + mecBasica.get(i).getNombre() + "\n" + "Direccion: " + mecBasica.get(i).getDireccion() + "\n" + "Telefono: " + mecBasica.get(i).getTelefono() + "\n" + "Correo: " + mecBasica.get(i).getCorreo() + "\n");
                            }
                            JOptionPane.showMessageDialog(null, info1);
                            break;
                    }
                    break;
                case 1:
                    String[] ediciones1 = {"Individual", "Informe"};
                    int editar1 = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones1, "Individual");
                    switch (editar1) {
                        case 0:
                            for (int i = 0; i < mecDiesel.size(); i++) {
                                JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + mecDiesel.get(i).getCedula() + "\n" + "Nombre: " + mecDiesel.get(i).getNombre() + "\n" + "Direccion: " + mecDiesel.get(i).getDireccion() + "\n" + "Telefono: " + mecDiesel.get(i).getTelefono() + "\n" + "Correo: " + mecDiesel.get(i).getCorreo() + "\n");
                            }
                            break;
                        case 1:
                            String info1 = "";
                            for (int i = 0; i < mecDiesel.size(); i++) {
                                info1 = info1 + ("Numero de Identificacion: " + mecDiesel.get(i).getCedula() + "\n" + "Nombre: " + mecDiesel.get(i).getNombre() + "\n" + "Direccion: " + mecDiesel.get(i).getDireccion() + "\n" + "Telefono: " + mecDiesel.get(i).getTelefono() + "\n" + "Correo: " + mecDiesel.get(i).getCorreo() + "\n");
                            }
                            JOptionPane.showMessageDialog(null, info1);
                            break;
                    }
                    break;
                case 2:
                    String[] ediciones2 = {"Individual", "Informe"};
                    int editar2 = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones2, "Individual");
                    switch (editar2) {
                        case 0:
                            for (int i = 0; i < mecGasolina.size(); i++) {
                                JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + mecGasolina.get(i).getCedula() + "\n" + "Nombre: " + mecGasolina.get(i).getNombre() + "\n" + "Direccion: " + mecGasolina.get(i).getDireccion() + "\n" + "Telefono: " + mecGasolina.get(i).getTelefono() + "\n" + "Correo: " + mecGasolina.get(i).getCorreo() + "\n");
                            }
                            break;
                        case 1:
                            String info1 = "";
                            for (int i = 0; i < mecGasolina.size(); i++) {
                                info1 = info1 + ("Numero de Identificacion: " + mecGasolina.get(i).getCedula() + "\n" + "Nombre: " + mecGasolina.get(i).getNombre() + "\n" + "Direccion: " + mecGasolina.get(i).getDireccion() + "\n" + "Telefono: " + mecGasolina.get(i).getTelefono() + "\n" + "Correo: " + mecGasolina.get(i).getCorreo() + "\n");
                            }
                            JOptionPane.showMessageDialog(null, info1);
                            break;
                    }
                    break;
                case 3:
                    String[] ediciones3 = {"Individual", "Informe"};
                    int editar3 = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones3, "Individual");
                    switch (editar3) {
                        case 0:
                            for (int i = 0; i < mecElectricos.size(); i++) {
                                JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + mecElectricos.get(i).getCedula() + "\n" + "Nombre: " + mecElectricos.get(i).getNombre() + "\n" + "Direccion: " + mecElectricos.get(i).getDireccion() + "\n" + "Telefono: " + mecElectricos.get(i).getTelefono() + "\n" + "Correo: " + mecElectricos.get(i).getCorreo() + "\n");
                            }
                            break;
                        case 1:
                            String info1 = "";
                            for (int i = 0; i < mecElectricos.size(); i++) {
                                info1 = info1 + ("Numero de Identificacion: " + mecElectricos.get(i).getCedula() + "\n" + "Nombre: " + mecElectricos.get(i).getNombre() + "\n" + "Direccion: " + mecElectricos.get(i).getDireccion() + "\n" + "Telefono: " + mecElectricos.get(i).getTelefono() + "\n" + "Correo: " + mecElectricos.get(i).getCorreo() + "\n");
                            }
                            JOptionPane.showMessageDialog(null, info1);
                            break;
                    }
                    break;
                case 4:
                    String[] ediciones4 = {"Individual", "Informe"};
                    int editar4 = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones4, "Individual");
                    switch (editar4) {
                        case 0:
                            for (int i = 0; i < mecPesada.size(); i++) {
                                JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + mecPesada.get(i).getCedula() + "\n" + "Nombre: " + mecPesada.get(i).getNombre() + "\n" + "Direccion: " + mecPesada.get(i).getDireccion() + "\n" + "Telefono: " + mecPesada.get(i).getTelefono() + "\n" + "Correo: " + mecPesada.get(i).getCorreo() + "\n");
                            }
                            break;
                        case 1:
                            String info1 = "";
                            for (int i = 0; i < mecPesada.size(); i++) {
                                info1 = info1 + ("Numero de Identificacion: " + mecPesada.get(i).getCedula() + "\n" + "Nombre: " + mecPesada.get(i).getNombre() + "\n" + "Direccion: " + mecPesada.get(i).getDireccion() + "\n" + "Telefono: " + mecPesada.get(i).getTelefono() + "\n" + "Correo: " + mecPesada.get(i).getCorreo() + "\n");
                            }
                            JOptionPane.showMessageDialog(null, info1);
                            break;
                    }
                    break;
                case 5:
                    String[] ediciones5 = {"Individual", "Informe"};
                    int editar5 = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones5, "Individual");
                    switch (editar5) {
                        case 0:
                            for (int i = 0; i < mecMotos.size(); i++) {
                                JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + mecMotos.get(i).getCedula() + "\n" + "Nombre: " + mecMotos.get(i).getNombre() + "\n" + "Direccion: " + mecMotos.get(i).getDireccion() + "\n" + "Telefono: " + mecMotos.get(i).getTelefono() + "\n" + "Correo: " + mecMotos.get(i).getCorreo() + "\n");
                            }
                            break;
                        case 1:
                            String info1 = "";
                            for (int i = 0; i < mecMotos.size(); i++) {
                                info1 = info1 + ("Numero de Identificacion: " + mecMotos.get(i).getCedula() + "\n" + "Nombre: " + mecMotos.get(i).getNombre() + "\n" + "Direccion: " + mecMotos.get(i).getDireccion() + "\n" + "Telefono: " + mecMotos.get(i).getTelefono() + "\n" + "Correo: " + mecMotos.get(i).getCorreo() + "\n");
                            }
                            JOptionPane.showMessageDialog(null, info1);
                            break;
                    }
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);
    }

    @Override
    public void modificar() {
        int opcion;
        do {
            String[] opciones = {"Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Ingreso por categoria", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Mecanica Basica");
            switch (opcion) {
                case 0:
                    int ced0 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a buscar: "));
                    for (int i = 0; i < mecBasica.size(); i++) {
                        if (ced0 == mecBasica.get(i).getCedula()) {
                            String[] ediciones = {"Numero de Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Salir"};
                            int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero de Identificacion");
                            switch (editar) {
                                case 0:
                                    int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));
                                    int nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                                    if (busqueda == mecBasica.get(i).getCedula()) {
                                        mecBasica.get(i).setCedula(nuevoid);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 1:
                                    String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar: ");
                                    String nuevonom = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                                    if (busqueda1.equalsIgnoreCase(mecBasica.get(i).getNombre())) {
                                        mecBasica.get(i).setNombre(nuevonom);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 2:
                                    String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese la direccion a buscar: ");
                                    String nuevodir = JOptionPane.showInputDialog(null, "Ingrese la nueva direccion: ");
                                    if (busqueda2.equalsIgnoreCase(mecBasica.get(i).getDireccion())) {
                                        mecBasica.get(i).setDireccion(nuevodir);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 3:
                                    int busqueda3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono a buscar: "));
                                    int nuevotel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: "));
                                    if (busqueda3 == mecBasica.get(i).getTelefono()) {
                                        mecBasica.get(i).setTelefono(nuevotel);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 4:
                                    String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese el correo a buscar: ");
                                    String nuevocorr = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                                    if (busqueda4.equalsIgnoreCase(mecBasica.get(i).getCorreo())) {
                                        mecBasica.get(i).setCorreo(nuevocorr);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 5:
                                    break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    break;
                case 1:
                    int ced1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a buscar: "));
                    for (int i = 0; i < mecDiesel.size(); i++) {
                        if (ced1 == mecDiesel.get(i).getCedula()) {
                            String[] ediciones = {"Numero de Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Salir"};
                            int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero de Identificacion");
                            switch (editar) {
                                case 0:
                                    int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));
                                    int nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                                    if (busqueda == mecDiesel.get(i).getCedula()) {
                                        mecDiesel.get(i).setCedula(nuevoid);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 1:
                                    String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar: ");
                                    String nuevonom = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                                    if (busqueda1.equalsIgnoreCase(mecDiesel.get(i).getNombre())) {
                                        mecDiesel.get(i).setNombre(nuevonom);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 2:
                                    String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese la direccion a buscar: ");
                                    String nuevodir = JOptionPane.showInputDialog(null, "Ingrese la nueva direccion: ");
                                    if (busqueda2.equalsIgnoreCase(mecDiesel.get(i).getDireccion())) {
                                        mecDiesel.get(i).setDireccion(nuevodir);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 3:
                                    int busqueda3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono a buscar: "));
                                    int nuevotel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: "));
                                    if (busqueda3 == mecDiesel.get(i).getTelefono()) {
                                        mecDiesel.get(i).setTelefono(nuevotel);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 4:
                                    String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese el correo a buscar: ");
                                    String nuevocorr = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                                    if (busqueda4.equalsIgnoreCase(mecDiesel.get(i).getCorreo())) {
                                        mecDiesel.get(i).setCorreo(nuevocorr);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 5:
                                    break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    break;
                case 2:
                    int ced2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecGasolina.size(); i++) {
                        if (ced2 == mecGasolina.get(i).getCedula()) {
                            String[] ediciones = {"Numero de Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Salir"};
                            int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero de Identificacion");
                            switch (editar) {
                                case 0:
                                    int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));
                                    int nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                                    if (busqueda == mecGasolina.get(i).getCedula()) {
                                        mecGasolina.get(i).setCedula(nuevoid);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 1:
                                    String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar: ");
                                    String nuevonom = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                                    if (busqueda1.equalsIgnoreCase(mecGasolina.get(i).getNombre())) {
                                        mecGasolina.get(i).setNombre(nuevonom);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 2:
                                    String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese la direccion a buscar: ");
                                    String nuevodir = JOptionPane.showInputDialog(null, "Ingrese la nueva direccion: ");
                                    if (busqueda2.equalsIgnoreCase(mecGasolina.get(i).getDireccion())) {
                                        mecGasolina.get(i).setDireccion(nuevodir);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 3:
                                    int busqueda3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono a buscar: "));
                                    int nuevotel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: "));
                                    if (busqueda3 == mecGasolina.get(i).getTelefono()) {
                                        mecGasolina.get(i).setTelefono(nuevotel);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 4:
                                    String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese el correo a buscar: ");
                                    String nuevocorr = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                                    if (busqueda4.equalsIgnoreCase(mecGasolina.get(i).getCorreo())) {
                                        mecGasolina.get(i).setCorreo(nuevocorr);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 5:
                                    break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    break;
                case 3:
                    int ced3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecElectricos.size(); i++) {
                        if (ced3 == mecElectricos.get(i).getCedula()) {
                            String[] ediciones = {"Numero de Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Salir"};
                            int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero de Identificacion");
                            switch (editar) {
                                case 0:
                                    int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));
                                    int nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                                    if (busqueda == mecElectricos.get(i).getCedula()) {
                                        mecElectricos.get(i).setCedula(nuevoid);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 1:
                                    String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar: ");
                                    String nuevonom = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                                    if (busqueda1.equalsIgnoreCase(mecElectricos.get(i).getNombre())) {
                                        mecElectricos.get(i).setNombre(nuevonom);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 2:
                                    String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese la direccion a buscar: ");
                                    String nuevodir = JOptionPane.showInputDialog(null, "Ingrese la nueva direccion: ");
                                    if (busqueda2.equalsIgnoreCase(mecElectricos.get(i).getDireccion())) {
                                        mecElectricos.get(i).setDireccion(nuevodir);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 3:
                                    int busqueda3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono a buscar: "));
                                    int nuevotel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: "));
                                    if (busqueda3 == mecElectricos.get(i).getTelefono()) {
                                        mecElectricos.get(i).setTelefono(nuevotel);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 4:
                                    String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese el correo a buscar: ");
                                    String nuevocorr = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                                    if (busqueda4.equalsIgnoreCase(mecElectricos.get(i).getCorreo())) {
                                        mecElectricos.get(i).setCorreo(nuevocorr);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 5:
                                    break;
                            }
             
                        }else{
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    break;
                case 4:
                    int ced4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecPesada.size(); i++) {
                        if (ced4 == mecPesada.get(i).getCedula()) {
                            String[] ediciones = {"Numero de Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Salir"};
                            int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero de Identificacion");
                            switch (editar) {
                                case 0:
                                    int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));
                                    int nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                                    if (busqueda == mecPesada.get(i).getCedula()) {
                                        mecPesada.get(i).setCedula(nuevoid);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 1:
                                    String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar: ");
                                    String nuevonom = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                                    if (busqueda1.equalsIgnoreCase(mecPesada.get(i).getNombre())) {
                                        mecPesada.get(i).setNombre(nuevonom);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 2:
                                    String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese la direccion a buscar: ");
                                    String nuevodir = JOptionPane.showInputDialog(null, "Ingrese la nueva direccion: ");
                                    if (busqueda2.equalsIgnoreCase(mecPesada.get(i).getDireccion())) {
                                        mecPesada.get(i).setDireccion(nuevodir);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 3:
                                    int busqueda3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono a buscar: "));
                                    int nuevotel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: "));
                                    if (busqueda3 == mecPesada.get(i).getTelefono()) {
                                        mecPesada.get(i).setTelefono(nuevotel);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 4:
                                    String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese el correo a buscar: ");
                                    String nuevocorr = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                                    if (busqueda4.equalsIgnoreCase(mecPesada.get(i).getCorreo())) {
                                        mecPesada.get(i).setCorreo(nuevocorr);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 5:
                                    break;
                            }
                        }else{
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    break;
                case 5:
                    int ced5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecMotos.size(); i++) {
                        if (ced5 == mecMotos.get(i).getCedula()) {
                            String[] ediciones = {"Numero de Identificacion", "Nombre", "Direccion", "Telefono", "Correo", "Salir"};
                            int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero de Identificacion");
                            switch (editar) {
                                case 0:
                                    int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la identificacion a buscar: "));
                                    int nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                                    if (busqueda == mecMotos.get(i).getCedula()) {
                                        mecMotos.get(i).setCedula(nuevoid);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 1:
                                    String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar: ");
                                    String nuevonom = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                                    if (busqueda1.equalsIgnoreCase(mecMotos.get(i).getNombre())) {
                                        mecMotos.get(i).setNombre(nuevonom);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 2:
                                    String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese la direccion a buscar: ");
                                    String nuevodir = JOptionPane.showInputDialog(null, "Ingrese la nueva direccion: ");
                                    if (busqueda2.equalsIgnoreCase(mecMotos.get(i).getDireccion())) {
                                        mecMotos.get(i).setDireccion(nuevodir);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 3:
                                    int busqueda3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el telefono a buscar: "));
                                    int nuevotel = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: "));
                                    if (busqueda3 == mecMotos.get(i).getTelefono()) {
                                        mecMotos.get(i).setTelefono(nuevotel);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 4:
                                    String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese el correo a buscar: ");
                                    String nuevocorr = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                                    if (busqueda4.equalsIgnoreCase(mecMotos.get(i).getCorreo())) {
                                        mecMotos.get(i).setCorreo(nuevocorr);
                                    } else {
                                        JOptionPane.showMessageDialog(null, "No se encuentra en valor indicado");
                                    }
                                    break;
                                case 5:
                                    break;
                            }

                        }else{
                            JOptionPane.showMessageDialog(null, "No se encuentra el valor");
                        }
                    }
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);
    }

    @Override

    public void eliminar() {
        int opcion;
        do {
            String[] opciones = {"Mecanica Basica", "Mecanica automotores diesel", "Mecanica automotores gasolina", "Mecanica automotores electricos", "Mecanica de maquinaria pesada", "Mecanica de motos", "Salir"};
            opcion = JOptionPane.showOptionDialog(null, "Ingreso por categoria", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Mecanica Basica");
            switch (opcion) {
                case 0:
                    int busqueda0 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecBasica.size(); i++) {
                        if (busqueda0 == mecBasica.get(i).getCedula()) {
                            mecBasica.remove(i);
                            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                            break;
                        }
                    }
                    break;
                case 1:
                    int busqueda1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecDiesel.size(); i++) {
                        if (busqueda1 == mecDiesel.get(i).getCedula()) {
                            mecDiesel.remove(i);
                            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                            break;
                        }
                    }
                    break;
                case 2:
                    int busqueda2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecGasolina.size(); i++) {
                        if (busqueda2 == mecGasolina.get(i).getCedula()) {
                            mecGasolina.remove(i);
                            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                            break;
                        }
                    }
                    break;
                case 3:
                    int busqueda3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecElectricos.size(); i++) {
                        if (busqueda3 == mecElectricos.get(i).getCedula()) {
                            mecElectricos.remove(i);
                            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                            break;
                        }
                    }
                    break;
                case 4:
                    int busqueda4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecPesada.size(); i++) {
                        if (busqueda4 == mecPesada.get(i).getCedula()) {
                            mecPesada.remove(i);
                            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                            break;
                        }
                    }
                    break;
                case 5:
                    int busqueda5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
                    for (int i = 0; i < mecMotos.size(); i++) {
                        if (busqueda5 == mecMotos.get(i).getCedula()) {
                            mecMotos.remove(i);
                            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                            break;
                        }
                    }
                    break;
                case 6:
                    break;
            }
        } while (opcion != 6);
    }

}
