/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Choferes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class ChoferesControllers implements Crudinterfaces{
    
    private static ArrayList<Choferes> choferes = new ArrayList();
    PersonasControllers personas = new PersonasControllers();

    public static ArrayList<Choferes> getChoferes() {
        return choferes;
    }

    public static void setChoferes(ArrayList<Choferes> aChoferes) {
        choferes = aChoferes;
    }

    @Override
    public void nuevo() {
        String info="";
        String idC;
        String vencimientoL;
        for (int v = 0; v < personas.getPersonas().size(); v++) {
            info = info + ("Numero de id:" + personas.getPersonas().get(v).getId() + "\n");
        }
        idC=JOptionPane.showInputDialog(info+"Ingrese el numero de identificacion: ");
        for (int i = 0; i < choferes.size(); i++) {
            if (idC == null ? choferes.get(i).getIdC() == null : idC.equals(choferes.get(i).getIdC())) {
                idC = JOptionPane.showInputDialog("El id ya existe, Ingrese un id valido: ");
            }
        }
        vencimientoL=JOptionPane.showInputDialog("Ingrese la fecha de vencimiento de su permiso: ");
        Choferes chofer = new Choferes(idC, vencimientoL);
        choferes.add(chofer);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo conductor.");
    }

    @Override
    public void consulta() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < choferes.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + choferes.get(i).getIdC() + "\n" + "Vencimiento de permiso: " + choferes.get(i).getVencimientoL() + "\n");
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < choferes.size(); i++) {
                    info1 = info1 + ("Numero de Identificacion: " + choferes.get(i).getIdC() + "\n" + "Nombre: " + choferes.get(i).getVencimientoL() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Transportes el Roble es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de Identificacion", "Vencimiento de permiso","Volver"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                String busqueda0 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoid = JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: ");
                for (int i = 0; i < choferes.size(); i++) {
                    if (busqueda0 == null ? choferes.get(i).getIdC() == null : busqueda0.equals(choferes.get(i).getIdC())) {
                        choferes.get(i).setIdC(nuevoid);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevopermi = JOptionPane.showInputDialog(null, "Ingrese la nueva fecha: ");
                for (int i = 0; i < choferes.size(); i++) {
                    if (busqueda1 == null ? choferes.get(i).getVencimientoL() == null : busqueda1.equals(choferes.get(i).getVencimientoL())) {
                        choferes.get(i).setVencimientoL(nuevopermi);
                        break;
                    }
                }
                break;
            case 2:
                break;
        }
        if (editar!=2){
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
        }
    }

    @Override
    public void eliminar() {
        String busqueda6 = JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: ");
        for (int i = 0; i < choferes.size(); i++) {
            if (busqueda6 == null ? choferes.get(i).getIdC() == null : busqueda6.equals(choferes.get(i).getIdC())) {
                choferes.remove(i);
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                break;
            }
        }
        for (int per = 0; per < personas.getPersonas().size(); per++) {
            for (int cho = 0; cho < choferes.size(); cho++) {
                if ((personas.getPersonas().get(per).getId() != null ? choferes.get(cho).getIdC() != null : personas.getPersonas().get(per).getId().equals(choferes.get(cho).getIdC()))) {
                    personas.getPersonas().get(per).setDispo(true);
                    break;
                }
            }
        }
    }

    @Override
    public void disponibilidad() {
        for (int per = 0; per < personas.getPersonas().size(); per++) {
            for (int cho = 0; cho < choferes.size(); cho++) {
                if ((personas.getPersonas().get(per).getId() == null ? choferes.get(cho).getIdC() == null : personas.getPersonas().get(per).getId().equals(choferes.get(cho).getIdC()))) {
                    personas.getPersonas().get(per).setDispo(false);
                    break;
                }
            }
        }
    }

    @Override
    public void visualizacion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void precarga(){
        Choferes chofer = new Choferes();
        chofer.setIdC("104880522");
        chofer.setVencimientoL("24/4/23");
        choferes.add(chofer);
    
    }
    
}
