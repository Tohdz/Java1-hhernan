/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterface.Crudinterface;
import Plantillas.Canciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class CancionControllers implements Crudinterface {
    
    ArrayList<Canciones> Canciones = new ArrayList();

    @Override
    public void agregar() {
        Canciones cancion = new Canciones();
        cancion.setTitulo(JOptionPane.showInputDialog("Ingrese el titulo de la cancion: "));
        cancion.setAutor(JOptionPane.showInputDialog("Ingrese el autor de la cancion: "));
        cancion.setDuracion(JOptionPane.showInputDialog("Ingrese la duracion de la cancion: "));
        cancion.setAño(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de la cancion: ")));
        Canciones.add(cancion);
    }

    @Override
    public void editar() {
        String[] ediciones = {"ID", "Titulo", "Autor", "Duracion", "Año"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "ID");
        switch (editar) {
            case 0:
                Integer busqueda0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo ID: "));
                for (int i = 0; i < Canciones.size(); i++) {
                    if (busqueda0 == Canciones.get(i).getId()) {
                        Canciones.get(i).setId(nuevo_id);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String titulo = JOptionPane.showInputDialog(null, "Ingrese el nuevo titulo: ");
                for (int i = 0; i < Canciones.size(); i++) {
                    if (busqueda1 == null ? Canciones.get(i).getTitulo() == null : busqueda1.equals(Canciones.get(i).getTitulo())) {
                        Canciones.get(i).setTitulo(titulo);
                        break;
                    }
                }
                break;
            case 2:
                String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String autor = JOptionPane.showInputDialog(null, "Ingrese el nuevo autor: ");
                for (int i = 0; i < Canciones.size(); i++) {
                    if (busqueda2 == null ? Canciones.get(i).getAutor() == null : busqueda2.equals(Canciones.get(i).getAutor())) {
                        Canciones.get(i).setAutor(autor);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String duracion = JOptionPane.showInputDialog(null, "Ingrese la nueva duracion: ");
                for (int i = 0; i < Canciones.size(); i++) {
                    if (busqueda3 == null ? Canciones.get(i).getDuracion() == null : busqueda3.equals(Canciones.get(i).getDuracion())) {
                        Canciones.get(i).setDuracion(duracion);
                        break;
                    }
                }
                break;
            case 4:
                Integer busqueda4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer año = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese nuevo año: "));
                for (int i = 0; i < Canciones.size(); i++) {
                    if (busqueda4 == Canciones.get(i).getAño()) {
                        Canciones.get(i).setAño(año);
                        break;
                    }
                }
                break;
            
        }
    }

    @Override
    public void consultar() {
        for (int i = 0; i < Canciones.size(); i++) {
            JOptionPane.showMessageDialog(null, "ID: " + Canciones.get(i).getId() + "\n" + "Titulo: " + Canciones.get(i).getTitulo() + "\n" + "Autor: " + Canciones.get(i).getAutor()+"\n"+"Duracion: "+ Canciones.get(i).getDuracion()+"\n"+"Año: "+Canciones.get(i).getAño());
        }
    }
    
}
