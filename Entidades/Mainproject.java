/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entidades;

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
        while (control==true) { 
            Integer opcion=Integer.parseInt(JOptionPane.showInputDialog("Bienes Raices El Encanto"+"\n"+"1-Registro de Edificios"+"\n"+"2-Registro de Personas"+"\n"+"3-Registro de Alquileres"+"\n"+"4-Salir"));
            switch (opcion) {      
            case 1:
                Integer opcion1=Integer.parseInt(JOptionPane.showInputDialog("Registro de Edificios"+"\n"+"1-Agregar"+"\n"+"2-Editar"+"\n"+"3-Consultar"));
                switch (opcion1) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                }
                break;
            case 2:
                Integer opcion2=Integer.parseInt(JOptionPane.showInputDialog("Registro de Personas"+"\n"+"1-Agregar"+"\n"+"2-Editar"+"\n"+"3-Consultar"));
                switch (opcion2) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                }
                break;
            case 3:
                Integer opcion3=Integer.parseInt(JOptionPane.showInputDialog("Registro de Alquileres"+"\n"+"1-Agregar"+"\n"+"2-Editar"+"\n"+"3-Consultar"));
                switch (opcion3) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                }
                break;
            case 4:
                control=false;
                break;
        }
        
        }
   
    }
    
}
