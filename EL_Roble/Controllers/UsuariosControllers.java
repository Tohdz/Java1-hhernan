/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Personas;
import Plantillas.Usuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class UsuariosControllers implements Crudinterfaces{
    
    private static ArrayList<Usuarios> usuarios = new ArrayList();

    public static ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public static void setUsuarios(ArrayList<Usuarios> aUsuarios) {
        usuarios = aUsuarios;
    }
    
    

    @Override
    public void nuevo() {
        Usuarios usuario = new Usuarios();
        usuario.setIdU(JOptionPane.showInputDialog("Ingrese el numero de identificacion: "));
        usuario.setCodigoU(JOptionPane.showInputDialog("Ingrese el codigo de usuario: "));
        usuario.setClave(JOptionPane.showInputDialog("Ingrese la clave: "));
        
        usuarios.add(usuario);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo usuario.");
    }

    @Override
    public void consulta() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < usuarios.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + usuarios.get(i).getIdU() + "\n" + "Nombre: " + usuarios.get(i).getCodigoU() + "\n" + "Numero de telefono: " + usuarios.get(i).getClave() + "\n");
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < usuarios.size(); i++) {
                    info1 = info1 + ("Numero de Identificacion: " + usuarios.get(i).getIdU() + "\n" + "Nombre: " + usuarios.get(i).getCodigoU() + "\n" + "Numero de telefono: " + usuarios.get(i).getClave() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Transportes el Roble es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de Identificacion", "Codigo de Usuario", "Contraseña","Volver"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                String busqueda0 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoid = JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: ");
                for (int i = 0; i < usuarios.size(); i++) {
                    if (busqueda0 == null ? usuarios.get(i).getIdU() == null : busqueda0.equals(usuarios.get(i).getIdU())) {
                        usuarios.get(i).setIdU(nuevoid);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevocodigo = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                for (int i = 0; i < usuarios.size(); i++) {
                    if (busqueda1 == null ? usuarios.get(i).getCodigoU() == null : busqueda1.equals(usuarios.get(i).getCodigoU())) {
                        usuarios.get(i).setCodigoU(nuevocodigo);
                        break;
                    }
                }
                break;
            case 2:
                String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevocontra = JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: ");
                for (int i = 0; i < usuarios.size(); i++) {
                    if (busqueda2 == null ? usuarios.get(i).getClave() == null : busqueda2.equals(usuarios.get(i).getClave())) {
                        usuarios.get(i).setClave(nuevocontra);
                        break;
                    }
                }
                break;
            case 3:
                break;
        }
        if (editar!=3){
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
        }
    }

    @Override
    public void eliminar() {
        String busqueda6 = JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: ");
        for (int i = 0; i < usuarios.size(); i++) {
            if (busqueda6 == null ? usuarios.get(i).getIdU() == null : busqueda6.equals(usuarios.get(i).getIdU())) {
                usuarios.remove(i);
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
