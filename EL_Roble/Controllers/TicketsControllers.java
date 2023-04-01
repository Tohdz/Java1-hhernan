/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Tickets;
import Plantillas.Viajes;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class TicketsControllers implements Crudinterfaces{
    
    private static ArrayList<Tickets> tickets = new ArrayList();

    public static ArrayList<Tickets> getTickets() {
        return tickets;
    }

    public static void setTickets(ArrayList<Tickets> aTickets) {
        tickets = aTickets;
    }

    @Override
    public void nuevo() {
        Tickets ticket = new Tickets();
        ticket.setIdVT(JOptionPane.showInputDialog("Ingrese el numero de ticket: "));
        ticket.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tiquetes: ")));
        ticket.setPrecioV(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: ")));
        ticket.setFechaV(JOptionPane.showInputDialog("Ingrese la fecha: "));
        tickets.add(ticket);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo viaje.");
    }

    @Override
    public void consulta() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < tickets.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de Tiquete: " + tickets.get(i).getIdVT() + "\n" + "Cantidad: " + tickets.get(i).getCantidad() + "\n"+ "Precio: " + tickets.get(i).getPrecioV() + "\n"+ "Fecha de tiquete: " + tickets.get(i).getFechaV() + "\n"+ "Total: " + tickets.get(i).getTotaliva() + "\n");
                }
                break;
            case 1:
                String info1 = "";
                for (int i = 0; i < tickets.size(); i++) {
                    info1 = info1 + ("Numero de Tiquete: " + tickets.get(i).getIdVT() + "\n" + "Cantidad: " + tickets.get(i).getCantidad() + "\n"+ "Precio: " + tickets.get(i).getPrecioV() + "\n"+ "Fecha de tiquete: " + tickets.get(i).getFechaV() + "\n"+ "Total: " + tickets.get(i).getTotaliva() + "\n");
                }
                JOptionPane.showMessageDialog(null, info1);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Transportes el Roble es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de Tiquete","Cantidad","Precio","Fecha","Volver"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                String busqueda0 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoid = JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de tiquete: ");
                for (int i = 0; i < tickets.size(); i++) {
                    if (busqueda0 == null ? tickets.get(i).getIdVT() == null : busqueda0.equals(tickets.get(i).getIdVT())) {
                        tickets.get(i).setIdVT(nuevoid);
                        break;
                    }
                }
                break;
            case 1:
                int busqueda1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                int nuevocantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva matricula: "));
                for (int i = 0; i < tickets.size(); i++) {
                    if (busqueda1 == tickets.get(i).getCantidad() ) {
                        tickets.get(i).setCantidad(nuevocantidad);
                        break;
                    }
                }
                break;
            case 2:
                int busqueda2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                int nuevoprecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo chofer: "));
                for (int i = 0; i < tickets.size(); i++) {
                    if (busqueda2 == tickets.get(i).getPrecioV()) {
                        tickets.get(i).setPrecioV(nuevoprecio);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevofecha = JOptionPane.showInputDialog(null, "Ingrese la nueva fecha: ");
                for (int i = 0; i < tickets.size(); i++) {
                    if (busqueda3 == null ? tickets.get(i).getFechaV() == null : busqueda3.equals(tickets.get(i).getFechaV())) {
                        tickets.get(i).setFechaV(nuevofecha);
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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
