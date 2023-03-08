/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterface.Crudinterface;
import Entidades.edisrc;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class EdificiosController implements Crudinterface {

    ArrayList<edisrc> edificios = new ArrayList();

    @Override
    public void agregar() {
        edisrc edificio = new edisrc();
        edificio.setNumero_ID(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ID: ")));
        edificio.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Edificio: "));
        edificio.setArea_construccion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el area de construccion: ")));
        edificios.add(edificio);
    }

    @Override
    public void editar() {
        String[] ediciones = {"ID", "Nombre", "Area"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "ID");
        switch (editar) {
            case 0:
                Integer busqueda0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo ID: "));
                for (int i = 0; i < edificios.size(); i++) {
                    if (busqueda0 == null ? edificios.get(i).getNumero_ID() == null : busqueda0.equals(edificios.get(i).getNumero_ID())) {
                        edificios.get(i).setNumero_ID(nuevo_id);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevo_nombre = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                for (int i = 0; i < edificios.size(); i++) {
                    if (busqueda1 == null ? edificios.get(i).getNombre() == null : busqueda1.equals(edificios.get(i).getNombre())) {
                        edificios.get(i).setNombre(nuevo_nombre);
                        break;
                    }
                }
                break;
            case 2:
                Integer busqueda2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_area = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de area: "));
                for (int i = 0; i < edificios.size(); i++) {
                    if (busqueda2 == null ? edificios.get(i).getArea_construccion() == null : busqueda2.equals(edificios.get(i).getArea_construccion())) {
                        edificios.get(i).setArea_construccion(nuevo_area);
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void consultar() {
        for (int i = 0; i < edificios.size(); i++) {
            JOptionPane.showMessageDialog(null, "ID: " + edificios.get(i).getNumero_ID() + "\n" + "Nombre: " + edificios.get(i).getNombre() + "\n" + "Area: " + edificios.get(i).getArea_construccion());
        }

    }

}
