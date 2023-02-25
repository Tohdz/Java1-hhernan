/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Crudinterface.Crudinterface;
import Entidades.alqsrc;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class AlquileresController implements Crudinterface {

    ArrayList<alqsrc> alquileres = new ArrayList();

    @Override
    public void agregar() {
        alqsrc alquiler = new alqsrc();
        alquiler.setID_edificio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de edificio: ")));
        alquiler.setID_inquilino(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de inquilino: ")));
        alquiler.setNumero_contrato(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de contrato: ")));
        alquiler.setFecha_inicio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de inicio: ")));
        alquiler.setVencimiento(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de vencimiento: ")));
        alquiler.setMesualidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto por mensualidad: ")));
        alquileres.add(alquiler);
    }

    @Override
    public void editar() {
        String[] ediciones = {"ID Edificio", "ID Inquilino", "Contrato", "Fecha inicio", "Vencimiento", "Mensualidad"};
        int editar = JOptionPane.showOptionDialog(null, "Editables", "Seleccionar", 0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "ID");
        switch (editar) {
            case 0:
                Integer busqueda0 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo ID: "));
                for (int i = 0; i < alquileres.size(); i++) {
                    if (busqueda0 == null ? alquileres.get(i).getID_edificio() == null : busqueda0.equals(alquileres.get(i).getID_edificio())) {
                        alquileres.get(i).setID_edificio(nuevo_id);
                        break;
                    }
                }
                break;
            case 1:
                Integer busqueda1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_idi = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo ID: "));
                for (int i = 0; i < alquileres.size(); i++) {
                    if (busqueda1 == null ? alquileres.get(i).getID_inquilino() == null : busqueda1.equals(alquileres.get(i).getID_inquilino())) {
                        alquileres.get(i).setID_inquilino(nuevo_idi);
                        break;
                    }
                }
                break;
            case 2:
                Integer busqueda2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_contrato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el nuevo numero de contrato: "));
                for (int i = 0; i < alquileres.size(); i++) {
                    if (busqueda2 == null ? alquileres.get(i).getNumero_contrato() == null : busqueda2.equals(alquileres.get(i).getNumero_contrato())) {
                        alquileres.get(i).setNumero_contrato(nuevo_contrato);
                        break;
                    }
                }
                break;
            case 3:
                Integer busqueda3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva fecha de inicio: "));
                for (int i = 0; i < alquileres.size(); i++) {
                    if (busqueda3 == null ? alquileres.get(i).getFecha_inicio() == null : busqueda3.equals(alquileres.get(i).getFecha_inicio())) {
                        alquileres.get(i).setFecha_inicio(nuevo_inicio);
                        break;
                    }
                }
                break;
            case 4:
                Integer busqueda4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_venc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva fecha de vencimiento: "));
                for (int i = 0; i < alquileres.size(); i++) {
                    if (busqueda4 == null ? alquileres.get(i).getVencimiento() == null : busqueda4.equals(alquileres.get(i).getVencimiento())) {
                        alquileres.get(i).setVencimiento(nuevo_venc);
                        break;
                    }
                }
                break;
            case 5:
                Integer busqueda5 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                Integer nuevo_mens = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la nueva fecha de vencimiento: "));
                for (int i = 0; i < alquileres.size(); i++) {
                    if (busqueda5 == null ? alquileres.get(i).getMesualidad() == null : busqueda5.equals(alquileres.get(i).getMesualidad())) {
                        alquileres.get(i).setMesualidad(nuevo_mens);
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void consultar() {
        for (int i = 0; i < alquileres.size(); i++) {
            JOptionPane.showMessageDialog(null, "ID Edificio: " + alquileres.get(i).getID_edificio() + "\n" + "ID Inquilino" + alquileres.get(i).getID_inquilino() + "\n" + "Numero de contrato: " + alquileres.get(i).getNumero_contrato() + "\n" + "Fecha de Inicio: " + alquileres.get(i).getFecha_inicio() + "\n" + "Fecha de Vencimiento: " + alquileres.get(i).getVencimiento() + "\n" + "Mensualidad: " + alquileres.get(i).getMesualidad());
        }
    }
}
    
