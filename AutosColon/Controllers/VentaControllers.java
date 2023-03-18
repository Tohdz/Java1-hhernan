package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Ventas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaControllers implements Crudinterfaces {

    ArrayList<Ventas> ventas = new ArrayList();
    AutoControllers autos = new AutoControllers();
    PersonaControllers personas = new PersonaControllers();

    @Override
    public void nuevo() {
        Ventas venta = new Ventas();
        String info = "";
        String inf0 = "";
        for (int i = 0; i < autos.getAutos().size(); i++) {
            if (autos.getAutos().get(i).isDispo()) {
                info = info + ("# chasis: " + autos.getAutos().get(i).getNumeroChasis() + "\n");
            }
        }
        venta.setChasis(JOptionPane.showInputDialog("Numeros de Chasis disponibles: " + "\n" + info));
        for (int i = 0; i < personas.getPersonas().size(); i++) {
            if (personas.getPersonas().get(i).isDispo()) {
                inf0 = inf0 + ("ID cliente: " + personas.getPersonas().get(i).getNumeroId() + "\n");
            }
        }
        venta.setIdComprador(Integer.parseInt(JOptionPane.showInputDialog("Clientes disponibles: " + "\n" + inf0)));
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
        JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
    }

    @Override
    public void disponibilidad() {

        for (int i = 0; i < autos.getAutos().size(); i++) {
            if ((ventas.get(i).getChasis() == null ? autos.getAutos().get(i).getNumeroChasis() == null : ventas.get(i).getChasis().equals(autos.getAutos().get(i).getNumeroChasis()))) {
                autos.getAutos().get(i).setDispo(false);
            } else {
                autos.getAutos().get(i).setDispo(true);
            }
        }
        for (int i = 0; i < personas.getPersonas().size(); i++) {
            if ((ventas.get(i).getIdComprador() == personas.getPersonas().get(i).getNumeroId())) {
                personas.getPersonas().get(i).setDispo(false);
            } else {
                personas.getPersonas().get(i).setDispo(true);
            }
        }

    }
}
