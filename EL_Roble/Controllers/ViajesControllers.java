/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Viajes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class ViajesControllers implements Crudinterfaces {

    private static ArrayList<Viajes> viajes = new ArrayList();

    VehiculosControllers vehiculo = new VehiculosControllers();
    ChoferesControllers choferes = new ChoferesControllers();

    public static ArrayList<Viajes> getViajes() {
        return viajes;
    }

    public static void setViajes(ArrayList<Viajes> aViajes) {
        viajes = aViajes;
    }

    @Override
    public void nuevo() {
        String idV;
        String placaV;
        String idChof;
        String fechaV;
        String destino;
        int capacidad = 0;
        int ventacapacidad;
        int precio = 0;

        idV = JOptionPane.showInputDialog("Ingrese el numero de viaje: ");
        String placas = "";
        for (int i = 0; i < vehiculo.getVehiculos().size(); i++) {
            placas = placas + ("Numero de matricula: " + vehiculo.getVehiculos().get(i).getPlaca() + "\n");
        }
        placaV = JOptionPane.showInputDialog(placas + "Ingrese la matricula del vehiculo: ");
        String conductores = "";
        for (int i = 0; i < choferes.getChoferes().size(); i++) {
            conductores = conductores + ("Conductores:" + choferes.getChoferes().get(i).getIdC() + "\n");
        }
        idChof = JOptionPane.showInputDialog(conductores + "Ingrese el ID de chofer: ");
        String info = "";
        for (int i = 0; i < viajes.size(); i++) {
            info = info + ("Fecha reservada:" + viajes.get(i).getFechaV() + "\n");
        }
        fechaV = JOptionPane.showInputDialog(info + "Ingrese la fecha de viaje: ");
        destino = JOptionPane.showInputDialog("Ingrese el destino: ");
        for (int i = 0; i < vehiculo.getVehiculos().size(); i++) {
            if ((placaV == null ? vehiculo.getVehiculos().get(i).getPlaca() == null : placaV.equals(vehiculo.getVehiculos().get(i).getPlaca()))) {
                capacidad = vehiculo.getVehiculos().get(i).getPasajeros();
            }
        }
        do {
            try {
                precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del tiquete: "));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ingrese un precio valido.");
            }
        } while (precio <= 0);
        ventacapacidad = 0;
        Viajes viaje = new Viajes(idV, placaV, idChof, fechaV, destino, capacidad, ventacapacidad, precio);
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
                    JOptionPane.showMessageDialog(null, "Numero de viajes: " + viajes.get(i).getIdV() + "\n" + "Matricula: " + viajes.get(i).getPlacaV() + "\n" + "ID de Chofer: " + viajes.get(i).getIdChof() + "\n" + "Fecha de viaje: " + viajes.get(i).getFechaV() + "\n" + "Destino: " + viajes.get(i).getDestino() + "\n" + "Capacidad: " + viajes.get(i).getCapacidad() + "\n" + "Precio: " + viajes.get(i).getPrecio() + "\n");
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < viajes.size(); i++) {
                    info1 = info1 + ("Numero de viajes: " + viajes.get(i).getIdV() + "\n" + "Matricula: " + viajes.get(i).getPlacaV() + "\n" + "ID de Chofer: " + viajes.get(i).getIdChof() + "\n" + "Fecha de viaje: " + viajes.get(i).getFechaV() + "\n" + "Destino: " + viajes.get(i).getDestino() + "\n" + "Capacidad: " + viajes.get(i).getCapacidad() + "\n" + "Precio: " + viajes.get(i).getPrecio() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Transportes el Roble es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de viaje", "Vehiculo de viaje", "Chofer de viaje", "Fecha viaje", "Destino", "Capacidad", "Precio", "Volver"};
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
                int busqueda5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                int nuevocapa = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva capacidad: "));
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda5 == viajes.get(i).getCapacidad()) {
                        viajes.get(i).setCapacidad(nuevocapa);
                        break;
                    }
                }
                break;
            case 6:
                int busqueda6 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                int nuevoprecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio: "));
                for (int i = 0; i < viajes.size(); i++) {
                    if (busqueda6 == viajes.get(i).getPrecio()) {
                        viajes.get(i).setPrecio(nuevoprecio);
                        break;
                    }
                }
                break;
            case 7:
                break;
        }
        if (editar != 7) {
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
        
        for (int veh = 0; veh < vehiculo.getVehiculos().size(); veh++) {
            for (int vi = 0; vi < viajes.size(); vi++) {
                if ((vehiculo.getVehiculos().get(veh).getPlaca() != null ? viajes.get(vi).getPlacaV() != null : vehiculo.getVehiculos().get(veh).getPlaca().equals(viajes.get(vi).getPlacaV()))) {
                    vehiculo.getVehiculos().get(veh).setDispo(true);
                    break;
                }
            }
        }
        
    }

    @Override
    public void disponibilidad() {
        for (int veh = 0; veh < vehiculo.getVehiculos().size(); veh++) {
            for (int vi = 0; vi < viajes.size(); vi++) {
                if ((vehiculo.getVehiculos().get(veh).getPlaca() == null ? viajes.get(vi).getPlacaV() == null : vehiculo.getVehiculos().get(veh).getPlaca().equals(viajes.get(vi).getPlacaV()))) {
                    vehiculo.getVehiculos().get(veh).setDispo(false);
                    break;
                }
            }
        }

    }

    @Override
    public void visualizacion() {

    }
    
    public void precarga(){
        Viajes viaje = new Viajes();
        viaje.setIdV("0");
        viaje.setPlacaV("835477");
        viaje.setIdChof("104880522");
        viaje.setFechaV("8/8/88");
        viaje.setDestino("Isla del coco");
        viaje.setCapacidad(0);
        viaje.setPrecio(0);
        viajes.add(viaje);
    
    }

}
