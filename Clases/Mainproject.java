/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Clases;

import Controllers.AlquileresController;
import Controllers.EdificiosController;
import Controllers.PersonasController;
import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class Mainproject{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean control=true;
        String[] opciones = {"Agregar", "Editar", "Consultar"};
        String[] opciones1 = {"Registro de Edificios","Registro de Personas","Registro de Alquileres","Salir"};
        EdificiosController edificio = new EdificiosController();
        PersonasController persona =  new PersonasController();
        AlquileresController alquiler = new AlquileresController();
        
        
        while (control==true) { 
            int opcion = JOptionPane.showOptionDialog(null, "Bienes Raices El Encanto", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones1, "Consultar");
            switch (opcion) {      
            case 0:
                 int opcion1 = JOptionPane.showOptionDialog(null, "Registro de Edificios", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                switch (opcion1) {
                    case 0:
                        edificio.agregar();
                        break;
                    case 1:
                        edificio.editar();
                        break;
                    case 2:
                        edificio.consultar();
                      break;  
                }
                break;
            case 1:
                 int opcion2 = JOptionPane.showOptionDialog(null, "Registro de Personas", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                switch (opcion2) {
                    case 0:
                        persona.agregar();
                        break;
                    case 1:
                        persona.editar();
                        break;
                    case 2:
                        persona.consultar();
                        break;
                }
                break;
            case 2:
                 int opcion3 = JOptionPane.showOptionDialog(null, "Registro de Alquileres", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
                switch (opcion3) {
                    case 0:
                        alquiler.agregar();
                        break;
                    case 1:
                        alquiler.editar();
                        break;
                    case 2:
                        alquiler.consultar();
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
