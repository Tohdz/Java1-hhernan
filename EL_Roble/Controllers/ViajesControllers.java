/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Vehiculos;
import Plantillas.Viajes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class ViajesControllers implements Crudinterfaces{
    
    private static ArrayList<Viajes> viajes = new ArrayList();

    public static ArrayList<Viajes> getVehiculos() {
        return viajes;
    }

    public static void setVehiculos(ArrayList<Viajes> aVehiculos) {
        viajes = aVehiculos;
    }

    @Override
    public void nuevo() {
        Viajes viaje = new Viajes();
        viaje.setIdV(JOptionPane.showInputDialog("Ingrese el numero de viaje: "));
        viaje.setPlacaV(JOptionPane.showInputDialog("Ingrese la matricula del vehiculo: "));
        viaje.setIdChof(JOptionPane.showInputDialog("Ingrese el ID de chofer: "));
        viaje.setFechaV(JOptionPane.showInputDialog("Ingrese la fecha de viaje: "));
        viaje.setDestino(JOptionPane.showInputDialog("Ingrese el destino: "));
        viaje.setCapacidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad de personas: ")));
        viaje.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del viaje: ")));
        viajes.add(viaje);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo viaje.");
    }

    @Override
    public void consulta() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < viajes.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de viajes: " + viajes.get(i).getIdV() + "\n" + "Matricula: " + viajes.get(i).getPlacaV() + "\n"+ "ID de Chofer: " + viajes.get(i).getIdChof() + "\n"+ "Fecha de viaje: " + viajes.get(i).getFechaV() + "\n"+ "Destino: " + viajes.get(i).getDestino() + "\n"+ "Capacidad: " + viajes.get(i).getCapacidad() + "\n"+ "Precio: " + viajes.get(i).getPrecio() + "\n");
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < viajes.size(); i++) {
                    info1 = info1 + ("Numero de viajes: " + viajes.get(i).getIdV() + "\n" + "Matricula: " + viajes.get(i).getPlacaV() + "\n"+ "ID de Chofer: " + viajes.get(i).getIdChof() + "\n"+ "Fecha de viaje: " + viajes.get(i).getFechaV() + "\n"+ "Destino: " + viajes.get(i).getDestino() + "\n"+ "Capacidad: " + viajes.get(i).getCapacidad() + "\n"+ "Precio: " + viajes.get(i).getPrecio() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Transportes el Roble es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de viaje","Vehiculo de viaje","Chofer de viaje","Fecha viaje","Destino","Capacidad","Precio","Volver"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                String busqueda0 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoid = JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de viaje: ");
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda0 == null ? viajes.get(i).getIdV() == null : busqueda0.equals(viajes.get(i).getIdV())) {
                        viajes.get(i).setIdV(nuevoid);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoplaca = JOptionPane.showInputDialog(null, "Ingrese la nueva matricula: ");
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda1 == null ? viajes.get(i).getPlacaV() == null : busqueda1.equals(viajes.get(i).getPlacaV())) {
                        viajes.get(i).setPlacaV(nuevoplaca);
                        break;
                    }
                }
                break;
            case 2:
                String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevochofer = JOptionPane.showInputDialog(null, "Ingrese el nuevo chofer: ");
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda2 == null ? viajes.get(i).getIdChof() == null : busqueda2.equals(viajes.get(i).getIdChof())) {
                        viajes.get(i).setIdChof(nuevochofer);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevofecha = JOptionPane.showInputDialog(null, "Ingrese la nueva fecha: ");
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda3 == null ? viajes.get(i).getFechaV() == null : busqueda3.equals(viajes.get(i).getFechaV())) {
                        viajes.get(i).setFechaV(nuevofecha);
                        break;
                    }
                }
                break;
            case 4:
                String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevodes = JOptionPane.showInputDialog(null, "Ingrese el nuevo destino: ");
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda4 == null ? viajes.get(i).getDestino() == null : busqueda4.equals(viajes.get(i).getDestino())) {
                        viajes.get(i).setDestino(nuevodes);
                        break;
                    }
                }
                break;
            case 5:
                int busqueda5=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                int nuevocapa=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva capacidad: "));
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda5 ==nuevocapa) {
                        viajes.get(i).setCapacidad(nuevocapa);
                        break;
                    }
                }
                break;
            case 6:
                int busqueda6=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                int nuevoprecio=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio: "));
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda6 ==nuevoprecio) {
                        viajes.get(i).setPrecio(nuevoprecio);
                        break;
                    }
                }
                break;
            case 7:
                break;
        }
        if (editar!=7){
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
        }
    }

    @Override
    public void eliminar() {
        String busqueda6 = JOptionPane.showInputDialog("Ingrese el numero de viaje a eliminar: ");
        for (int i = 0; i < viajes.size(); i++) {
            if (busqueda6 == null ? viajes.get(i).getIdV() == null : busqueda6.equals(viajes.get(i).getIdV())) {
                viajes.remove(i);
                JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
                break;
            }
        }
    }

    @Override
    public void disponibilidad() {
        
    }

    @Override
    public void visualizacion() {
        
    }
    
}
