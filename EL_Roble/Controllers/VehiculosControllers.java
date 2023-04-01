/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Choferes;
import Plantillas.Personas;
import Plantillas.Vehiculos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class VehiculosControllers implements Crudinterfaces{
    
    private static ArrayList<Vehiculos> vehiculos = new ArrayList();

    public static ArrayList<Vehiculos> getVehiculos() {
        return vehiculos;
    }

    public static void setVehiculos(ArrayList<Vehiculos> aVehiculos) {
        vehiculos = aVehiculos;
    }
    
    @Override
    public void nuevo() {
        Vehiculos vehiculo = new Vehiculos();
        vehiculo.setPlaca(JOptionPane.showInputDialog("Ingrese el numero de matricula: "));
        vehiculo.setMarca(JOptionPane.showInputDialog("Ingrese la marca: "));
        vehiculo.setEstilo(JOptionPane.showInputDialog("Ingrese el estilo: "));
        vehiculo.setAño(JOptionPane.showInputDialog("Ingrese el año: "));
        vehiculo.setPasajeros(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de personas: ")));
        vehiculos.add(vehiculo);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo vehiculo.");
    }

    @Override
    public void consulta() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < vehiculos.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de Matricula: " + vehiculos.get(i).getPlaca() + "\n" + "Marca: " + vehiculos.get(i).getMarca() + "\n"+ "Estilo: " + vehiculos.get(i).getEstilo() + "\n"+ "Año: " + vehiculos.get(i).getAño() + "\n"+ "Capacidad: " + vehiculos.get(i).getPasajeros() + "\n");
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < vehiculos.size(); i++) {
                    info1 = info1 + ("Numero de Matricula: " + vehiculos.get(i).getPlaca() + "\n" + "Marca: " + vehiculos.get(i).getMarca() + "\n"+ "Estilo: " + vehiculos.get(i).getEstilo() + "\n"+ "Año: " + vehiculos.get(i).getAño() + "\n"+ "Capacidad: " + vehiculos.get(i).getPasajeros() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Transportes el Roble es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de Matricula", "Marca", "Estilo", "Año","Capacidad","Volver"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                String busqueda0 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoid = JOptionPane.showInputDialog(null, "Ingrese la nueva matricula: ");
                for (int i = 0; i < vehiculos.size(); i++) {
                    if (busqueda0 == null ? vehiculos.get(i).getPlaca() == null : busqueda0.equals(vehiculos.get(i).getPlaca())) {
                        vehiculos.get(i).setPlaca(nuevoid);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevomarca = JOptionPane.showInputDialog(null, "Ingrese la nueva marca: ");
                for (int i = 0; i < vehiculos.size(); i++) {
                    if (busqueda1 == null ? vehiculos.get(i).getMarca() == null : busqueda1.equals(vehiculos.get(i).getMarca())) {
                        vehiculos.get(i).setMarca(nuevomarca);
                        break;
                    }
                }
                break;
            case 2:
                String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoestilo = JOptionPane.showInputDialog(null, "Ingrese el nuevo estilo: ");
                for (int i = 0; i < vehiculos.size(); i++) {
                    if (busqueda2 == null ? vehiculos.get(i).getEstilo() == null : busqueda2.equals(vehiculos.get(i).getEstilo())) {
                        vehiculos.get(i).setEstilo(nuevoestilo);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoaño = JOptionPane.showInputDialog(null, "Ingrese el nuevo año: ");
                for (int i = 0; i < vehiculos.size(); i++) {
                    if (busqueda3 == null ? vehiculos.get(i).getAño() == null : busqueda3.equals(vehiculos.get(i).getAño())) {
                        vehiculos.get(i).setAño(nuevoaño);
                        break;
                    }
                }
                break;
            case 4:
                int busqueda4=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                int nuevopasa=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva capacidad: "));
                for (int i = 0; i < vehiculos.size(); i++) {
                    if (busqueda4 ==nuevopasa) {
                        vehiculos.get(i).setPasajeros(nuevopasa);
                        break;
                    }
                }
                break;
            case 5:
                break;
        }
        if (editar!=5){
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
        }
    }

    @Override
    public void eliminar() {
        String busqueda6 = JOptionPane.showInputDialog("Ingrese el numero de matricula a eliminar: ");
        for (int i = 0; i < vehiculos.size(); i++) {
            if (busqueda6 == null ? vehiculos.get(i).getPlaca() == null : busqueda6.equals(vehiculos.get(i).getPlaca())) {
                vehiculos.remove(i);
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
