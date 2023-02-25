/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterface.Crudinterface;
import Entidades.perssrc;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class PersonasController implements Crudinterface {

    ArrayList<perssrc> personas = new ArrayList();

    @Override
    public void agregar() {
        perssrc persona = new perssrc();
        persona.setNumero_ID(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero ID: ")));
        persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre de la persona: "));
        persona.setNumero_telefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero telefonico: ")));
        persona.setCorreo(JOptionPane.showInputDialog("Ingrese el correo electronico: "));
        personas.add(persona);
    }

    @Override
    public void editar() {
        String[] ediciones = {"ID", "Nombre", "Telefono", "Correo"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "ID");
        switch (editar) {
            case 0:
                Integer busqueda0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo ID: "));
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda0 == null ? personas.get(i).getNumero_ID() == null : busqueda0.equals(personas.get(i).getNumero_ID())) {
                        personas.get(i).setNumero_ID(nuevo_id);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevo_nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda1 == null ? personas.get(i).getNombre() == null : busqueda1.equals(personas.get(i).getNombre())) {
                        personas.get(i).setNombre(nuevo_nombre);
                        break;
                    }
                }
                break;
            case 2:
                Integer busqueda2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_area = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo numero telefonico: "));
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda2 == null ? personas.get(i).getNumero_telefono() == null : busqueda2.equals(personas.get(i).getNumero_telefono())) {
                        personas.get(i).setNumero_telefono(nuevo_area);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevo_correo = JOptionPane.showInputDialog(null, "Ingrese el nuevo correo: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda3 == null ? personas.get(i).getCorreo() == null : busqueda3.equals(personas.get(i).getCorreo())) {
                        personas.get(i).setCorreo(nuevo_correo);
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void consultar() {
        for (int i = 0; i < personas.size(); i++) {
            JOptionPane.showMessageDialog(null, "ID: " + personas.get(i).getNumero_ID() + "\n" + "Nombre: " + personas.get(i).getNombre() + "\n" + "Numero telefonico: " + personas.get(i).getNumero_telefono() + "\n" + "Correo: " + personas.get(i).getCorreo());
        }
    }

}
