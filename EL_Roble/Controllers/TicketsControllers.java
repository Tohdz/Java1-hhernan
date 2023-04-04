/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Tickets;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class TicketsControllers implements Crudinterfaces {

    private static ArrayList<Tickets> tickets = new ArrayList();

    ViajesControllers viajes = new ViajesControllers();

    public static ArrayList<Tickets> getTickets() {
        return tickets;
    }

    public static void setTickets(ArrayList<Tickets> aTickets) {
        tickets = aTickets;
    }

    @Override
    public void nuevo() {
        String idVT;
        int cantidad;
        int precioV = 0;
        String fechaV="";
        int totaliva;
        String info = "";
        double iva = 0.13;
        for (int i = 0; i < viajes.getViajes().size(); i++) {
            info = info + ("Numero de viaje:" + viajes.getViajes().get(i).getIdV() + "\n" + "Destino:" + viajes.getViajes().get(i).getDestino() + "\n");
        }
        idVT = JOptionPane.showInputDialog(info + "Ingrese el numero de viaje: ");
        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tiquetes: "));
        for (int v = 0; v < viajes.getViajes().size(); v++) {
            if ((idVT == null ? viajes.getViajes().get(v).getIdV() == null : idVT.equals(viajes.getViajes().get(v).getIdV()))) {
                precioV = viajes.getViajes().get(v).getPrecio();
            }
        }
        totaliva = (int) ((precioV * cantidad) * iva) + (precioV * cantidad);
        for (int v = 0; v < viajes.getViajes().size(); v++) {
            if((idVT == null ? viajes.getViajes().get(v).getIdV() == null : idVT.equals(viajes.getViajes().get(v).getIdV()))){
                fechaV=viajes.getViajes().get(v).getFechaV();
            }
        }
        Tickets ticket = new Tickets(idVT, cantidad, precioV, fechaV, totaliva);
        tickets.add(ticket);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo viaje.");
    }

    @Override
    public void consulta() {
        String[] ediciones = {"Informe individual", "Informe completo"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < tickets.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de viaje: " + tickets.get(i).getIdVT() + "\n" + "Cantidad: " + tickets.get(i).getCantidad() + "\n" + "Precio: " + tickets.get(i).getPrecioV() + "\n" + "Fecha de tiquete: " + tickets.get(i).getFechaV() + "\n" + "Total+iva: " + tickets.get(i).getTotaliva() + "\n");
                }
                break;
            case 1:
                int contador = 0;
                String busqueda = JOptionPane.showInputDialog("Ingrese el ID de viaje: ");
                for (int t = 0; t < tickets.size(); t++) {
                    if ((busqueda == null ? tickets.get(t).getIdVT() == null : busqueda.equals(tickets.get(t).getIdVT()))) {
                        contador = contador + 1 * tickets.get(t).getCantidad();
                    }
                }
                int capacidad = 0;
                for (int v = 0; v < viajes.getViajes().size(); v++) {
                    if ((busqueda == null ? viajes.getViajes().get(v).getIdV() == null : busqueda.equals(viajes.getViajes().get(v).getIdV()))) {
                        capacidad = viajes.getViajes().get(v).getCapacidad();
                    }
                }
                JOptionPane.showMessageDialog(null,"Informe completo de viaje"+":  "+busqueda+"\n"+"Espacios totales:"+capacidad+"\n"+"Espacios vendidos:"+contador+"\n"+"Espacios disponibles:"+(capacidad-contador)+"\n");
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Transportes el Roble es un placer servirle.");
    }

    @Override
    public void modificar() {
        int contador = 0;
        String busqueda = JOptionPane.showInputDialog("Ingrese el ID de viaje: ");
        for (int t = 0; t < tickets.size(); t++) {
            if ((busqueda == null ? tickets.get(t).getIdVT() == null : busqueda.equals(tickets.get(t).getIdVT()))) {
                contador = contador + 1 * tickets.get(t).getCantidad();
            }
        }
        int capacidad = 0;
        for (int v = 0; v < viajes.getViajes().size(); v++) {
            if ((busqueda == null ? viajes.getViajes().get(v).getIdV() == null : busqueda.equals(viajes.getViajes().get(v).getIdV()))) {
                capacidad = viajes.getViajes().get(v).getCapacidad();
            }
        }
        JOptionPane.showMessageDialog(null, "Espacios disponibles para viaje " + busqueda + ":  " + (capacidad - contador) + "\n");
    }

    @Override
    public void eliminar() {
        String busqueda6 = JOptionPane.showInputDialog("Ingrese el numero de viaje a eliminar: ");
        for (int i = 0; i < tickets.size(); i++) {
            if (busqueda6 == null ? tickets.get(i).getIdVT() == null : busqueda6.equals(tickets.get(i).getIdVT())) {
                tickets.remove(i);
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

    }

}
