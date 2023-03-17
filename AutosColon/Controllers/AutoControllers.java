package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Autos;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AutoControllers implements Crudinterfaces {

    private static ArrayList<Autos> autos = new ArrayList();
    
    

    @Override
    public void nuevo() {
        Autos auto = new Autos();
        auto.setNumeroChasis(JOptionPane.showInputDialog("Ingrese el numero de chasis: "));
        auto.setMarca(JOptionPane.showInputDialog("Ingrese la marca: "));
        auto.setEstilo(JOptionPane.showInputDialog("Ingrese el estilo: "));
        auto.setModelo(JOptionPane.showInputDialog("Ingrese el modelo: "));
        auto.setColor(JOptionPane.showInputDialog("Ingrese el color: "));
        auto.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio: ")));
        auto.setDispo(true);
        autos.add(auto);
        JOptionPane.showMessageDialog(null, "Se ha agregado un nuevo vehiculo.");
    }

    @Override
    public void consulta() {
        for (int i = 0; i < autos.size(); i++) {
            JOptionPane.showMessageDialog(null, "Numero de Chasis: " + autos.get(i).getNumeroChasis() + "\n" + "Marca" + autos.get(i).getMarca() + "\n" + "Estilo: " + autos.get(i).getEstilo() + "\n" + "Modelo: " + autos.get(i).getModelo() + "\n" + "Color: " + autos.get(i).getColor() + "\n" + "Precio: " + autos.get(i).getPrecio());
        }
        JOptionPane.showMessageDialog(null, "Para Autos Colon es un placer servirle.");

    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero Chasis", "Marca", "Estilo", "Modelo", "Color", "Precio"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                String busqueda0 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String chasisnuevo = JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de chasis: ");
                for (int i = 0; i < autos.size(); i++) {
                    if (busqueda0 == null ? autos.get(i).getNumeroChasis() == null : busqueda0.equals(autos.get(i).getNumeroChasis())) {
                        autos.get(i).setNumeroChasis(chasisnuevo);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevomarca = JOptionPane.showInputDialog(null, "Ingrese la nueva marca: ");
                for (int i = 0; i < autos.size(); i++) {
                    if (busqueda1 == null ? autos.get(i).getMarca() == null : busqueda1.equals(autos.get(i).getMarca())) {
                        autos.get(i).setMarca(nuevomarca);
                        break;
                    }
                }
                break;
            case 2:
                String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoestilo = JOptionPane.showInputDialog(null, "Ingrese el nuevo estilo: ");
                for (int i = 0; i < autos.size(); i++) {
                    if (busqueda2 == null ? autos.get(i).getEstilo() == null : busqueda2.equals(autos.get(i).getEstilo())) {
                        autos.get(i).setEstilo(nuevoestilo);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevomodelo = JOptionPane.showInputDialog(null, "Ingrese el nuevo modelo: ");
                for (int i = 0; i < autos.size(); i++) {
                    if (busqueda3 == null ? autos.get(i).getModelo() == null : busqueda3.equals(autos.get(i).getModelo())) {
                        autos.get(i).setModelo(nuevomodelo);
                        break;
                    }
                }
                break;
            case 4:
                String busqueda4 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevocolor = JOptionPane.showInputDialog(null, "Ingrese el nuevo color: ");
                for (int i = 0; i < autos.size(); i++) {
                    if (busqueda4 == null ? autos.get(i).getColor() == null : busqueda4.equals(autos.get(i).getColor())) {
                        autos.get(i).setColor(nuevocolor);
                        break;
                    }
                }
                break;
            case 5:
                Integer busqueda5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevoprecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo precio: "));
                for (int i = 0; i < autos.size(); i++) {
                    if (busqueda5 == autos.get(i).getPrecio()) {
                        autos.get(i).setPrecio(nuevoprecio);
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
        for (int i = 0; i < autos.size(); i++) {
            if (autos.get(i).isDispo()==true){
               if (busqueda6 == null ? autos.get(i).getNumeroChasis() == null : busqueda6.equals(autos.get(i).getNumeroChasis())) {
                autos.remove(i);
                break;
            } 
            JOptionPane.showMessageDialog(null, "Se ha eliminado correctamente");
            }else{
                JOptionPane.showMessageDialog(null, "El vehiculo fue vendido");
            }
        }
        

    }

    public ArrayList<Autos> getAutos() {
        return autos;
    }

    public void setAutos(ArrayList<Autos> autos) {
        this.autos = autos;
    }

    @Override
    public void disponibilidad() {
        
    }

}
