/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Ventas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class VentaControllers implements Crudinterfaces {

    private static ArrayList<Ventas> ventas = new ArrayList();
    
    public static ArrayList<Ventas> getVentas() {
        return ventas;
    }

    public static void setVentas(ArrayList<Ventas> aVentas) {
        ventas = aVentas;
    }
    AutoControllers autos = new AutoControllers();
    PersonaControllers personas = new PersonaControllers();
    String vista1="";
    String vista2="";

    @Override
    public void nuevo() {
        String info = "";
        String inf0 = "";
        Ventas venta = new Ventas();
        for (int car = 0; car < autos.getAutos().size(); car++) {
            if (autos.getAutos().get(car).isDispo()){
                info = info + ("# chasis: " + autos.getAutos().get(car).getNumeroChasis() + "\n");
            }
        }
        try {
            venta.setChasis(JOptionPane.showInputDialog("Numeros de Chasis disponibles: " + "\n" + info));
        } catch (Exception e) {
            venta.setChasis(JOptionPane.showInputDialog("Ingrese un Numeros de Chasis de la lista: " + "\n" + info));
        }
        for (int per = 0; per < personas.getPersonas().size(); per++) {
            if (personas.getPersonas().get(per).isDispo()) {
                inf0 = inf0 + ("ID cliente: " + personas.getPersonas().get(per).getNumeroId() + "\n");
            }
        }
        try {
            venta.setIdComprador(Integer.parseInt(JOptionPane.showInputDialog("Clientes disponibles: " + "\n" + inf0)));
        } catch (Exception e) {
            venta.setIdComprador(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los Clientes disponibles en lista: " + "\n" + inf0)));
        }
        for (int i = 0; i < autos.getAutos().size(); i++) {
            if ((venta.getChasis() == null ? autos.getAutos().get(i).getNumeroChasis() == null : venta.getChasis().equals(autos.getAutos().get(i).getNumeroChasis()))) {
                venta.setPrecioVenta(autos.getAutos().get(i).getPrecio());
            }
        }
        venta.setFechaVenta(JOptionPane.showInputDialog("Ingrese la fecha de venta: "));
        venta.setVentaTotal((int) (venta.getPrecioVenta() + (venta.getPrecioVenta() * venta.getIva())));
        ventas.add(venta);
        JOptionPane.showMessageDialog(null, "Se ha agregado una nueva venta.");
    }

    @Override
    public void consulta() {
        String[] ediciones = {"Individual", "Informe"};
        int editar = JOptionPane.showOptionDialog(null, "Consultas", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Individual");
        switch (editar) {
            case 0:
                for (int i = 0; i < ventas.size(); i++) {
                    JOptionPane.showMessageDialog(null, "Numero de Chasis: " + ventas.get(i).getChasis() + "\n" + "Cliente: " + ventas.get(i).getIdComprador() + "\n" + "Inversion: " + ventas.get(i).getPrecioVenta() + "\n" + "Fecha de Venta: " + ventas.get(i).getFechaVenta() + "\n" + "Total de inversion: " + ventas.get(i).getVentaTotal());
                }
                break;
            case 1:
                String info3 = "";
                for (int i = 0; i < ventas.size(); i++) {
                    info3 = info3 + ("Numero de Chasis: " + ventas.get(i).getChasis() + "\n" + "Cliente: " + ventas.get(i).getIdComprador() + "\n" + "Inversion: " + ventas.get(i).getPrecioVenta() + "\n" + "Fecha de Venta: " + ventas.get(i).getFechaVenta() + "\n" + "Total de inversion: " + ventas.get(i).getVentaTotal() + "\n");
                }
                JOptionPane.showMessageDialog(null, info3);
                break;
        }
        JOptionPane.showMessageDialog(null, "Para Autos Colon es un placer servirle.");
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero Chasis", "Comprador", "Precio de venta", "Fecha de venta", "Venta total"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                String busqueda0 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String chasisnuevo = JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de chasis: ");
                for (int i = 0; i < ventas.size(); i++) {
                    if (busqueda0 == null ? ventas.get(i).getChasis() == null : busqueda0.equals(ventas.get(i).getChasis())) {
                        ventas.get(i).setChasis(chasisnuevo);
                        break;
                    }
                }
                break;
            case 1:
                Integer busqueda1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer comprador = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo ID de comprador: "));
                for (int i = 0; i < ventas.size(); i++) {
                    if (busqueda1 == ventas.get(i).getIdComprador()) {
                        ventas.get(i).setIdComprador(comprador);
                        break;
                    }
                }
                break;
            case 2:
                Integer busqueda2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevoprecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio: "));
                for (int i = 0; i < ventas.size(); i++) {
                    if (busqueda2 == ventas.get(i).getPrecioVenta()) {
                        ventas.get(i).setPrecioVenta(nuevoprecio);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String fecha = JOptionPane.showInputDialog(null, "Ingrese la nueva fecha: ");
                for (int i = 0; i < ventas.size(); i++) {
                    if (busqueda3 == null ? ventas.get(i).getFechaVenta() == null : busqueda3.equals(ventas.get(i).getFechaVenta())) {
                        ventas.get(i).setFechaVenta(fecha);
                        break;
                    }
                }
                break;
            case 4:
                Integer busqueda4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer inver = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio: "));
                for (int i = 0; i < ventas.size(); i++) {
                    if (busqueda4 == ventas.get(i).getVentaTotal()) {
                        ventas.get(i).setVentaTotal(inver);
                        break;
                    }
                }
                break;
        }
        JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
    }

    @Override
    public void eliminar() {
        String busqueda6 = JOptionPane.showInputDialog(null, "Ingrese el numero de chasis a eliminar: ");
        for (int i = 0; i < ventas.size(); i++) {
            if (busqueda6 == null ? ventas.get(i).getChasis() == null : busqueda6.equals(ventas.get(i).getChasis())) {
                ventas.remove(i);
                break;
            }
        }
        for (int car = 0; car < autos.getAutos().size(); car++) {
            for (int per = 0; per < personas.getPersonas().size(); per++) {
                if (busqueda6 == null ? autos.getAutos().get(car).getNumeroChasis() == null : busqueda6.equals(autos.getAutos().get(car).getNumeroChasis())){
                    autos.getAutos().get(car).setDispo(true);
                    personas.getPersonas().get(per).setDispo(true);
                    break;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
    }

    @Override
    public void disponibilidad() {
        
        for (int car = 0; car < autos.getAutos().size(); car++) {
            for (int ven = 0; ven < ventas.size(); ven++) {
                if ((ventas.get(ven).getChasis() == null ? autos.getAutos().get(car).getNumeroChasis() == null : ventas.get(ven).getChasis().equals(autos.getAutos().get(car).getNumeroChasis()))) {
                    autos.getAutos().get(car).setDispo(false);
                    break;
                }
            }
        } 
        for (int per = 0; per < personas.getPersonas().size(); per++) {
            for (int ven = 0; ven < ventas.size(); ven++) {
                if ((ventas.get(ven).getIdComprador() == personas.getPersonas().get(per).getNumeroId())) {
                    personas.getPersonas().get(per).setDispo(false);
                    break;
                }
            }
        }  
    }

    @Override
    public void visualizacion() {
        for (int car = 0; car < autos.getAutos().size(); car++) {
            if (autos.getAutos().get(car).isDispo()){
                vista1 = vista1 + ("# chasis: " + autos.getAutos().get(car).getNumeroChasis() + "\n");
            }
        }
        for (int per = 0; per < personas.getPersonas().size(); per++) {
            if (personas.getPersonas().get(per).isDispo()) {
                vista2 = vista2 + ("ID cliente: " + personas.getPersonas().get(per).getNumeroId() + "\n");
            }
        }
    }
}
