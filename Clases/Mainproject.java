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
                        edificio.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del Edificio: "));
                        edificio.setArea_construccion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el area de construccion: ")));
                        edificios.add(edificio);
                       
                        break;
                    case 1:
                        
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
                        persona.setNombre(JOptionPane.showInputDialog("Ingrese el nombre de la persona: "));
                        persona.setNumero_telefono(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero telefonico: ")));
                        persona.setCorreo(JOptionPane.showInputDialog("Ingrese el correo electronico: "));
                        personas.add(persona);
                        break;
                    case 1:
                        
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
