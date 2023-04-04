/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class PersonaControllers implements Crudinterfaces {

    private static ArrayList<Personas> personas = new ArrayList();

    public static ArrayList<Personas> getPersonas() {
        return personas;
    }

    public static void setPersonas(ArrayList<Personas> aPersonas) {
        personas = aPersonas;
    }

    @Override
    public void nuevo() {

        int numeroId = 0;
        String nombre;
        String telefono;
        String correo;
        boolean dispo;
        do {
            try {
                numeroId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion: "));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor invalido,ingrese un numero de identificacion valido: ");
            }
        } while (numeroId <= 0);
        for (int i = 0; i < personas.size(); i++) {
            if (numeroId == personas.get(i).getNumeroId()) {
                numeroId = Integer.parseInt(JOptionPane.showInputDialog("El valor ya existe, Ingrese el numero de identificacion valido: "));          
            }
        }
        nombre = JOptionPane.showInputDialog("Ingrese el nombre: ");
        telefono = JOptionPane.showInputDialog("Ingrese el numero telefonico: ");
        correo = JOptionPane.showInputDialog("Ingrese el correo: ");
        dispo = true;
        Personas persona = new Personas(numeroId, nombre, telefono, correo, dispo);
        personas.add(persona);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo cliente.");
    }

    @Override
    public void consulta() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < personas.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + personas.get(i).getNumeroId() + "\n" + "Nombre: " + personas.get(i).getNombre() + "\n" + "Numero de telefono: " + personas.get(i).getTelefono() + "\n" + "Correo: " + personas.get(i).getCorreo());
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < personas.size(); i++) {
                    info1 = info1 + ("Numero de Identificacion: " + personas.get(i).getNumeroId() + "\n" + "Nombre: " + personas.get(i).getNombre() + "\n" + "Numero de telefono: " + personas.get(i).getTelefono() + "\n" + "Correo: " + personas.get(i).getCorreo() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Autos Colon es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de Identificacion", "Nombre", "Telefono", "Correo"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                Integer busqueda0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda0 == personas.get(i).getNumeroId()) {
                        personas.get(i).setNumeroId(nuevoid);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevomarca = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda1 == null ? personas.get(i).getNombre() == null : busqueda1.equals(personas.get(i).getNombre())) {
                        personas.get(i).setNombre(nuevomarca);
                        break;
                    }
                }
                break;
            case 2:
                String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoestilo = JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda2 == null ? personas.get(i).getTelefono() == null : busqueda2.equals(personas.get(i).getTelefono())) {
                        personas.get(i).setTelefono(nuevoestilo);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevomodelo = JOptionPane.showInputDialog(null, "Ingrese el nuevo Correo: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda3 == null ? personas.get(i).getCorreo() == null : busqueda3.equals(personas.get(i).getCorreo())) {
                        personas.get(i).setCorreo(nuevomodelo);
                        break;
                    }
                }
                break;
        }
        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
    }

    @Override
    public void eliminar() {
        Integer busqueda6 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).isDispo() == true) {
                if (busqueda6 == personas.get(i).getNumeroId()) {
                    personas.remove(i);
                    JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                    break;
                }
            }
            JOptionPane.showMessageDialog(null, "El cliente se encuentra activo.");
        }
    }

    @Override
    public void disponibilidad() {

    }

    @Override
    public void visualizacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
