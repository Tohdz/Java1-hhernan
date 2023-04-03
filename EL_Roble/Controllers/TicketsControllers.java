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
public class TicketsControllers implements Crudinterfaces{
    
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
        Tickets ticket = new Tickets();
        String info="";
        double iva=0.13;
        for (int i = 0; i < viajes.getViajes().size(); i++) {
            info=info+("Numero de viaje:"+viajes.getViajes().get(i).getIdV()+"\n"+"Destino:"+viajes.getViajes().get(i).getDestino());
        }
        ticket.setIdVT(JOptionPane.showInputDialog(info + "Ingrese el numero de viaje: "));
        ticket.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tiquetes: ")));
        for (int v = 0; v < viajes.getViajes().size(); v++) {
            if ((ticket.getIdVT() == null ? viajes.getViajes().get(v).getIdV() == null : ticket.getIdVT().equals(viajes.getViajes().get(v).getIdV()))){
                    ticket.setPrecioV(viajes.getViajes().get(v).getPrecio());
                }
            } 
        ticket.setTotaliva((int)((ticket.getPrecioV()*ticket.getCantidad())*iva)+(ticket.getPrecioV()*ticket.getCantidad()));
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
