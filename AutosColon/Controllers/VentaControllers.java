package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Autos;
import Plantillas.Ventas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentaControllers implements Crudinterfaces {

    ArrayList<Ventas> ventas = new ArrayList();

    @Override
    public void nuevo() {
        Ventas venta = new Ventas();
        AutoControllers autos = new AutoControllers();
        PersonaControllers personas = new PersonaControllers();
        String info="";
        String inf0="";
        for (int i = 0; i < autos.getAutos().size(); i++) {
            info = info + ("# chasis: "+ autos.getAutos().get(i).getNumeroChasis()+ "\n");
        }
        venta.setChasis(JOptionPane.showInputDialog("Numeros de Chasis disponibles: "+"\n"+info));
        for (int i = 0; i < personas.getPersonas().size(); i++) {
            inf0 = inf0 + ("ID cliente: "+ personas.getPersonas().get(i).getNumeroId()+ "\n");
        }
        venta.setIdComprador(Integer.parseInt(JOptionPane.showInputDialog("Clientes disponibles: "+"\n"+inf0)));
        for (int i = 0; i < autos.getAutos().size(); i++) {
            if ((venta.getChasis() == null ? autos.getAutos().get(i).getNumeroChasis() == null : venta.getChasis().equals(autos.getAutos().get(i).getNumeroChasis()))) {
                venta.setPrecioVenta(autos.getAutos().get(i).getPrecio()); 
                }
        }
        venta.setFechaVenta(JOptionPane.showInputDialog("Ingrese la fecha de venta: "));
        venta.setVentaTotal((int) (venta.getPrecioVenta()+(venta.getPrecioVenta()*venta.getIva())));
        ventas.add(venta);
        JOptionPane.showMessageDialog(null, "Se ha agregado una nueva venta.");
}

@Override
    public void consulta() {
        for (int i = 0; i < ventas.size(); i++) {
            JOptionPane.showMessageDialog(null, "Numero de Chasis: " + ventas.get(i).getChasis() + "\n" + "Cliente: " + ventas.get(i).getIdComprador() + "\n" + "Inversion: " + ventas.get(i).getPrecioVenta() + "\n" + "Fecha de Venta: " + ventas.get(i).getFechaVenta() + "\n" + "Total de inversion: " + ventas.get(i).getVentaTotal());
        }
        JOptionPane.showMessageDialog(null, "Para Autos Colon es un placer servirle.");
    }

    @Override
    public void modificar() {

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
    }

}
