/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class MenuController {
    public void menu(){
        boolean control=true;
        String[] opciones = {"Agregar", "Modificar", "Consultar","Salir"};
        CancionControllers cancion = new CancionControllers();
        while (control==true) { 
            int opcion = JOptionPane.showOptionDialog(null, "Spotify"+"\n"+"\n"+"\n", "Seleccionar",0, JOptionPane.QUESTION_MESSAGE, null, opciones, "Consultar");
            switch (opcion) {      
            case 0:
                cancion.agregar();
                JOptionPane.showMessageDialog(null, "Agregado con exito");
                break;
            case 1:
                cancion.editar();
                JOptionPane.showMessageDialog(null, "Modificado con exito");
                break;
            case 2:
                cancion.consultar();
                JOptionPane.showMessageDialog(null, "Spotify"+"\n"+"Todo en un solo lugar");
                break;
            case 3:
                control=false;
                break;
        }
        }
    }
}
