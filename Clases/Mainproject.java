/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import Entidades.alqsrc;
import Entidades.edisrc;
import Entidades.perssrc;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class Mainproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean control=true;
        String[] opciones = {"Agregar", "Editar", "Consultar"};
        String[] opciones1 = {"Registro de Edificios","Registro de Personas","Registro de Alquileres","Salir"};
        ArrayList<edisrc> edificios = new ArrayList();
        ArrayList<perssrc> personas = new ArrayList();
        ArrayList<alqsrc> alquileres = new ArrayList();
        while (control==true) { 
            int opcion = JOptionPane.showOptionDialog(null, "Bienes Raices El Encanto", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones1, "Consultar");
            switch (opcion) {      
            case 0:
                 int opcion1 = JOptionPane.showOptionDialog(null, "Registro de Edificios", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                switch (opcion1) {
                    case 0:
                        edisrc edificio = new edisrc();
                        edificio.setNumero_ID(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ID: ")));
                        edificio.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Edificio: "));
                        edificio.setArea_construccion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el area de construccion: ")));
                        edificios.add(edificio);
                       
                        break;
                    case 1:
                        String[] ediciones = {"ID", "Nombre", "Area"};
                        int editar=JOptionPane.showOptionDialog(null, "Editables", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "ID");
                        switch (editar) {
                            case 0:
                                Integer busqueda0=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_id=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo ID: "));
                                for (int i = 0; i < edificios.size();i++) {
                                    if (busqueda0 == null ? edificios.get(i).getNumero_ID() == null : busqueda0.equals(edificios.get(i).getNumero_ID())) {
                                        edificios.get(i).setNumero_ID(nuevo_id);
                                        break;
                                    } 
                               }
                                
                                break;
                            case 1:
                                String busqueda1=JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                                String nuevo_nombre=JOptionPane.showInputDialog(null,"Ingrese el nuevo nombre: ");
                                for (int i = 0; i < edificios.size();i++) {
                                    if (busqueda1 == null ? edificios.get(i).getNombre() == null : busqueda1.equals(edificios.get(i).getNombre())) {
                                        edificios.get(i).setNombre(nuevo_nombre);
                                        break;
                                    }
                               }
                                break;
                            case 2:
                                Integer busqueda2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_area=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de area: "));
                                for (int i = 0; i < edificios.size();i++) {
                                    if (busqueda2 == null ? edificios.get(i).getArea_construccion() == null : busqueda2.equals(edificios.get(i).getArea_construccion())) {
                                        edificios.get(i).setArea_construccion(nuevo_area);
                                        break;
                                    } 
                               }
                                
                                break;
                        }
                        
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, edificios);
                        break;
                }
                break;
            case 1:
                 int opcion2 = JOptionPane.showOptionDialog(null, "Registro de Personas", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                switch (opcion2) {
                    case 0:
                        perssrc persona = new perssrc();
                        persona.setNumero_ID(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero ID: ")));
                        persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre de la persona: "));
                        persona.setNumero_telefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero telefonico: ")));
                        persona.setCorreo(JOptionPane.showInputDialog("Ingrese el correo electronico: "));
                        personas.add(persona);
                        break;
                    case 1:
                        String[] ediciones = {"ID", "Nombre", "Telefono","Correo"};
                        int editar=JOptionPane.showOptionDialog(null, "Editables", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "ID");
                        switch (editar) {
                            case 0:
                                Integer busqueda0=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_id=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo ID: "));
                                for (int i = 0; i < personas.size();i++) {
                                    if (busqueda0 == null ? personas.get(i).getNumero_ID() == null : busqueda0.equals(personas.get(i).getNumero_ID())) {
                                        personas.get(i).setNumero_ID(nuevo_id);
                                        break;
                                    } 
                               }
                                
                                break;
                            case 1:
                                String busqueda1=JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                                String nuevo_nombre=JOptionPane.showInputDialog(null,"Ingrese el nuevo nombre: ");
                                for (int i = 0; i < personas.size();i++) {
                                    if (busqueda1 == null ? personas.get(i).getNombre() == null : busqueda1.equals(personas.get(i).getNombre())) {
                                        personas.get(i).setNombre(nuevo_nombre);
                                        break;
                                    }
                               }
                                break;
                            case 2:
                                Integer busqueda2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_area=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo numero telefonico: "));
                                for (int i = 0; i < personas.size();i++) {
                                    if (busqueda2 == null ? personas.get(i).getNumero_telefono() == null : busqueda2.equals(personas.get(i).getNumero_telefono())) {
                                        personas.get(i).setNumero_telefono(nuevo_area);
                                        break;
                                    } 
                               }
                                
                                break;
                            case 3:
                                String busqueda3=JOptionPane.showInputDialog(null, "Ingrese su busqueda: ");
                                String nuevo_correo=JOptionPane.showInputDialog(null,"Ingrese el nuevo correo: ");
                                for (int i = 0; i < personas.size();i++) {
                                    if (busqueda3 == null ? personas.get(i).getCorreo() == null : busqueda3.equals(personas.get(i).getCorreo())) {
                                        personas.get(i).setCorreo(nuevo_correo);
                                        break;
                                    }
                               }
                                break;
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, personas);
                        break;
                }
                break;
            case 2:
                 int opcion3 = JOptionPane.showOptionDialog(null, "Registro de Alquileres", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                switch (opcion3) {
                    case 0:
                        alqsrc alquiler = new alqsrc();
                        alquiler.setID_edificio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de edificio: ")));
                        alquiler.setID_inquilino(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de inquilino: ")));
                        alquiler.setNumero_contrato(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de contrato: ")));
                        alquiler.setFecha_inicio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de inicio: ")));
                        alquiler.setVencimiento(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la fecha de vencimiento: ")));
                        alquiler.setMesualidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto por mensualidad: ")));
                        alquileres.add(alquiler);
                        break;
                    case 1:
                        String[] ediciones = {"ID Edificio", "ID Inquilino", "Contrato","Fecha inicio","Vencimiento","Mensualidad"};
                        int editar=JOptionPane.showOptionDialog(null, "Editables", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, ediciones, "ID");
                        switch (editar) {
                            case 0:
                                Integer busqueda0=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_id=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo ID: "));
                                for (int i = 0; i < alquileres.size();i++) {
                                    if (busqueda0 == null ? alquileres.get(i).getID_edificio() == null : busqueda0.equals(alquileres.get(i).getID_edificio())) {
                                        alquileres.get(i).setID_edificio(nuevo_id);
                                        break;
                                    } 
                               }
                                break;
                            case 1:
                                Integer busqueda1=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_idi=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo ID: "));
                                for (int i = 0; i < alquileres.size();i++) {
                                    if (busqueda1 == null ? alquileres.get(i).getID_inquilino() == null : busqueda1.equals(alquileres.get(i).getID_inquilino())) {
                                        alquileres.get(i).setID_inquilino(nuevo_idi);
                                        break;
                                    } 
                               }
                                break;
                            case 2:
                                Integer busqueda2=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_contrato=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el nuevo numero de contrato: "));
                                for (int i = 0; i < alquileres.size();i++) {
                                    if (busqueda2 == null ? alquileres.get(i).getNumero_contrato() == null : busqueda2.equals(alquileres.get(i).getNumero_contrato())) {
                                        alquileres.get(i).setNumero_contrato(nuevo_contrato);
                                        break;
                                    } 
                               }
                                break;
                            case 3:
                                Integer busqueda3=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_inicio=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nueva fecha de inicio: "));
                                for (int i = 0; i < alquileres.size();i++) {
                                    if (busqueda3 == null ? alquileres.get(i).getFecha_inicio() == null : busqueda3.equals(alquileres.get(i).getFecha_inicio())) {
                                        alquileres.get(i).setFecha_inicio(nuevo_inicio);
                                        break;
                                    } 
                               }
                                break;
                            case 4:
                                Integer busqueda4=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_venc=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nueva fecha de vencimiento: "));
                                for (int i = 0; i < alquileres.size();i++) {
                                    if (busqueda4 == null ? alquileres.get(i).getVencimiento() == null : busqueda4.equals(alquileres.get(i).getVencimiento())) {
                                        alquileres.get(i).setVencimiento(nuevo_venc);
                                        break;
                                    } 
                               }
                                break;
                            case 5:
                                Integer busqueda5=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su busqueda: "));
                                Integer nuevo_mens=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese la nueva fecha de vencimiento: "));
                                for (int i = 0; i < alquileres.size();i++) {
                                    if (busqueda5 == null ? alquileres.get(i).getMesualidad() == null : busqueda5.equals(alquileres.get(i).getMesualidad())) {
                                        alquileres.get(i).setMesualidad(nuevo_mens);
                                        break;
                                    } 
                               }
                                break;
                        }
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, alquileres);
                        break;
                }
                break;
            case 3:
                control=false;
                break;
        }
        
        }
        
   
    }
    
}
