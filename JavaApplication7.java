/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication7;

import javax.swing.JOptionPane;

/**
 *
 * @author hhern
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Integer dia=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de dia:"));
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null, "El dia seleccionado es domingo");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El dia seleccionado es lunes");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion invalida");
        }
        
    }
    
}

