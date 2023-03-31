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
public class PersonasControllers implements Crudinterfaces {

    private static ArrayList<Personas> personas = new ArrayList();

    public ArrayList<Personas> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Personas> personas) {
        this.personas = personas;
    }

    @Override
    public void nuevo() {
        Personas persona = new Personas();
        persona.setId(JOptionPane.showInputDialog("Ingrese el numero de identificacion: "));
        persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
        persona.setTelefono(JOptionPane.showInputDialog("Ingrese el numero telefonico: "));
        persona.setCorreo(JOptionPane.showInputDialog("Ingrese el correo: "));
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
                    JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + personas.get(i).getId() + "\n" + "Nombre: " + personas.get(i).getNombre() + "\n" + "Numero de telefono: " + personas.get(i).getTelefono() + "\n" + "Correo: " + personas.get(i).getCorreo());
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < personas.size(); i++) {
                    info1 = info1 + ("Numero de Identificacion: " + personas.get(i).getId() + "\n" + "Nombre: " + personas.get(i).getNombre() + "\n" + "Numero de telefono: " + personas.get(i).getTelefono() + "\n" + "Correo: " + personas.get(i).getCorreo() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Transportes el Roble es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de Identificacion", "Nombre", "Telefono", "Correo","Volver"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                String busqueda0 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoid = JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda0 == null ? personas.get(i).getId() == null : busqueda0.equals(personas.get(i).getId())) {
                        personas.get(i).setId(nuevoid);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevonombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda1 == null ? personas.get(i).getNombre() == null : busqueda1.equals(personas.get(i).getNombre())) {
                        personas.get(i).setNombre(nuevonombre);
                        break;
                    }
                }
                break;
            case 2:
                String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevotel = JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda2 == null ? personas.get(i).getTelefono() == null : busqueda2.equals(personas.get(i).getTelefono())) {
                        personas.get(i).setTelefono(nuevotel);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevocorreo = JOptionPane.showInputDialog(null, "Ingrese el nuevo Correo: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda3 == null ? personas.get(i).getCorreo() == null : busqueda3.equals(personas.get(i).getCorreo())) {
                        personas.get(i).setCorreo(nuevocorreo);
                        break;
                    }
                }
                break;
            case 4:
                break;
        }
        if (editar!=4){
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
        }
    }

    @Override
    public void eliminar() {
        String busqueda6 = JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: ");
        for (int i = 0; i < personas.size(); i++) {
            if (busqueda6 == null ? personas.get(i).getId() == null : busqueda6.equals(personas.get(i).getId())) {
                personas.remove(i);
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                break;
            }
        }
    }

    @Override
    public void disponibilidad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void visualizacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
