package Controllers;

import Crudinterfaces.Crudinterfaces;
import Plantillas.Personas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PersonaControllers implements Crudinterfaces {

    ArrayList<Personas> personas = new ArrayList();

    @Override
    public void nuevo() {
        Personas persona = new Personas();
        persona.setNumeroId(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion: ")));
        persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre: "));
        persona.setTelefono(JOptionPane.showInputDialog("Ingrese el numero telefonico: "));
        persona.setCorreo(JOptionPane.showInputDialog("Ingrese el correo: "));
        personas.add(persona);
    }

    @Override
    public void consulta() {
        for (int i = 0; i < personas.size(); i++) {
            JOptionPane.showMessageDialog(null, "Numero de Identificacion: " + personas.get(i).getNumeroId() + "\n" + "Nombre: " + personas.get(i).getNombre() + "\n" + "Numero de telefono: " + personas.get(i).getTelefono() + "\n" + "Correo: " + personas.get(i).getCorreo());
        }
    }

    @Override
    public void modificar() {
        String[] ediciones = {"Numero de Identificacion", "Nombre", "Telefono", "Correo"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "Numero Chasis");
        switch (editar) {
            case 0:
                Integer busqueda0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevoid = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva identidicacion: "));
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda0 == personas.get(i).getNumeroId()) {
                        personas.get(i).setNumeroId(nuevoid);
                        break;
                    }
                }
                break;
            case 1:
                String busqueda1 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevomarca = JOptionPane.showInputDialog(null, "Ingrese el nuevo nombre: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda1 == null ? personas.get(i).getNombre() == null : busqueda1.equals(personas.get(i).getNombre())) {
                        personas.get(i).setNombre(nuevomarca);
                        break;
                    }
                }
                break;
            case 2:
                String busqueda2 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevoestilo = JOptionPane.showInputDialog(null, "Ingrese el nuevo telefono: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda2 == null ? personas.get(i).getTelefono() == null : busqueda2.equals(personas.get(i).getTelefono())) {
                        personas.get(i).setTelefono(nuevoestilo);
                        break;
                    }
                }
                break;
            case 3:
                String busqueda3 = JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                String nuevomodelo = JOptionPane.showInputDialog(null, "Ingrese el nuevo Correo: ");
                for (int i = 0; i < personas.size(); i++) {
                    if (busqueda3 == null ? personas.get(i).getCorreo() == null : busqueda3.equals(personas.get(i).getCorreo())) {
                        personas.get(i).setCorreo(nuevomodelo);
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void eliminar() {
        Integer busqueda6 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de identificacion a eliminar: "));
        for (int i = 0; i < personas.size(); i++) {
            if (busqueda6 == personas.get(i).getNumeroId()) {
                personas.remove(i);
                break;
            }
        }
    }

}